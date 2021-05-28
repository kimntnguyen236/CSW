/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import beans.CountrySBLocal;
import entities.Country;
import java.util.*;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author sinhtm
 */
@WebService(serviceName = "CountryWS")
public class CountryWS {

    @EJB
    private CountrySBLocal countrySB;

    @WebMethod(operationName = "findAll")
    public List<Country> findAll() {
        return countrySB.findAll();
    }

    @WebMethod(operationName = "saveCountry")
    public boolean saveCountry(@WebParam(name = "country") Country country) {
        return countrySB.saveCountry(country);
    }

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
