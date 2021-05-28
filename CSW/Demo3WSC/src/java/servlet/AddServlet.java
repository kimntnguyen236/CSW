/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import ws.WorkeerWS_Service;
import ws.Worker;

/**
 *
 * @author lenovo
 */
public class AddServlet extends HttpServlet {

    @WebServiceRef()
    private WorkeerWS_Service service;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        String txtName =  request.getParameter("txtName");
          String txtPhone =  request.getParameter("txtPhone");
          String txtSalary =  request.getParameter("txtSalary");
          String txtdayNumber =  request.getParameter("txtdayNumber");
          BigDecimal txtBhxh =  BigDecimal.valueOf(Double.valueOf(txtSalary)*8/100);
          BigDecimal txtBhtn =  BigDecimal.valueOf(Double.valueOf(txtSalary)*1/100);
          Worker worker = new Worker();
          worker.setName(txtName);
          worker.setPhone(txtPhone);
          worker.setSalaryPerday(BigDecimal.valueOf(Double.parseDouble(txtSalary)));
          worker.setDaynumber(Integer.valueOf(txtdayNumber));
          worker.setBhxh(txtBhxh);
          worker.setBhtn(txtBhtn);
          addWorker(worker);
          response.sendRedirect("HomeServlet");
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

    private void addWorker(ws.Worker worker) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.WorkeerWS port = service.getWorkeerWSPort();
        port.addWorker(worker);
    }

}
