package hcmute.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import JPAConfig.JPAConfig;
import hcmute.entity.Author;


public class AuthorDAOimpl implements IAuthorDAO {

	@Override
	public void insert(Author author) {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			enma.persist(author);
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
	public void update(Author author) {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			enma.merge(author);
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
			Author author = enma.find(Author.class, id);
			if (author != null) {
				enma.remove(author);
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
	public List<Author> findAll() {
		EntityManager enma = JPAConfig.getEntityManager();
		TypedQuery<Author> query = enma.createNamedQuery("Author.findAll", Author.class);
		return query.getResultList();
	}

	@Override
	public List<Author> findAll(int page, int pagesize) {
		EntityManager enma = JPAConfig.getEntityManager();
		TypedQuery<Author> query = enma.createNamedQuery("Author.findAll", Author.class);
		query.setFirstResult(page*pagesize);
		query.setMaxResults(pagesize);		
		return query.getResultList();
	}

	@Override
	public Author findByID(int id) {
		EntityManager enma = JPAConfig.getEntityManager();
		Author author = enma.find(Author.class, id);
		enma.close();
		return author;
	}

	@Override
	public List<Author> findByAuthor() {
		EntityManager enma = JPAConfig.getEntityManager();
		String jpql = "select a.getBooks() from Author a";
		TypedQuery<Author> query = enma.createNamedQuery(jpql, Author.class);
		return query.getResultList();
	}

	@Override
	public int count() {
		EntityManager enma = JPAConfig.getEntityManager();
		String jpql = "select count() from Author a";
		Query query = enma.createQuery(jpql);		
		return ((Long)query.getSingleResult()).intValue();	
	}

}
