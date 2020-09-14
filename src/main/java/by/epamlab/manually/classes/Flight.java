package by.epamlab.manually.classes;

import by.epamlab.manually.classes.extention.Extension;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Flight {

    @XmlAttribute(name = "DepartureDateTime", required = true)
    private String departureDateTime;
    @XmlAttribute(name = "ArrivalDateTime", required = true)
    private String arrivalDateTime;
    @XmlAttribute(name = "BookCode", required = true)
    private String bookCode;
    @XmlAttribute(name = "StopQuantity", required = true)
    private int stopQuantity;
    @XmlAttribute(name = "RPH", required = true)
    private int rph;
    @XmlAttribute(name = "FlightNumber", required = true)
    private String flightNumber;
    @XmlAttribute(name = "NumberInParty", required = true)
    private int numberInParty;

    @XmlElement(name = "Extension")
    private Extension extension;

    public Flight() {
    }

    public Flight(String departureDateTime, String arrivalDateTime,
                  String bookCode, int stopQuantity, int rph, String flightNumber,
                  int numberInParty, Extension extension) {
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.bookCode = bookCode;
        this.stopQuantity = stopQuantity;
        this.rph = rph;
        this.flightNumber = flightNumber;
        this.numberInParty = numberInParty;
        this.extension = extension;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public int getStopQuantity() {
        return stopQuantity;
    }

    public void setStopQuantity(int stopQuantity) {
        this.stopQuantity = stopQuantity;
    }

    public int getRph() {
        return rph;
    }

    public void setRph(int rph) {
        this.rph = rph;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getNumberInParty() {
        return numberInParty;
    }

    public void setNumberInParty(int numberInParty) {
        this.numberInParty = numberInParty;
    }

    public Extension getExtension() {
        return extension;
    }

    public void setExtension(Extension extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flight{");
        sb.append("DepartureDateTime='").append(departureDateTime).append('\'');
        sb.append(", ArrivalDateTime='").append(arrivalDateTime).append('\'');
        sb.append(", BookCode='").append(bookCode).append('\'');
        sb.append(", StopQuantity=").append(stopQuantity);
        sb.append(", RPH=").append(rph);
        sb.append(", FlightNumber=").append(flightNumber);
        sb.append(", NumberInParty=").append(numberInParty);
        sb.append(", Extension=").append(extension);
        sb.append('}');
        return sb.toString();
    }
}
