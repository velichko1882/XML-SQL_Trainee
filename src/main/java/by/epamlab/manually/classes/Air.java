package by.epamlab.manually.classes;

import by.epamlab.manually.classes.extention.Extension;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Air {

    @XmlAttribute(name = "Direction", required = true)
    private String direction;

    @XmlAttribute(name = "TotalTravelTime", required = true)
    private String totalTravelTime;

    @XmlElement(name = "Options", required = true)
    private Options options;

    @XmlElement(name = "Extension")
    private Extension extension;

    public Air() {
    }

    public Air(String direction, String totalTravelTime, Options options, Extension extension) {
        this.direction = direction;
        this.totalTravelTime = totalTravelTime;
        this.options = options;
        this.extension = extension;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getTotalTravelTime() {
        return totalTravelTime;
    }

    public void setTotalTravelTime(String totalTravelTime) {
        this.totalTravelTime = totalTravelTime;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public Extension getExtension() {
        return extension;
    }

    public void setExtension(Extension extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Air{");
        sb.append("Direction='").append(direction).append('\'');
        sb.append(", TotalTravelTime='").append(totalTravelTime).append('\'');
        sb.append(", \nOptions=").append(options);
        sb.append(", \nExtension=").append(extension);
        sb.append('}');
        return sb.toString();
    }
}
