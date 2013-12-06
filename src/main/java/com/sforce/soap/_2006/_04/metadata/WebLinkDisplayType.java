
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebLinkDisplayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WebLinkDisplayType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="link"/>
 *     &lt;enumeration value="button"/>
 *     &lt;enumeration value="massActionButton"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WebLinkDisplayType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum WebLinkDisplayType {

    @XmlEnumValue("link")
    LINK("link"),
    @XmlEnumValue("button")
    BUTTON("button"),
    @XmlEnumValue("massActionButton")
    MASS_ACTION_BUTTON("massActionButton");
    private final String value;

    WebLinkDisplayType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebLinkDisplayType fromValue(String v) {
        for (WebLinkDisplayType c: WebLinkDisplayType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
