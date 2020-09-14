package by.epamlab.manually.classes.extention;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Tax {

    @XmlAttribute(name = "Amount", required = true)
    private double amount;

    @XmlAttribute(name = "CurrencyCode", required = true)
    private String currencyCode;

    @XmlAttribute(name = "TaxCode", required = true)
    private String taxCode;

    public Tax() {
    }

    public Tax(double amount, String currencyCode, String taxCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
        this.taxCode = taxCode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tax{");
        sb.append("amount=").append(amount);
        sb.append(", currencyCode='").append(currencyCode).append('\'');
        sb.append(", taxCode='").append(taxCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
