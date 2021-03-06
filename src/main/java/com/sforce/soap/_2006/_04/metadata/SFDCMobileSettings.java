
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SFDCMobileSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SFDCMobileSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableMobileLite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableUserToDeviceLinking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SFDCMobileSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "enableMobileLite",
    "enableUserToDeviceLinking"
})
public class SFDCMobileSettings {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableMobileLite;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableUserToDeviceLinking;

    /**
     * Gets the value of the enableMobileLite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableMobileLite() {
        return enableMobileLite;
    }

    /**
     * Sets the value of the enableMobileLite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableMobileLite(Boolean value) {
        this.enableMobileLite = value;
    }

    /**
     * Gets the value of the enableUserToDeviceLinking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableUserToDeviceLinking() {
        return enableUserToDeviceLinking;
    }

    /**
     * Sets the value of the enableUserToDeviceLinking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableUserToDeviceLinking(Boolean value) {
        this.enableUserToDeviceLinking = value;
    }

}
