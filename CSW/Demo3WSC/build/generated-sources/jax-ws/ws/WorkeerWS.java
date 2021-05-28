
package ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WorkeerWS", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WorkeerWS {


    /**
     * 
     * @param worker
     */
    @WebMethod
    @RequestWrapper(localName = "addWorker", targetNamespace = "http://ws/", className = "ws.AddWorker")
    @ResponseWrapper(localName = "addWorkerResponse", targetNamespace = "http://ws/", className = "ws.AddWorkerResponse")
    @Action(input = "http://ws/WorkeerWS/addWorkerRequest", output = "http://ws/WorkeerWS/addWorkerResponse")
    public void addWorker(
        @WebParam(name = "worker", targetNamespace = "")
        Worker worker);

    /**
     * 
     * @return
     *     returns java.util.List<ws.Worker>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://ws/", className = "ws.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://ws/", className = "ws.FindAllResponse")
    @Action(input = "http://ws/WorkeerWS/findAllRequest", output = "http://ws/WorkeerWS/findAllResponse")
    public List<Worker> findAll();

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://ws/", className = "ws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://ws/", className = "ws.HelloResponse")
    @Action(input = "http://ws/WorkeerWS/helloRequest", output = "http://ws/WorkeerWS/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}