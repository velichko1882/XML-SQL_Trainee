package by.epamlab.manually.classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "Itinerary")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
                        "sequenceNumber",
                        "rph",
                        "itineraryID",
                        "air",
                        "pricingInfo",
                        "ticketingInfo"})
public class Itinerary {

    @XmlAttribute(name = "SequenceNumber", required = true)
    private int sequenceNumber;

    @XmlAttribute(name = "RPH", required = true)
    private int rph;

    @XmlAttribute(name = "ItineraryID", required = true)
    private int itineraryID;

    @XmlElement(name = "Air", required = true)
    private Air air;

    @XmlElement(name = "PricingInfo", required = true)
    private PricingInfo pricingInfo;

    @XmlElement(name = "TicketingInfo", required = true)
    private TicketingInfo ticketingInfo;

    public Itinerary() {
    }

    public Itinerary(int sequenceNumber, int rph, int itineraryID, Air air,
                     PricingInfo pricingInfo, TicketingInfo ticketingInfo) {
        this.sequenceNumber = sequenceNumber;
        this.rph = rph;
        this.itineraryID = itineraryID;
        this.air = air;
        this.pricingInfo = pricingInfo;
        this.ticketingInfo = ticketingInfo;
    }

    public Air getAir() {
        return air;
    }

    public void setAir(Air air) {
        this.air = air;
    }

    public PricingInfo getPricingInfo() {
        return pricingInfo;
    }

    public void setPricingInfo(PricingInfo pricingInfo) {
        this.pricingInfo = pricingInfo;
    }

    public TicketingInfo getTicketingInfo() {
        return ticketingInfo;
    }

    public void setTicketingInfo(TicketingInfo ticketingInfo) {
        this.ticketingInfo = ticketingInfo;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public int getRph() {
        return rph;
    }

    public void setRph(int rph) {
        this.rph = rph;
    }

    public int getItineraryID() {
        return itineraryID;
    }

    public void setItineraryID(int itineraryID) {
        this.itineraryID = itineraryID;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Itinerary:\n{");
        sb.append("SequenceNumber=").append(sequenceNumber);
        sb.append(", RPH=").append(rph);
        sb.append(", ItineraryID=").append(itineraryID);
        sb.append(", \nAir=").append(air);
        sb.append(", \nPricingInfo=").append(pricingInfo);
        sb.append(", \nTicketingInfo=").append(ticketingInfo);
        sb.append('}');
        return sb.toString();
    }
}
