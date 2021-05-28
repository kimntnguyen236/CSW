/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import ws.CustomerWS_Service;

/**
 *
 * @author lenovo
 */
public class HomeServlet extends HttpServlet {

    @WebServiceRef()
    private CustomerWS_Service service;


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String action = request.getParameter("action");
       
          if(action==null){
              request.setAttribute("list", findAll());
              request.getRequestDispatcher("index.jsp").forward(request, response);
          }else if(action.equals("CalculateBMI")){
              String weight = request.getParameter("Weight");
              String height = request.getParameter("Height");
              float  we = Float.valueOf(weight);
              float  he = Float.valueOf(height);
              float bmi= we/(he*he);
              if(bmi<18.5){
                request.setAttribute("status", "UnderWeight");
                request.setAttribute("cl", "#0069d9");
                request.setAttribute("BMI", bmi);
              }else if(bmi>=18.5 &&bmi<25){
                   request.setAttribute("status", "Normal");
                request.setAttribute("cl", "green");
                request.setAttribute("BMI", bmi);
              }
              else if(bmi>=25 &&bmi<30){
                   request.setAttribute("status", "Over Weight");
                request.setAttribute("cl", "#e16d06");
                request.setAttribute("BMI", bmi);
              }else{
                request.setAttribute("status", "Obese");
                request.setAttribute("cl", "red");
                request.setAttribute("BMI", bmi);
              }
                request.setAttribute("list", findAll());
              request.getRequestDispatcher("index.jsp").forward(request, response);
          }else if(action.equals("Del")){
              String id =request.getParameter("id");
              delCustomer(Integer.valueOf(id));
              response.sendRedirect("HomeServlet");
          }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private java.util.List<ws.Customer> findAll() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.CustomerWS port = service.getCustomerWSPort();
        return port.findAll();
    }

    private void addCustomer(ws.Customer customer) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.CustomerWS port = service.getCustomerWSPort();
        port.addCustomer(customer);
    }

    private void delCustomer(int id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.CustomerWS port = service.getCustomerWSPort();
        port.delCustomer(id);
    }

}
