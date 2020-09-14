package by.epamlab.manually.classes;

import by.epamlab.manually.classes.extention.Extension;
import by.epamlab.manually.classes.extention.Total;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class PricingInfo {

    @XmlAttribute(name = "Source", required = true)
    private String source;

    @XmlElement(name = "Total")
    private Total total;

    @XmlElement(name = "PTCs")
    private PTCs ptCs;

    @XmlElement(name = "FareInfos")
    private FareInfos fareInfos;

    @XmlElement(name = "Extension")
    private Extension extension;

    public PricingInfo() {
    }

    public PricingInfo(String source, Total total, PTCs ptCs, FareInfos fareInfos, Extension extension) {
        this.source = source;
        this.total = total;
        this.ptCs = ptCs;
        this.fareInfos = fareInfos;
        this.extension = extension;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public PTCs getPtCs() {
        return ptCs;
    }

    public void setPtCs(PTCs ptCs) {
        this.ptCs = ptCs;
    }

    public FareInfos getFareInfos() {
        return fareInfos;
    }

    public void setFareInfos(FareInfos fareInfos) {
        this.fareInfos = fareInfos;
    }

    public Extension getExtension() {
        return extension;
    }

    public void setExtension(Extension extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PricingInfo{");
        sb.append("source='").append(source).append('\'');
        sb.append(", total=").append(total);
        sb.append(", ptCs=").append(ptCs);
        sb.append(", fareInfos=").append(fareInfos);
        sb.append(", extension=").append(extension);
        sb.append('}');
        return sb.toString();
    }
}
