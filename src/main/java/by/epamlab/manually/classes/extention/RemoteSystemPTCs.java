package by.epamlab.manually.classes.extention;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class RemoteSystemPTCs {

    @XmlAttribute(name = "PassengerCode", required = true)
    private String passengerCode;

    public RemoteSystemPTCs() {
    }

    public RemoteSystemPTCs(String passengerCode) {
        this.passengerCode = passengerCode;
    }

    public String getPassengerCode() {
        return passengerCode;
    }

    public void setPassengerCode(String passengerCode) {
        this.passengerCode = passengerCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RemoteSystemPTCs{");
        sb.append("passengerCode='").append(passengerCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
