package by.epamlab.manually.classes.extention;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class TerminalInformation {

    @XmlElement
    private int terminal;

    public TerminalInformation() {
    }

    public TerminalInformation(int terminal) {
        this.terminal = terminal;
    }

    public int getTerminal() {
        return terminal;
    }

    public void setTerminal(int terminal) {
        this.terminal = terminal;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TerminalInformation{");
        sb.append("terminal=").append(terminal);
        sb.append('}');
        return sb.toString();
    }
}
