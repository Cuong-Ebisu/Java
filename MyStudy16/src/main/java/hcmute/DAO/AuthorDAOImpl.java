package hcmute.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import JPAConfig.JPAConfig;
import hcmute.entity.Author;

public class AuthorDAOImpl implements IAuthorDAO{

	@Override
	public List<Author> findAll(int start, int total) {
		EntityManager enma = JPAConfig.getEntityManager();
		String jpql = "SELECT a FROM Author a ORDER BY a.author_id ASC";
        TypedQuery<Author> query = enma.createQuery(jpql, Author.class);
        query.setFirstResult(start - 1);
        query.setMaxResults(total);
        return query.getResultList();
	}

	@Override
	public int countAuthor() {
		EntityManager enma = JPAConfig.getEntityManager();
		String jpql = "select count(a) from Author a";
		Query query = enma.createQuery(jpql);		
		return ((Long)query.getSingleResult()).intValue();
	}
	
}
