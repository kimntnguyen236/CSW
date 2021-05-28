
package fpt.aptech;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fpt.aptech package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloResponse_QNAME = new QName("http://ws/", "helloResponse");
    private final static QName _SaveCountry_QNAME = new QName("http://ws/", "saveCountry");
    private final static QName _FindAllResponse_QNAME = new QName("http://ws/", "findAllResponse");
    private final static QName _Hello_QNAME = new QName("http://ws/", "hello");
    private final static QName _FindAll_QNAME = new QName("http://ws/", "findAll");
    private final static QName _SaveCountryResponse_QNAME = new QName("http://ws/", "saveCountryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fpt.aptech
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link SaveCountry }
     * 
     */
    public SaveCountry createSaveCountry() {
        return new SaveCountry();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link SaveCountryResponse }
     * 
     */
    public SaveCountryResponse createSaveCountryResponse() {
        return new SaveCountryResponse();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "saveCountry")
    public JAXBElement<SaveCountry> createSaveCountry(SaveCountry value) {
        return new JAXBElement<SaveCountry>(_SaveCountry_QNAME, SaveCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "saveCountryResponse")
    public JAXBElement<SaveCountryResponse> createSaveCountryResponse(SaveCountryResponse value) {
        return new JAXBElement<SaveCountryResponse>(_SaveCountryResponse_QNAME, SaveCountryResponse.class, null, value);
    }

}
