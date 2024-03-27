package hcmute.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.EmbeddedId;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "rating")
public class Rating {
    @EmbeddedId
    private RatingKey id;

    @ManyToOne
    @JoinColumn(name = "bookid", insertable = false, updatable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private User user;

    @Column
    private int rating;

    @Column(length = 255)
    private String review_text;

    public Rating() {
        // Constructors
    }

    public Rating(RatingKey id, int rating, String review_text) {
        this.id = id;
        this.rating = rating;
        this.review_text = review_text;
    }

    // Các getter và setter
    public RatingKey getId() {
        return id;
    }

    public void setId(RatingKey id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview_text() {
        return review_text;
    }

    public void setReview_text(String review_text) {
        this.review_text = review_text;
    }
}
