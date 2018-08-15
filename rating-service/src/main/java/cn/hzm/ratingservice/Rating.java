package cn.hzm.ratingservice;

/**
 * Created by henrypoter on 2018/8/15.
 */
public class Rating {
    private Long id;

    private Long bookId;
    private int stars;

    public Rating(long id , long bookId, int stars) {
        this.id = id;
        this.bookId =bookId;
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

}
