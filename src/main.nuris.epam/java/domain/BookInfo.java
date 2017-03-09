package domain;

import dao.Identified;

import java.io.InputStream;

/**
 * Created by User on 09.03.2017.
 */
public class BookInfo implements Identified<Integer> {

    private int idBook;
    private int amount;
    private int price;
    private InputStream cover;
    private InputStream electronicVersion;
    private Integer id;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public InputStream getCover() {
        return cover;
    }

    public void setCover(InputStream cover) {
        this.cover = cover;
    }

    public InputStream getElectronicVersion() {
        return electronicVersion;
    }

    public void setElectronicVersion(InputStream electronicVersion) {
        this.electronicVersion = electronicVersion;
    }
}
