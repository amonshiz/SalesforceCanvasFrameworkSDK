
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeadOwnerSharingRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeadOwnerSharingRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}OwnerSharingRule">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leadAccessLevel" type="{http://soap.sforce.com/2006/04/metadata}ShareAccessLevelReadEdit"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeadOwnerSharingRule", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "description",
    "leadAccessLevel",
    "name"
})
public class LeadOwnerSharingRule
    extends OwnerSharingRule
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected ShareAccessLevelReadEdit leadAccessLevel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String name;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the leadAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShareAccessLevelReadEdit }
     *     
     */
    public ShareAccessLevelReadEdit getLeadAccessLevel() {
        return leadAccessLevel;
    }

    /**
     * Sets the value of the leadAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareAccessLevelReadEdit }
     *     
     */
    public void setLeadAccessLevel(ShareAccessLevelReadEdit value) {
        this.leadAccessLevel = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
