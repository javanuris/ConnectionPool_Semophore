package domain;

import dao.Identified;

/**
 * Created by User on 09.03.2017.
 */
public class Publisher implements Identified<Integer> {
    private String name;
    private String city;
    private Integer id;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
