package by.epamlab.manually.classes.extention;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Provider {

    @XmlAttribute(name = "ProviderCode", required = true)
    private String providerCode;

    public Provider() {
    }

    public Provider(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Provider{");
        sb.append("providerCode='").append(providerCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
