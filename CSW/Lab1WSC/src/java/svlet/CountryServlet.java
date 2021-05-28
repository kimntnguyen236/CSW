/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svlet;

import fpt.aptech.Country;
import fpt.aptech.CountryWS_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author sinhtm
 */
public class CountryServlet extends HttpServlet {

    @WebServiceRef() //wsdlLocation = "WEB-INF/wsdl/localhost_9999/Lab1WS-war/CountryWS.wsdl"
    private CountryWS_Service service;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String action = request.getParameter("action");

            if (action == null) {
                request.setAttribute("list", findAll());
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            } else if (action.equals("Create")) {
                String name = request.getParameter("txtName");
                String ccode = request.getParameter("txtCode");
                String lcode = request.getParameter("txtLCode");
                String p = request.getParameter("txtPop");
                int pop = Integer.parseInt(p);
                Country c = new Country();
                c.setName(name);
                c.setCountrycode(ccode);
                c.setLanguagecode(lcode);
                c.setPopulation(pop);

                saveCountry(c);
                response.sendRedirect("CountryServlet");
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

    private java.util.List<fpt.aptech.Country> findAll() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        fpt.aptech.CountryWS port = service.getCountryWSPort();
        return port.findAll();
    }

    private boolean saveCountry(fpt.aptech.Country country) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        fpt.aptech.CountryWS port = service.getCountryWSPort();
        return port.saveCountry(country);
    }

}
