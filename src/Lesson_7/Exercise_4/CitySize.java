package Lesson_7.Exercise_4;

import jakarta.xml.bind.annotation.*;

public class CitySize {
    private String size;
    private String city;

    public CitySize() {
    }

    public CitySize(String size, String city) {
        this.size = size;
        this.city = city;
    }

    @XmlAttribute
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @XmlValue
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "CitySize{" +
                "size='" + size + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}