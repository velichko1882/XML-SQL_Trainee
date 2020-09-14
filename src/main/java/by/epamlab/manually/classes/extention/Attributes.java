package by.epamlab.manually.classes.extention;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Attributes {

    @XmlAttribute(name = "TripType", required = true)
    private String tripType;

    public Attributes() {
    }

    public Attributes(String tripType) {
        this.tripType = tripType;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Attributes{");
        sb.append("tripType='").append(tripType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
