
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChartType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChartType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Scatter"/>
 *     &lt;enumeration value="ScatterGrouped"/>
 *     &lt;enumeration value="Bubble"/>
 *     &lt;enumeration value="BubbleGrouped"/>
 *     &lt;enumeration value="HorizontalBar"/>
 *     &lt;enumeration value="HorizontalBarGrouped"/>
 *     &lt;enumeration value="HorizontalBarStacked"/>
 *     &lt;enumeration value="HorizontalBarStackedTo100"/>
 *     &lt;enumeration value="VerticalColumn"/>
 *     &lt;enumeration value="VerticalColumnGrouped"/>
 *     &lt;enumeration value="VerticalColumnStacked"/>
 *     &lt;enumeration value="VerticalColumnStackedTo100"/>
 *     &lt;enumeration value="Line"/>
 *     &lt;enumeration value="LineGrouped"/>
 *     &lt;enumeration value="LineCumulative"/>
 *     &lt;enumeration value="LineCumulativeGrouped"/>
 *     &lt;enumeration value="Pie"/>
 *     &lt;enumeration value="Donut"/>
 *     &lt;enumeration value="Funnel"/>
 *     &lt;enumeration value="VerticalColumnLine"/>
 *     &lt;enumeration value="VerticalColumnGroupedLine"/>
 *     &lt;enumeration value="VerticalColumnStackedLine"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChartType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ChartType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Scatter")
    SCATTER("Scatter"),
    @XmlEnumValue("ScatterGrouped")
    SCATTER_GROUPED("ScatterGrouped"),
    @XmlEnumValue("Bubble")
    BUBBLE("Bubble"),
    @XmlEnumValue("BubbleGrouped")
    BUBBLE_GROUPED("BubbleGrouped"),
    @XmlEnumValue("HorizontalBar")
    HORIZONTAL_BAR("HorizontalBar"),
    @XmlEnumValue("HorizontalBarGrouped")
    HORIZONTAL_BAR_GROUPED("HorizontalBarGrouped"),
    @XmlEnumValue("HorizontalBarStacked")
    HORIZONTAL_BAR_STACKED("HorizontalBarStacked"),
    @XmlEnumValue("HorizontalBarStackedTo100")
    HORIZONTAL_BAR_STACKED_TO_100("HorizontalBarStackedTo100"),
    @XmlEnumValue("VerticalColumn")
    VERTICAL_COLUMN("VerticalColumn"),
    @XmlEnumValue("VerticalColumnGrouped")
    VERTICAL_COLUMN_GROUPED("VerticalColumnGrouped"),
    @XmlEnumValue("VerticalColumnStacked")
    VERTICAL_COLUMN_STACKED("VerticalColumnStacked"),
    @XmlEnumValue("VerticalColumnStackedTo100")
    VERTICAL_COLUMN_STACKED_TO_100("VerticalColumnStackedTo100"),
    @XmlEnumValue("Line")
    LINE("Line"),
    @XmlEnumValue("LineGrouped")
    LINE_GROUPED("LineGrouped"),
    @XmlEnumValue("LineCumulative")
    LINE_CUMULATIVE("LineCumulative"),
    @XmlEnumValue("LineCumulativeGrouped")
    LINE_CUMULATIVE_GROUPED("LineCumulativeGrouped"),
    @XmlEnumValue("Pie")
    PIE("Pie"),
    @XmlEnumValue("Donut")
    DONUT("Donut"),
    @XmlEnumValue("Funnel")
    FUNNEL("Funnel"),
    @XmlEnumValue("VerticalColumnLine")
    VERTICAL_COLUMN_LINE("VerticalColumnLine"),
    @XmlEnumValue("VerticalColumnGroupedLine")
    VERTICAL_COLUMN_GROUPED_LINE("VerticalColumnGroupedLine"),
    @XmlEnumValue("VerticalColumnStackedLine")
    VERTICAL_COLUMN_STACKED_LINE("VerticalColumnStackedLine");
    private final String value;

    ChartType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChartType fromValue(String v) {
        for (ChartType c: ChartType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
