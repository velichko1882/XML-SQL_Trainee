package by.epamlab.manually.classes.extention;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class FeeInfo {

    @XmlAttribute(name = "TaxCode", required = true)
    private String taxCode;

    @XmlAttribute(name = "CurrencyCode", required = true)
    private String currencyCode;

    public FeeInfo() {
    }

    public FeeInfo(String taxCode, String currencyCode) {
        this.taxCode = taxCode;
        this.currencyCode = currencyCode;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FeeInfo{");
        sb.append("taxCode='").append(taxCode).append('\'');
        sb.append(", currencyCode='").append(currencyCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
