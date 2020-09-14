package by.epamlab.manually.classes.extention;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class TaxInfo {

    @XmlAttribute(name = "TaxCode")
    private String taxCode;

    @XmlAttribute(name = "BaseCurrency")
    private String baseCurrency;

    @XmlAttribute(name = "CurrencyCode")
    private String currencyCode;

    public TaxInfo() {
    }

    public TaxInfo(String taxCode, String baseCurrency, String currencyCode) {
        this.taxCode = taxCode;
        this.baseCurrency = baseCurrency;
        this.currencyCode = currencyCode;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TaxInfo{");
        sb.append("taxCode='").append(taxCode).append('\'');
        sb.append(", baseCurrency='").append(baseCurrency).append('\'');
        sb.append(", currencyCode='").append(currencyCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
