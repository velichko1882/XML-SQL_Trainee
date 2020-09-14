package by.epamlab.manually.classes.extention;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Fee {

    @XmlAttribute(name = "TaxCode", required = true)
    private String taxCode;

    @XmlAttribute(name = "Amount", required = true)
    private String amount;

    @XmlAttribute(name = "CurrencyCode", required = true)
    private String currencyCode;

    public Fee() {
    }

    public Fee(String taxCode, String amount, String currencyCode) {
        this.taxCode = taxCode;
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fee{");
        sb.append("taxCode='").append(taxCode).append('\'');
        sb.append(", amount='").append(amount).append('\'');
        sb.append(", currencyCode='").append(currencyCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
