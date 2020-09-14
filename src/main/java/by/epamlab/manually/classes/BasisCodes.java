package by.epamlab.manually.classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class BasisCodes {

    @XmlElement(name = "BasisCode", required = true)
    private String basisCode;

    public BasisCodes() {
    }

    public BasisCodes(String basisCode) {
        this.basisCode = basisCode;
    }

    public String getBasisCode() {
        return basisCode;
    }

    public void setBasisCode(String basisCode) {
        this.basisCode = basisCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BasisCodes{");
        sb.append("basisCode='").append(basisCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
