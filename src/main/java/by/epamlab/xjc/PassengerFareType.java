//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2019.10.23 at 02:05:18 AM MSK 
//


package by.epamlab.xjc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerFareType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerFareType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Base" type="{http://www.epamlab.by/Velichko/Valentine}BaseType"/&gt;
 *         &lt;element name="Taxes" type="{http://www.epamlab.by/Velichko/Valentine}TaxesType"/&gt;
 *         &lt;element name="Fees" type="{http://www.epamlab.by/Velichko/Valentine}FeesType"/&gt;
 *         &lt;element name="Total" type="{http://www.epamlab.by/Velichko/Valentine}TotalType"/&gt;
 *         &lt;element name="Extension" type="{http://www.epamlab.by/Velichko/Valentine}ExtensionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerFareType", propOrder = {
    "base",
    "taxes",
    "fees",
    "total",
    "extension"
})
public class PassengerFareType {

    @XmlElement(name = "Base", required = true)
    protected BaseType base;
    @XmlElement(name = "Taxes", required = true)
    protected TaxesType taxes;
    @XmlElement(name = "Fees", required = true)
    protected FeesType fees;
    @XmlElement(name = "Total", required = true)
    protected TotalType total;
    @XmlElement(name = "Extension", required = true)
    protected ExtensionType extension;

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link BaseType }
     *     
     */
    public BaseType getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseType }
     *     
     */
    public void setBase(BaseType value) {
        this.base = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link TaxesType }
     *     
     */
    public TaxesType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesType }
     *     
     */
    public void setTaxes(TaxesType value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link FeesType }
     *     
     */
    public FeesType getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeesType }
     *     
     */
    public void setFees(FeesType value) {
        this.fees = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link TotalType }
     *     
     */
    public TotalType getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalType }
     *     
     */
    public void setTotal(TotalType value) {
        this.total = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExtension(ExtensionType value) {
        this.extension = value;
    }

}
