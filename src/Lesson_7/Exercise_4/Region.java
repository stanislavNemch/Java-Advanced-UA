package Lesson_7.Exercise_4;

import jakarta.xml.bind.annotation.*;

@XmlType(propOrder = {"citySize", "street", "house"})
public class Region {
    private CitySize citySize;
    private String street;
    private int house;

    public Region() {
    }

    public Region(String size, String city, String street, int house) {
        this.citySize = new CitySize(size, city);
        this.street = street;
        this.house = house;
    }

    @XmlElement(name = "city")
    public CitySize getCitySize() {
        return citySize;
    }

    public void setCitySize(CitySize citySize) {
        this.citySize = citySize;
    }

    @XmlElement(name = "street")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @XmlElement(name = "house")
    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Region{" +
                "citySize=" + citySize +
                ", street='" + street + '\'' +
                ", house=" + house +
                '}';
    }
}