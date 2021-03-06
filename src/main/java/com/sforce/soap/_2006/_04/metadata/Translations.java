
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Translations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Translations">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="customApplications" type="{http://soap.sforce.com/2006/04/metadata}CustomApplicationTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customDataTypeTranslations" type="{http://soap.sforce.com/2006/04/metadata}CustomDataTypeTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customLabels" type="{http://soap.sforce.com/2006/04/metadata}CustomLabelTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customPageWebLinks" type="{http://soap.sforce.com/2006/04/metadata}CustomPageWebLinkTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customTabs" type="{http://soap.sforce.com/2006/04/metadata}CustomTabTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quickActions" type="{http://soap.sforce.com/2006/04/metadata}GlobalQuickActionTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reportTypes" type="{http://soap.sforce.com/2006/04/metadata}ReportTypeTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scontrols" type="{http://soap.sforce.com/2006/04/metadata}ScontrolTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Translations", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "customApplications",
    "customDataTypeTranslations",
    "customLabels",
    "customPageWebLinks",
    "customTabs",
    "quickActions",
    "reportTypes",
    "scontrols"
})
public class Translations
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CustomApplicationTranslation> customApplications;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CustomDataTypeTranslation> customDataTypeTranslations;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CustomLabelTranslation> customLabels;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CustomPageWebLinkTranslation> customPageWebLinks;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CustomTabTranslation> customTabs;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<GlobalQuickActionTranslation> quickActions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ReportTypeTranslation> reportTypes;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ScontrolTranslation> scontrols;

    /**
     * Gets the value of the customApplications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customApplications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomApplications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomApplicationTranslation }
     * 
     * 
     */
    public List<CustomApplicationTranslation> getCustomApplications() {
        if (customApplications == null) {
            customApplications = new ArrayList<CustomApplicationTranslation>();
        }
        return this.customApplications;
    }

    /**
     * Gets the value of the customDataTypeTranslations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customDataTypeTranslations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomDataTypeTranslations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomDataTypeTranslation }
     * 
     * 
     */
    public List<CustomDataTypeTranslation> getCustomDataTypeTranslations() {
        if (customDataTypeTranslations == null) {
            customDataTypeTranslations = new ArrayList<CustomDataTypeTranslation>();
        }
        return this.customDataTypeTranslations;
    }

    /**
     * Gets the value of the customLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomLabelTranslation }
     * 
     * 
     */
    public List<CustomLabelTranslation> getCustomLabels() {
        if (customLabels == null) {
            customLabels = new ArrayList<CustomLabelTranslation>();
        }
        return this.customLabels;
    }

    /**
     * Gets the value of the customPageWebLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customPageWebLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomPageWebLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomPageWebLinkTranslation }
     * 
     * 
     */
    public List<CustomPageWebLinkTranslation> getCustomPageWebLinks() {
        if (customPageWebLinks == null) {
            customPageWebLinks = new ArrayList<CustomPageWebLinkTranslation>();
        }
        return this.customPageWebLinks;
    }

    /**
     * Gets the value of the customTabs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customTabs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomTabs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomTabTranslation }
     * 
     * 
     */
    public List<CustomTabTranslation> getCustomTabs() {
        if (customTabs == null) {
            customTabs = new ArrayList<CustomTabTranslation>();
        }
        return this.customTabs;
    }

    /**
     * Gets the value of the quickActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quickActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuickActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalQuickActionTranslation }
     * 
     * 
     */
    public List<GlobalQuickActionTranslation> getQuickActions() {
        if (quickActions == null) {
            quickActions = new ArrayList<GlobalQuickActionTranslation>();
        }
        return this.quickActions;
    }

    /**
     * Gets the value of the reportTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportTypeTranslation }
     * 
     * 
     */
    public List<ReportTypeTranslation> getReportTypes() {
        if (reportTypes == null) {
            reportTypes = new ArrayList<ReportTypeTranslation>();
        }
        return this.reportTypes;
    }

    /**
     * Gets the value of the scontrols property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scontrols property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScontrols().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScontrolTranslation }
     * 
     * 
     */
    public List<ScontrolTranslation> getScontrols() {
        if (scontrols == null) {
            scontrols = new ArrayList<ScontrolTranslation>();
        }
        return this.scontrols;
    }

}
