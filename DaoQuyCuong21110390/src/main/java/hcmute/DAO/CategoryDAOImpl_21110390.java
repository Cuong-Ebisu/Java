package hcmute.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import JPAConfig.JPAConfig;
import hcmute.entity.Category;

public class CategoryDAOImpl_21110390 implements ICategoryDAO_21110390{

	@Override
	public List<Category> findAll(int start, int total) {
		EntityManager enma = JPAConfig.getEntityManager();
		String jpql = "SELECT c FROM Category c ORDER BY c.categoryId ASC";
        TypedQuery<Category> query = enma.createQuery(jpql, Category.class);
        query.setFirstResult(start - 1);
        query.setMaxResults(total);
        return query.getResultList();
	}

	@Override
	public int countCategory() {
		EntityManager enma = JPAConfig.getEntityManager();
		String jpql = "select count(c) from Category c";
		Query query = enma.createQuery(jpql);		
		return ((Long)query.getSingleResult()).intValue();
	}

	@Override
	public void insert(Category cate) {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			enma.persist(cate);
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
	public Category findByID(int id) {
		EntityManager enma = JPAConfig.getEntityManager();
		Category cate = enma.find(Category.class, id);
		enma.close();
		return cate;
	}

	@Override
	public void update(Category cate) {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			enma.merge(cate);
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
			Category cate = enma.find(Category.class, id);
			if (cate != null) {
				enma.remove(cate);
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

}
