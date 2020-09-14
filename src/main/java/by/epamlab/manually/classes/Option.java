package by.epamlab.manually.classes;

import by.epamlab.manually.classes.extention.Extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Option {

    @XmlElement(name = "Flight")
    private List<Flight> flights = new ArrayList<>();

    @XmlElement(name = "Extension")
    private Extension extension;

    public Option() {
    }

    public Option(Extension extension) {
        this.extension = extension;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public boolean addFlight(Flight flight) {
        return flights.add(flight);
    }

    public Extension getExtension() {
        return extension;
    }

    public void setExtension(Extension extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Option{");
        sb.append(flights);
        sb.append(", extension=").append(extension);
        sb.append('}');
        return sb.toString();
    }
}
