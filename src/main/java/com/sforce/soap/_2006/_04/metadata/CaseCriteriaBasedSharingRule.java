/**
 * CaseCriteriaBasedSharingRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CaseCriteriaBasedSharingRule  extends com.sforce.soap._2006._04.metadata.CriteriaBasedSharingRule  implements java.io.Serializable {
    private java.lang.String booleanFilter;

    private com.sforce.soap._2006._04.metadata.ShareAccessLevelReadEdit caseAccessLevel;

    private java.lang.String description;

    private java.lang.String name;

    public CaseCriteriaBasedSharingRule() {
    }

    public CaseCriteriaBasedSharingRule(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.SharedTo sharedTo,
           com.sforce.soap._2006._04.metadata.FilterItem[] criteriaItems,
           java.lang.String booleanFilter,
           com.sforce.soap._2006._04.metadata.ShareAccessLevelReadEdit caseAccessLevel,
           java.lang.String description,
           java.lang.String name) {
        super(
            fullName,
            sharedTo,
            criteriaItems);
        this.booleanFilter = booleanFilter;
        this.caseAccessLevel = caseAccessLevel;
        this.description = description;
        this.name = name;
    }


    /**
     * Gets the booleanFilter value for this CaseCriteriaBasedSharingRule.
     * 
     * @return booleanFilter
     */
    public java.lang.String getBooleanFilter() {
        return booleanFilter;
    }


    /**
     * Sets the booleanFilter value for this CaseCriteriaBasedSharingRule.
     * 
     * @param booleanFilter
     */
    public void setBooleanFilter(java.lang.String booleanFilter) {
        this.booleanFilter = booleanFilter;
    }


    /**
     * Gets the caseAccessLevel value for this CaseCriteriaBasedSharingRule.
     * 
     * @return caseAccessLevel
     */
    public com.sforce.soap._2006._04.metadata.ShareAccessLevelReadEdit getCaseAccessLevel() {
        return caseAccessLevel;
    }


    /**
     * Sets the caseAccessLevel value for this CaseCriteriaBasedSharingRule.
     * 
     * @param caseAccessLevel
     */
    public void setCaseAccessLevel(com.sforce.soap._2006._04.metadata.ShareAccessLevelReadEdit caseAccessLevel) {
        this.caseAccessLevel = caseAccessLevel;
    }


    /**
     * Gets the description value for this CaseCriteriaBasedSharingRule.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CaseCriteriaBasedSharingRule.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the name value for this CaseCriteriaBasedSharingRule.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CaseCriteriaBasedSharingRule.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaseCriteriaBasedSharingRule)) return false;
        CaseCriteriaBasedSharingRule other = (CaseCriteriaBasedSharingRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.booleanFilter==null && other.getBooleanFilter()==null) || 
             (this.booleanFilter!=null &&
              this.booleanFilter.equals(other.getBooleanFilter()))) &&
            ((this.caseAccessLevel==null && other.getCaseAccessLevel()==null) || 
             (this.caseAccessLevel!=null &&
              this.caseAccessLevel.equals(other.getCaseAccessLevel()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBooleanFilter() != null) {
            _hashCode += getBooleanFilter().hashCode();
        }
        if (getCaseAccessLevel() != null) {
            _hashCode += getCaseAccessLevel().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaseCriteriaBasedSharingRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CaseCriteriaBasedSharingRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "booleanFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ShareAccessLevelReadEdit"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
