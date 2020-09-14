package by.epamlab.manually.classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class PTCs {

    @XmlElement(name = "PTC")
    private List<PTC> ptcList = new ArrayList<>();

    public PTCs() {
    }

    public List<PTC> getPtcList() {
        return ptcList;
    }

    public boolean addPtc(PTC ptc) {
        return ptcList.add(ptc);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PTCs{");
        sb.append("ptcList=").append(ptcList);
        sb.append('}');
        return sb.toString();
    }
}
