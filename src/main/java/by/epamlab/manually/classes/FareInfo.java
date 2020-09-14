package by.epamlab.manually.classes;

import by.epamlab.manually.classes.extention.Extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class FareInfo {

    @XmlElement(name = "DepartureDate")
    private String departureDate;

    @XmlElement(name = "FareReference")
    private String fareReference;

    @XmlElement(name = "Extension")
    private Extension extension;

    public FareInfo() {
    }

    public FareInfo(String departureDate, String fareReference, Extension extension) {
        this.departureDate = departureDate;
        this.fareReference = fareReference;
        this.extension = extension;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getFareReference() {
        return fareReference;
    }

    public void setFareReference(String fareReference) {
        this.fareReference = fareReference;
    }

    public Extension getExtension() {
        return extension;
    }

    public void setExtension(Extension extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FareInfo{");
        sb.append("departureDate='").append(departureDate).append('\'');
        sb.append(", fareReference='").append(fareReference).append('\'');
        sb.append(", extension=").append(extension);
        sb.append('}');
        return sb.toString();
    }
}
