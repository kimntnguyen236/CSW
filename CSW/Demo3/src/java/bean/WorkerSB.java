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
import model.Worker;

/**
 *
 * @author lenovo
 */
@Stateless
public class WorkerSB implements WorkerSBLocal {

    private Connection connection;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public WorkerSB() {
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
            Logger.getLogger(WorkerSB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    @Override
    public List<Worker> findAll() {
         List<Worker>list = new ArrayList<>();
        try {
           
            String sql ="SELECT * FROM Worker";
            pstmt= connection.prepareStatement(sql);
            rs= pstmt.executeQuery();
            while(rs.next()){
                Worker worker = new Worker();
                worker.setId(rs.getInt("id"));
                worker.setName(rs.getString("name"));
                worker.setPhone(rs.getString("phone"));
                worker.setSalaryPerday(rs.getBigDecimal("salaryPerday"));
                worker.setDaynumber(rs.getInt("daynumber"));
                worker.setBhxh(rs.getBigDecimal("bhxh"));
                worker.setBhtn(rs.getBigDecimal("bhtn"));
                list.add(worker);
            }
        } catch (SQLException ex) {
            Logger.getLogger(WorkerSB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void addWorker(Worker worker) {
        try {
            String sql ="INSERT Worker VALUES(?,?,?,?,?,?)";
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, worker.getName());
            pstmt.setString(2, worker.getPhone());
            pstmt.setBigDecimal(3, worker.getSalaryPerday());
            pstmt.setInt(4, worker.getDaynumber());
            pstmt.setBigDecimal(5, worker.getBhxh());
            pstmt.setBigDecimal(6, worker.getBhtn());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(WorkerSB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
