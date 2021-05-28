
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _AddWorkerResponse_QNAME = new QName("http://ws/", "addWorkerResponse");
    private final static QName _AddWorker_QNAME = new QName("http://ws/", "addWorker");
    private final static QName _HelloResponse_QNAME = new QName("http://ws/", "helloResponse");
    private final static QName _FindAllResponse_QNAME = new QName("http://ws/", "findAllResponse");
    private final static QName _Hello_QNAME = new QName("http://ws/", "hello");
    private final static QName _FindAll_QNAME = new QName("http://ws/", "findAll");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddWorkerResponse }
     * 
     */
    public AddWorkerResponse createAddWorkerResponse() {
        return new AddWorkerResponse();
    }

    /**
     * Create an instance of {@link AddWorker }
     * 
     */
    public AddWorker createAddWorker() {
        return new AddWorker();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
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
     * Create an instance of {@link Worker }
     * 
     */
    public Worker createWorker() {
        return new Worker();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddWorkerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addWorkerResponse")
    public JAXBElement<AddWorkerResponse> createAddWorkerResponse(AddWorkerResponse value) {
        return new JAXBElement<AddWorkerResponse>(_AddWorkerResponse_QNAME, AddWorkerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddWorker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addWorker")
    public JAXBElement<AddWorker> createAddWorker(AddWorker value) {
        return new JAXBElement<AddWorker>(_AddWorker_QNAME, AddWorker.class, null, value);
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

}
