package by.epamlab.manually.classes.extention;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class BookingClassAvailability {

    @XmlAttribute(name = "BookCode", required = true)
    private String bookCode;

    @XmlAttribute(name = "BookDesig", required = true)
    private int bookDesig;

    @XmlAttribute(name = "Cabin", required = true)
    private String cabin;

    public BookingClassAvailability() {
    }

    public BookingClassAvailability(String bookCode, int bookDesig, String cabin) {
        this.bookCode = bookCode;
        this.bookDesig = bookDesig;
        this.cabin = cabin;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public int getBookDesig() {
        return bookDesig;
    }

    public void setBookDesig(int bookDesig) {
        this.bookDesig = bookDesig;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BookingClassAvailability{");
        sb.append("bookCode='").append(bookCode).append('\'');
        sb.append(", bookDesig=").append(bookDesig);
        sb.append(", cabin='").append(cabin).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
