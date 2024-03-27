package hcmute.DAO;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import JPAConfig.JPAConfig;
import hcmute.entity.Book;
import hcmute.entity.Rating;


public class BookDAOImpl implements IBookDAO{
	@Override
	public void insert(Book book) {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			enma.persist(book);
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
	public void update(Book book) {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			enma.merge(book);
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
			Book Book = enma.find(Book.class, id);
			if (Book != null) {
				enma.remove(Book);
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
	public List<Book> findAll() {
		EntityManager enma = JPAConfig.getEntityManager();
		TypedQuery<Book> query = enma.createNamedQuery("Book.findAll", Book.class);
		return query.getResultList();
	}

	@Override
	public List<Book> findAll(int page, int pagesize) {
		EntityManager enma = JPAConfig.getEntityManager();
		TypedQuery<Book> query = enma.createNamedQuery("Book.findAll", Book.class);
		query.setFirstResult(page*pagesize);
		query.setMaxResults(pagesize);		
		return query.getResultList();
	}

	@Override
	public Book findByID(int id) {
		EntityManager enma = JPAConfig.getEntityManager();
		Book book = enma.find(Book.class, id);
		enma.close();
		return book;
	}

	

	@Override
	public int count() {
		EntityManager enma = JPAConfig.getEntityManager();
		String jpql = "select count(b) from Book b";
		Query query = enma.createQuery(jpql);		
		return ((Long)query.getSingleResult()).intValue();	
	}

	@Override
	public List<Book> findByAuthorName(String name) {
		
		return null;
	}

	@Override
	public List<Book> findByRating() {
	    EntityManager entityManager = JPAConfig.getEntityManager();
	    String jpql = "SELECT b FROM Book b";
	    TypedQuery<Book> query = entityManager.createQuery(jpql, Book.class);
	    List<Book> books = query.getResultList();    
	    for (Book book : books) {
	        book.setAvgRating(calculateAverageRating(book.getRatings()));
	    } 
	    return books;
	}
	@Override
	public double calculateAverageRating(List<Rating> ratings) {
	    if (ratings == null || ratings.isEmpty()) {
	        return 0.0; // Trường hợp không có đánh giá hoặc danh sách trống
	    }
	    
	    double sum = 0.0;
	    for (Rating rating : ratings) {
	        if (rating != null) { // Kiểm tra xem đánh giá có tồn tại
	            sum += rating.getRating();
	        }
	    }
	    
	    return sum / ratings.size();
	}

	public static void main(String[] args) {
		IBookDAO books = new BookDAOImpl();
//		List<Book> list = books.findByRating();
//		 for (Book book : list) {
//		        System.out.println(book.getTitle() +" "+ book.getAvgRating());
//		    }
		System.out.println(books.findByID(1).getIsbn());
	}
}
