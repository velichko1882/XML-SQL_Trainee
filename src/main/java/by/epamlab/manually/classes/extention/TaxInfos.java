package by.epamlab.manually.classes.extention;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class TaxInfos {

    @XmlElement(name = "TaxInfo")
    private List<TaxInfo> taxInfos = new ArrayList<>();

    public TaxInfos() {
    }

    public List<TaxInfo> getTaxInfos() {
        return taxInfos;
    }

    public boolean addTaxInfo(TaxInfo taxInfo) {
        return taxInfos.add(taxInfo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TaxInfos{");
        sb.append("taxInfos=").append(taxInfos);
        sb.append('}');
        return sb.toString();
    }
}
