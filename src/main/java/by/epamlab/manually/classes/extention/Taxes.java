package by.epamlab.manually.classes.extention;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Taxes {

    @XmlElement(name = "Tax")
    private List<Tax> taxList = new ArrayList<>();

    public Taxes() {
    }

    public List<Tax> getTaxList() {
        return taxList;
    }

    public boolean addTax(Tax tax) {
        return taxList.add(tax);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Taxes{");
        sb.append("taxList=").append(taxList);
        sb.append('}');
        return sb.toString();
    }
}
