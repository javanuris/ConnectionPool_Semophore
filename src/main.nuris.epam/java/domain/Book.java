package domain;

import dao.Identified;

import java.util.Date;

/**
 * Created by User on 09.03.2017.
 */
public class Book implements Identified<Integer> {
    private String name;
    private Date year;
    private int genreId;
    private int authorId;
    private int publicsherId;

    private Integer id;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getPublicsherId() {
        return publicsherId;
    }

    public void setPublicsherId(int publicsherId) {
        this.publicsherId = publicsherId;
    }

    private String isbn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
