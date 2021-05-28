/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Country;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sinhtm
 */
@Local
public interface CountrySBLocal {
    List<Country> findAll();
    boolean saveCountry(Country country);
}
