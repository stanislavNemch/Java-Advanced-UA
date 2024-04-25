package Lesson_7.Exercise_4;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "country")
public class RegionBuilderJAXB {
    private List<Region> regions;

    public RegionBuilderJAXB() {
    }

    public RegionBuilderJAXB(List<Region> regions) {
        this.regions = regions;
    }

    @XmlElement(name = "region")
    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    @Override
    public String toString() {
        return "RegionBuilderJAXB {" +
                "regions=" + regions +
                '}';
    }
}