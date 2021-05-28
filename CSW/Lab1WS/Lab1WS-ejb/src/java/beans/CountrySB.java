/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Country;
import java.util.*;
import javax.ejb.Stateless;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sinhtm
 */
@Stateless
public class CountrySB implements CountrySBLocal {

    private Connection connection;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public CountrySB() {
        setConnect();
    }

    private Connection setConnect() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;database=CSW";
            String user = "sa";
            String password = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CountrySB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    @Override
    public List<Country> findAll() {
        List<Country> cList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Country";
            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Country c = new Country();
                c.setName(rs.getString(1));
                c.setCountrycode(rs.getString(2));
                c.setLanguagecode(rs.getString(3));
                c.setPopulation(rs.getInt(4));

                cList.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CountrySB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cList;
    }

    @Override
    public boolean saveCountry(Country country) {
        try {
            String sql = "INSERT Country VALUES(?,?,?,?)";
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, country.getName());
            pstmt.setString(2, country.getCountrycode());
            pstmt.setString(3, country.getLanguagecode());
            pstmt.setInt(4, country.getPopulation());
             pstmt.executeUpdate();
             return true;
//            if (i > 0) {
//                return true;
//            } else {
//                return false;
//            }
        } catch (SQLException ex) {
            Logger.getLogger(CountrySB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
