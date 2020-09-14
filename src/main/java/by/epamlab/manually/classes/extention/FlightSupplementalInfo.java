package by.epamlab.manually.classes.extention;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class FlightSupplementalInfo {

    @XmlAttribute(name = "FlyingTime", required = true)
    private String flyingTime;

    public FlightSupplementalInfo() {
    }

    public FlightSupplementalInfo(String flyingTime) {
        this.flyingTime = flyingTime;
    }

    public String getFlyingTime() {
        return flyingTime;
    }

    public void setFlyingTime(String flyingTime) {
        this.flyingTime = flyingTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FlightSupplementalInfo{");
        sb.append("flyingTime='").append(flyingTime).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
