
package fpt.aptech;

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
@WebService(name = "CountryWS", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CountryWS {


    /**
     * 
     * @return
     *     returns java.util.List<fpt.aptech.Country>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://ws/", className = "fpt.aptech.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://ws/", className = "fpt.aptech.FindAllResponse")
    @Action(input = "http://ws/CountryWS/findAllRequest", output = "http://ws/CountryWS/findAllResponse")
    public List<Country> findAll();

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://ws/", className = "fpt.aptech.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://ws/", className = "fpt.aptech.HelloResponse")
    @Action(input = "http://ws/CountryWS/helloRequest", output = "http://ws/CountryWS/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param country
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saveCountry", targetNamespace = "http://ws/", className = "fpt.aptech.SaveCountry")
    @ResponseWrapper(localName = "saveCountryResponse", targetNamespace = "http://ws/", className = "fpt.aptech.SaveCountryResponse")
    @Action(input = "http://ws/CountryWS/saveCountryRequest", output = "http://ws/CountryWS/saveCountryResponse")
    public boolean saveCountry(
        @WebParam(name = "country", targetNamespace = "")
        Country country);

}