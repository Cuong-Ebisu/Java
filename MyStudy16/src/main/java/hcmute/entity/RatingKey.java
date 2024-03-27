package hcmute.entity;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

@Embeddable
public class RatingKey implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3025054906723951936L;
	private Long bookid;
    private Long id;

    public RatingKey() {
        // Constructors
    }

    public RatingKey(Long bookid, Long id) {
        this.bookid = bookid;
        this.id = id;
    }

    // Các getter và setter
    public Long getBookid() {
        return bookid;
    }

    public void setBookid(Long bookid) {
        this.bookid = bookid;
    }

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    // Đảm bảo cung cấp phương thức equals và hashCode tùy chỉnh cho class này.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RatingKey ratingKey = (RatingKey) o;
        return Objects.equals(bookid, ratingKey.bookid) &&
               Objects.equals(id, ratingKey.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookid, id);
    }
}
