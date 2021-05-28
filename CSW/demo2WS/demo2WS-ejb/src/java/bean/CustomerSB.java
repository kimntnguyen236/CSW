/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import model.Customer;

/**
 *
 * @author lenovo
 */
@Stateless
public class CustomerSB implements CustomerSBLocal {

        private Connection connection;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public CustomerSB() {
        setConnect();
    }

    private Connection setConnect() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;database=WSC";
            String user = "sa";
            String password = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerSB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer>list = new ArrayList<>();
            try {
                
                String sql="SELECT * FROM Customer";
                pstmt= connection.prepareStatement(sql);
                rs = pstmt.executeQuery();
                while(rs.next()){
                    Customer customer = new Customer();
                    customer.setId(rs.getInt("id"));
                    customer.setCustomername(rs.getString("customername"));
                    customer.setAge(rs.getInt("age"));
                    customer.setHeight(rs.getDouble("height"));
                    customer.setWeight(rs.getDouble("weight"));
                    list.add(customer);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CustomerSB.class.getName()).log(Level.SEVERE, null, ex);
            }
            return list;
    }

    @Override
    public void AddCustomer(Customer customer) {
            try {
                String sql="INSERT Customer VALUES(?,?,?,?)";
                pstmt= connection.prepareStatement(sql);
                pstmt.setString(1, customer.getCustomername());
                pstmt.setInt(2, customer.getAge());
                pstmt.setDouble(3,customer.getHeight());
                pstmt.setDouble(4, customer.getWeight());
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(CustomerSB.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    @Override
    public void DelCustomer(int id) {
            try {
                String sql="DELETE FROM Customer WHERE id = ?";
                pstmt= connection.prepareStatement(sql);
                pstmt.setInt(1, id);
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(CustomerSB.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
