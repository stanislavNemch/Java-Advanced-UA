package Lesson_7.Exercise_3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

class RegionBuilder {
    private final Document doc;

    public RegionBuilder(Document doc) {
        this.doc = doc;
    }

    public Element createCity(String size, String name) {
        Element city = doc.createElement("city");
        city.setAttribute("size", size);
        city.appendChild(doc.createTextNode(name));
        return city;
    }

    public Element createStreet(String name) {
        Element street = doc.createElement("street");
        street.appendChild(doc.createTextNode(name));
        return street;
    }

    public Element createHouse(String number) {
        Element house = doc.createElement("house");
        house.appendChild(doc.createTextNode(number));
        return house;
    }

    public Element createRegion(Element city, Element street, Element house) {
        Element region = doc.createElement("region");
        region.appendChild(city);
        region.appendChild(street);
        region.appendChild(house);
        return region;
    }
}
