
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addWorker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addWorker">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="worker" type="{http://ws/}worker" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addWorker", propOrder = {
    "worker"
})
public class AddWorker {

    protected Worker worker;

    /**
     * Gets the value of the worker property.
     * 
     * @return
     *     possible object is
     *     {@link Worker }
     *     
     */
    public Worker getWorker() {
        return worker;
    }

    /**
     * Sets the value of the worker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Worker }
     *     
     */
    public void setWorker(Worker value) {
        this.worker = value;
    }

}
