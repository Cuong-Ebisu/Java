package hcmute.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import JPAConfig.JPAConfig;
import hcmute.entity.Book;
import hcmute.entity.User;

public class UserDAOImpl implements IUserDAO{

	@Override
	public void insert(User user) {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			enma.persist(user);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
			throw e;
		} finally {
			enma.close();
		}
	}

	@Override
	public void update(User user) {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			enma.merge(user);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
			throw e;
		} finally {
			enma.close();
		}
	}

	@Override
	public void delete(int id) throws Exception {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			User user = enma.find(User.class, id);
			if (user != null) {
				enma.remove(user);
			} else {
				throw new Exception("Not found");
			}
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
			throw e;
		} finally {
			enma.close();
		}
	}

	@Override
	public List<User> findAll() {
		EntityManager enma = JPAConfig.getEntityManager();
		TypedQuery<User> query = enma.createNamedQuery("User.findAll", User.class);
		return query.getResultList();
	}

	@Override
	public List<User> findAll(int page, int pagesize) {
		EntityManager enma = JPAConfig.getEntityManager();
		TypedQuery<User> query = enma.createNamedQuery("User.findAll", User.class);
		query.setFirstResult(page*pagesize);
		query.setMaxResults(pagesize);		
		return query.getResultList();
	}

	@Override
	public User findByID(int id) {
		EntityManager enma = JPAConfig.getEntityManager();
		User user = enma.find(User.class, id);
		enma.close();
		return user;
	}


	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertRegister(User user) {
		
	}

	@Override
	public boolean checkExistUserEmail(String emai) {
		boolean duplicate = false;
		EntityManager entityManager = JPAConfig.getEntityManager();
		 String jpql = "SELECT u FROM User u WHERE u.email = :email";
		    TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
		    query.setParameter("email", emai);		
		    List<User> users = query.getResultList();
		    if (!users.isEmpty()) {
		    	duplicate = true; // The email already exists in the database
		    }  
	    return duplicate;
	}

	@Override
	public User findByEmail(String email) {
	    EntityManager entityManager = JPAConfig.getEntityManager();
	    String jpql = "SELECT u FROM User u WHERE u.email = :email";
	    TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
	    query.setParameter("email", email);
	    User user = query.getSingleResult();
	    entityManager.close();
	    return user;
	}


}
