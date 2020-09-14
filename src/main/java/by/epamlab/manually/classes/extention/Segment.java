package by.epamlab.manually.classes.extention;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Segment {

    @XmlAttribute(name = "FlightReference", required = true)
    private int flightReference;

    public Segment() {
    }

    public Segment(int flightReference) {
        this.flightReference = flightReference;
    }

    public int getFlightReference() {
        return flightReference;
    }

    public void setFlightReference(int flightReference) {
        this.flightReference = flightReference;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Segment{");
        sb.append("flightReference=").append(flightReference);
        sb.append('}');
        return sb.toString();
    }
}
