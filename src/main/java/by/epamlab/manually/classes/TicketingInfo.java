package by.epamlab.manually.classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class TicketingInfo {

    @XmlAttribute(name = "TicketType", required = true)
    private String ticketType;

    public TicketingInfo() {
    }

    public TicketingInfo(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TicketingInfo{");
        sb.append("ticketType='").append(ticketType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
