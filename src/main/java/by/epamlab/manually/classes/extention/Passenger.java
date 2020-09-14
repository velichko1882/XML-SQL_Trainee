package by.epamlab.manually.classes.extention;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Passenger {

    @XmlAttribute(name = "PassengerCode", required = true)
    private String passengerCode;

    @XmlAttribute(name = "PassengerReference", required = true)
    private int passengerReference;

    @XmlAttribute(name = "PassengerAge", required = true)
    private int passengerAge;

    @XmlElement(name = "RemoteSystemPTCs")
    private RemoteSystemPTCs remoteSystemPTCs;

    public Passenger() {
    }

    public Passenger(String passengerCode, int passengerReference, int passengerAge, RemoteSystemPTCs remoteSystemPTCs) {
        this.passengerCode = passengerCode;
        this.passengerReference = passengerReference;
        this.passengerAge = passengerAge;
        this.remoteSystemPTCs = remoteSystemPTCs;
    }

    public String getPassengerCode() {
        return passengerCode;
    }

    public void setPassengerCode(String passengerCode) {
        this.passengerCode = passengerCode;
    }

    public int getPassengerReference() {
        return passengerReference;
    }

    public void setPassengerReference(int passengerReference) {
        this.passengerReference = passengerReference;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public RemoteSystemPTCs getRemoteSystemPTCs() {
        return remoteSystemPTCs;
    }

    public void setRemoteSystemPTCs(RemoteSystemPTCs remoteSystemPTCs) {
        this.remoteSystemPTCs = remoteSystemPTCs;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Passenger{");
        sb.append("passengerCode='").append(passengerCode).append('\'');
        sb.append(", passengerReference=").append(passengerReference);
        sb.append(", passengerAge=").append(passengerAge);
        sb.append(", remoteSystemPTCs=").append(remoteSystemPTCs);
        sb.append('}');
        return sb.toString();
    }
}
