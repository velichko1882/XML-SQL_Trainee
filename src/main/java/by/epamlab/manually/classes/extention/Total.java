package by.epamlab.manually.classes.extention;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Total {

    @XmlAttribute(name = "Amount")
    private double amount;

    @XmlAttribute(name = "CurrencyCode")
    private String currencyCode;

    @XmlElement(name = "Base")
    private Base base;

    @XmlElement(name = "Taxes")
    private Taxes taxes;

    @XmlElement(name = "Fees")
    private Fees fees;

    @XmlElement(name = "Total")
    private Total total;

    @XmlElement(name = "Extension")
    private Extension extension;

    public Total() {
    }

    public Total(double amount, String currencyCode, Base base, Taxes taxes, Fees fees, Total total, Extension extension) {
        this.amount = amount;
        this.currencyCode = currencyCode;
        this.base = base;
        this.taxes = taxes;
        this.fees = fees;
        this.total = total;
        this.extension = extension;
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

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Taxes getTaxes() {
        return taxes;
    }

    public void setTaxes(Taxes taxes) {
        this.taxes = taxes;
    }

    public Fees getFees() {
        return fees;
    }

    public void setFees(Fees fees) {
        this.fees = fees;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public Extension getExtension() {
        return extension;
    }

    public void setExtension(Extension extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Total{");
        sb.append("amount=").append(amount);
        sb.append(", currencyCode='").append(currencyCode).append('\'');
        sb.append(", base=").append(base);
        sb.append(", taxes=").append(taxes);
        sb.append(", fees=").append(fees);
        sb.append(", total=").append(total);
        sb.append(", extension=").append(extension);
        sb.append('}');
        return sb.toString();
    }
}
