/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import bean.CustomerSBLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Customer;

/**
 *
 * @author lenovo
 */
@WebService(serviceName = "CustomerWS")
public class CustomerWS {

    @EJB
    private CustomerSBLocal customerSB;

    @WebMethod(operationName = "findAll")
    public List<Customer>findAll() {
        return customerSB.findAll();
    }
    @WebMethod(operationName = "AddCustomer")
    public void AddCustomer(@WebParam(name = "customer") Customer customer) {
        customerSB.AddCustomer(customer);
    }
    @WebMethod(operationName = "DelCustomer")
    public void DelCustomer(@WebParam(name = "id") int id) {
        customerSB.DelCustomer(id);
    }
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
