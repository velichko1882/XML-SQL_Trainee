package by.epamlab.manually.classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class FareInfos {

    @XmlElement(name = "FareInfo")
    private List<FareInfo> fareInfoList = new ArrayList<>();

    public FareInfos() {
    }

    public List<FareInfo> getFareInfoList() {
        return fareInfoList;
    }

    public boolean addFareInfo(FareInfo fareInfo) {
        return fareInfoList.add(fareInfo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FareInfos{");
        sb.append("fareInfoList=").append(fareInfoList);
        sb.append('}');
        return sb.toString();
    }
}
