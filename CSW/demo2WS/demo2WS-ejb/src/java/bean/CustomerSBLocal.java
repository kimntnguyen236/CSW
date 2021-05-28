/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;
import javax.ejb.Local;
import model.Customer;

/**
 *
 * @author lenovo
 */
@Local
public interface CustomerSBLocal {
       List<Customer>findAll();
    void AddCustomer(Customer customer);
    void DelCustomer(int id);
    
}
