package hcmute.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import java.util.List;
import JPAConfig.JPAConfig;
import hcmute.Entity.User;


public class UserDAOImpl implements IUserDAO {



	@Override
	public String login(String username, String password) {
		 EntityManager entityManager = JPAConfig.getEntityManager();
		    String uname = null;

		    try {
		        TypedQuery<User> query = entityManager.createQuery(
		                "SELECT u FROM User u WHERE u.uemail = :uemail AND u.upwd = :upwd",
		                User.class);
		        query.setParameter("uemail", username);
		        query.setParameter("upwd", password);

		        List<User> resultList = query.getResultList();

		        if (!resultList.isEmpty()) {
		            uname = resultList.get(0).getUname();
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    } finally {
		        entityManager.close();
		    }

		    return uname;
	}

	@Override
	public String signup(User model) {
		EntityManager entityManager = JPAConfig.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        String status = null;

        try {
            transaction.begin();
            entityManager.persist(model);
            transaction.commit();
            status = "success";
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
            status = "failed";
        } finally {
            entityManager.close();
        }

        return status;
	}

}
