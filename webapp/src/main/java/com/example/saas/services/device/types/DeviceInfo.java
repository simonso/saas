
package com.example.saas.services.device.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="udid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iosVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iosBuild" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imei" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modemFirmware" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "udid",
    "deviceName",
    "iosVersion",
    "iosBuild",
    "modelName",
    "modelNumber",
    "serialNumber",
    "imei",
    "modemFirmware"
})
@XmlRootElement(name = "deviceInfo")
public class DeviceInfo {

    @XmlElement(required = true)
    protected String udid;
    @XmlElement(required = true)
    protected String deviceName;
    @XmlElement(required = true)
    protected String iosVersion;
    @XmlElement(required = true)
    protected String iosBuild;
    @XmlElement(required = true)
    protected String modelName;
    @XmlElement(required = true)
    protected String modelNumber;
    @XmlElement(required = true)
    protected String serialNumber;
    @XmlElement(required = true)
    protected String imei;
    @XmlElement(required = true)
    protected String modemFirmware;

    /**
     * Gets the value of the udid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdid() {
        return udid;
    }

    /**
     * Sets the value of the udid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdid(String value) {
        this.udid = value;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the iosVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIosVersion() {
        return iosVersion;
    }

    /**
     * Sets the value of the iosVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIosVersion(String value) {
        this.iosVersion = value;
    }

    /**
     * Gets the value of the iosBuild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIosBuild() {
        return iosBuild;
    }

    /**
     * Sets the value of the iosBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIosBuild(String value) {
        this.iosBuild = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the modelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * Sets the value of the modelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber(String value) {
        this.modelNumber = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImei() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImei(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the modemFirmware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModemFirmware() {
        return modemFirmware;
    }

    /**
     * Sets the value of the modemFirmware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModemFirmware(String value) {
        this.modemFirmware = value;
    }

}
