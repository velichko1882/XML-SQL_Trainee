package by.epamlab.manually.classes;

import by.epamlab.manually.classes.extention.Base;
import by.epamlab.manually.classes.extention.Fees;
import by.epamlab.manually.classes.extention.Taxes;
import by.epamlab.manually.classes.extention.Total;
import by.epamlab.manually.classes.extention.Extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class PassengerFare {

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

    public PassengerFare() {
    }

    public PassengerFare(Base base, Taxes taxes, Fees fees, Total total, Extension extension) {
        this.base = base;
        this.taxes = taxes;
        this.fees = fees;
        this.total = total;
        this.extension = extension;
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
        final StringBuilder sb = new StringBuilder("PassengerFare{");
        sb.append("base=").append(base);
        sb.append(", taxes=").append(taxes);
        sb.append(", fees=").append(fees);
        sb.append(", total=").append(total);
        sb.append(", extension=").append(extension);
        sb.append('}');
        return sb.toString();
    }
}
