package by.epamlab.manually.classes.extention;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class FeeInfos {

    @XmlElement(name = "FeeInfo")
    private FeeInfo feeInfo;

    public FeeInfos() {
    }

    public FeeInfos(FeeInfo feeInfo) {
        this.feeInfo = feeInfo;
    }

    public FeeInfo getFeeInfo() {
        return feeInfo;
    }

    public void setFeeInfo(FeeInfo feeInfo) {
        this.feeInfo = feeInfo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FeeInfos{");
        sb.append("feeInfo=").append(feeInfo);
        sb.append('}');
        return sb.toString();
    }
}
