
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchLayouts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchLayouts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customTabListAdditionalFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="excludedStandardButtons" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listViewButtons" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lookupDialogsAdditionalFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lookupFilterFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lookupPhoneDialogsAdditionalFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="searchFilterFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="searchResultsAdditionalFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="searchResultsCustomButtons" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchLayouts", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "customTabListAdditionalFields",
    "excludedStandardButtons",
    "listViewButtons",
    "lookupDialogsAdditionalFields",
    "lookupFilterFields",
    "lookupPhoneDialogsAdditionalFields",
    "searchFilterFields",
    "searchResultsAdditionalFields",
    "searchResultsCustomButtons"
})
public class SearchLayouts {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> customTabListAdditionalFields;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> excludedStandardButtons;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> listViewButtons;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> lookupDialogsAdditionalFields;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> lookupFilterFields;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> lookupPhoneDialogsAdditionalFields;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> searchFilterFields;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> searchResultsAdditionalFields;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> searchResultsCustomButtons;

    /**
     * Gets the value of the customTabListAdditionalFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customTabListAdditionalFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomTabListAdditionalFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomTabListAdditionalFields() {
        if (customTabListAdditionalFields == null) {
            customTabListAdditionalFields = new ArrayList<String>();
        }
        return this.customTabListAdditionalFields;
    }

    /**
     * Gets the value of the excludedStandardButtons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludedStandardButtons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludedStandardButtons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcludedStandardButtons() {
        if (excludedStandardButtons == null) {
            excludedStandardButtons = new ArrayList<String>();
        }
        return this.excludedStandardButtons;
    }

    /**
     * Gets the value of the listViewButtons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listViewButtons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListViewButtons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListViewButtons() {
        if (listViewButtons == null) {
            listViewButtons = new ArrayList<String>();
        }
        return this.listViewButtons;
    }

    /**
     * Gets the value of the lookupDialogsAdditionalFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lookupDialogsAdditionalFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLookupDialogsAdditionalFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLookupDialogsAdditionalFields() {
        if (lookupDialogsAdditionalFields == null) {
            lookupDialogsAdditionalFields = new ArrayList<String>();
        }
        return this.lookupDialogsAdditionalFields;
    }

    /**
     * Gets the value of the lookupFilterFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lookupFilterFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLookupFilterFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLookupFilterFields() {
        if (lookupFilterFields == null) {
            lookupFilterFields = new ArrayList<String>();
        }
        return this.lookupFilterFields;
    }

    /**
     * Gets the value of the lookupPhoneDialogsAdditionalFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lookupPhoneDialogsAdditionalFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLookupPhoneDialogsAdditionalFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLookupPhoneDialogsAdditionalFields() {
        if (lookupPhoneDialogsAdditionalFields == null) {
            lookupPhoneDialogsAdditionalFields = new ArrayList<String>();
        }
        return this.lookupPhoneDialogsAdditionalFields;
    }

    /**
     * Gets the value of the searchFilterFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchFilterFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchFilterFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSearchFilterFields() {
        if (searchFilterFields == null) {
            searchFilterFields = new ArrayList<String>();
        }
        return this.searchFilterFields;
    }

    /**
     * Gets the value of the searchResultsAdditionalFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchResultsAdditionalFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchResultsAdditionalFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSearchResultsAdditionalFields() {
        if (searchResultsAdditionalFields == null) {
            searchResultsAdditionalFields = new ArrayList<String>();
        }
        return this.searchResultsAdditionalFields;
    }

    /**
     * Gets the value of the searchResultsCustomButtons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchResultsCustomButtons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchResultsCustomButtons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSearchResultsCustomButtons() {
        if (searchResultsCustomButtons == null) {
            searchResultsCustomButtons = new ArrayList<String>();
        }
        return this.searchResultsCustomButtons;
    }

}
