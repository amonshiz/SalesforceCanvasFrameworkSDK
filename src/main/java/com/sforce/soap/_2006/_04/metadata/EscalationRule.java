
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EscalationRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EscalationRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ruleEntry" type="{http://soap.sforce.com/2006/04/metadata}RuleEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EscalationRule", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "active",
    "ruleEntry"
})
public class EscalationRule
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean active;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<RuleEntry> ruleEntry;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the ruleEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleEntry }
     * 
     * 
     */
    public List<RuleEntry> getRuleEntry() {
        if (ruleEntry == null) {
            ruleEntry = new ArrayList<RuleEntry>();
        }
        return this.ruleEntry;
    }

}
