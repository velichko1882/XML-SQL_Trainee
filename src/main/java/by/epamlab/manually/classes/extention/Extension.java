package by.epamlab.manually.classes.extention;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Extension {

    @XmlElement(name = "FlightSupplementalInfo")
    private FlightSupplementalInfo flightSupplementalInfo;

    @XmlElement(name = "BookingClassAvailability")
    private BookingClassAvailability bookingClassAvailability;

    @XmlElement(name = "Eticket")
    private String eticket;

    @XmlElement(name = "TerminalInformation")
    private TerminalInformation terminalInformation;

    @XmlElement(name = "InventorySystem")
    private InventorySystem inventorySystem;

    @XmlElement(name = "Source")
    private String source;

    @XmlElement(name = "Attributes")
    private Attributes attributes;

    @XmlElement(name = "Base")
    private Base base;

    @XmlElement(name = "TaxInfos")
    private TaxInfos taxInfos;

    @XmlElement(name = "FeeInfos")
    private FeeInfos feeInfos;

    @XmlElement(name = "Total")
    private Total total;

    @XmlElement(name = "Segment")
    private List<Segment> segments = new ArrayList<>();

    @XmlElement(name = "Passenger")
    private Passenger passenger;

    @XmlElement(name = "Carrier")
    private String carrier;

    @XmlElement(name = "PricingSystem")
    private String pricingSystem;

    @XmlElement(name = "Provider")
    private Provider provider;

    public Extension() {
    }

    public FlightSupplementalInfo getFlightSupplementalInfo() {
        return flightSupplementalInfo;
    }

    public void setFlightSupplementalInfo(FlightSupplementalInfo flightSupplementalInfo) {
        this.flightSupplementalInfo = flightSupplementalInfo;
    }

    public BookingClassAvailability getBookingClassAvailability() {
        return bookingClassAvailability;
    }

    public void setBookingClassAvailability(BookingClassAvailability bookingClassAvailability) {
        this.bookingClassAvailability = bookingClassAvailability;
    }

    public String getEticket() {
        return eticket;
    }

    public void setEticket(String eticket) {
        this.eticket = eticket;
    }

    public TerminalInformation getTerminalInformation() {
        return terminalInformation;
    }

    public void setTerminalInformation(TerminalInformation terminalInformation) {
        this.terminalInformation = terminalInformation;
    }

    public InventorySystem getInventorySystem() {
        return inventorySystem;
    }

    public void setInventorySystem(InventorySystem inventorySystem) {
        this.inventorySystem = inventorySystem;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public TaxInfos getTaxInfos() {
        return taxInfos;
    }

    public void setTaxInfos(TaxInfos taxInfos) {
        this.taxInfos = taxInfos;
    }

    public FeeInfos getFeeInfos() {
        return feeInfos;
    }

    public void setFeeInfos(FeeInfos feeInfos) {
        this.feeInfos = feeInfos;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public boolean addSegment(Segment segment){
        return segments.add(segment);
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPricingSystem() {
        return pricingSystem;
    }

    public void setPricingSystem(String pricingSystem) {
        this.pricingSystem = pricingSystem;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Extension{");
        sb.append("flightSupplementalInfo=").append(flightSupplementalInfo);
        sb.append(", bookingClassAvailability=").append(bookingClassAvailability);
        sb.append(", eticket='").append(eticket).append('\'');
        sb.append(", terminalInformation=").append(terminalInformation);
        sb.append(", inventorySystem=").append(inventorySystem);
        sb.append(", source='").append(source).append('\'');
        sb.append(", attributes=").append(attributes);
        sb.append(", base=").append(base);
        sb.append(", taxInfos=").append(taxInfos);
        sb.append(", feeInfos=").append(feeInfos);
        sb.append(", total=").append(total);
        sb.append(", segments=").append(segments);
        sb.append(", passenger=").append(passenger);
        sb.append(", carrier='").append(carrier).append('\'');
        sb.append(", pricingSystem='").append(pricingSystem).append('\'');
        sb.append(", provider=").append(provider);
        sb.append('}');
        return sb.toString();
    }
}
