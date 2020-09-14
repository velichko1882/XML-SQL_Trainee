package by.epamlab.manually.classes;

import by.epamlab.manually.classes.extention.Extension;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class PTC {

    @XmlAttribute(name = "Source", required = true)
    private String source;

    @XmlElement(name = "PassengerQuantity")
    private PassengerQuantity passengerQuantity;

    @XmlElement(name = "BasisCodes")
    private BasisCodes basisCodes;

    @XmlElement(name = "PassengerFare")
    private PassengerFare passengerFare;

    @XmlElement(name = "Extension")
    private Extension extension;

    public PTC() {
    }

    public PTC(String source, PassengerQuantity passengerQuantity,
               BasisCodes basisCodes, PassengerFare passengerFare, Extension extension) {
        this.source = source;
        this.passengerQuantity = passengerQuantity;
        this.basisCodes = basisCodes;
        this.passengerFare = passengerFare;
        this.extension = extension;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public PassengerQuantity getPassengerQuantity() {
        return passengerQuantity;
    }

    public void setPassengerQuantity(PassengerQuantity passengerQuantity) {
        this.passengerQuantity = passengerQuantity;
    }

    public BasisCodes getBasisCodes() {
        return basisCodes;
    }

    public void setBasisCodes(BasisCodes basisCodes) {
        this.basisCodes = basisCodes;
    }

    public PassengerFare getPassengerFare() {
        return passengerFare;
    }

    public void setPassengerFare(PassengerFare passengerFare) {
        this.passengerFare = passengerFare;
    }

    public Extension getExtension() {
        return extension;
    }

    public void setExtension(Extension extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PTC{");
        sb.append("source='").append(source).append('\'');
        sb.append(", passengerQuantity=").append(passengerQuantity);
        sb.append(", basisCodes=").append(basisCodes);
        sb.append(", passengerFare=").append(passengerFare);
        sb.append(", extension=").append(extension);
        sb.append('}');
        return sb.toString();
    }
}
