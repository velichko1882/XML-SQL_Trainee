package by.epamlab.manually.classes.extention;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Fees {

    @XmlElement(name = "Fee")
    private Fee fee;

    public Fees() {
    }

    public Fees(Fee fee) {
        this.fee = fee;
    }

    public Fee getFee() {
        return fee;
    }

    public void setFee(Fee fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fees{");
        sb.append("fee=").append(fee);
        sb.append('}');
        return sb.toString();
    }
}
