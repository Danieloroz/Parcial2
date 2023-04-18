package Problema2.model;

import java.io.Serializable;

public class Mall implements Serializable{
    private Integer id;
    private String mallName;
    private String city;
    private String direction;

    public Mall(String mallName, String city, String direction) {
        this.mallName = mallName;
        this.city = city;
        this.direction = direction;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Mall{" +
                "id=" + id +
                ", mallName='" + mallName + '\'' +
                ", city='" + city + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }
}
