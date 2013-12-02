/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.africomgroup.server;

import com.africomgroup.wcia.dto.QuoteRequest;
import com.africomgroup.wcia.entities.CARPETTYPE;
import com.africomgroup.wcia.entities.CleaningService;
import com.africomgroup.wcia.entities.Customer;
import com.africomgroup.wcia.entities.House;
import com.africomgroup.wcia.entities.Quote;
import com.africomgroup.wcia.entities.Room;
import java.io.IOException;
import javax.ejb.EJB;
import javax.naming.Context;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jordy Mugeni
 */
@WebServlet(name = "wciacontroller", urlPatterns = {"/wciacontroller.do"})
public class wciacontroller extends HttpServlet {

    @EJB
    private com.africomgroup.wcia.components.session.Quote quoteSession;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        String operation = request.getParameter("operation");
        String cellNo = request.getParameter("cellNo");

        Customer customer = null;

        String forwardAddress = "";
        Context context = null;

        if (operation == null) {
            operation = "unknown";
        }

        if (operation.equals("quote")) {

            try {
                
                com.africomgroup.wcia.dto.QuoteRequest quote =new QuoteRequest();

                CleaningService houseCleaning = new CleaningService ();
                
                House house = new House("Town house");
                Room room1 = new Room("Bedroom 1", 9, 10, CARPETTYPE.SIMPLE);
                room1.setCarpetType(CARPETTYPE.SIMPLE);

                System.out.println(room1);

                Room room2 = new Room("Bedroom 2");
                System.out.println(room2);

                house.addRoom(room1);
                house.addRoom(room2);
                
                quote.addService(houseCleaning);
                
                quoteSession.calculateQuote(quote);

                try {
                    //customer= dao.findById(cellNo);
                    if (customer != null) {
                        //create record
                        session.setAttribute("customer", customer);

                    } else {
                        customer = new Customer("online");
                        customer.setId(Integer.getInteger(cellNo).intValue());
                        customer.setSurname("online");
                   // dao.create(customer); 

                        session.setAttribute("customer", customer);
                    }

                } catch (Exception ex) {
                    System.out.println("" + ex.getMessage());
                    //ut.rollback();
                }
                // ut.commit();
                Quote qute = new Quote();
                qute.setId("WS123");
                qute.setTotal(1000);

                session.setAttribute("quote", qute);
                forwardAddress = "/WEB-INF/quote.jsp";
            } catch (Exception ex) {

            }
        } else if (operation.equals("invoice")) {
            forwardAddress = "/WEB-INF/invoice.jsp";
        } else if (operation.equals("successQuote")) {
            forwardAddress = "/WEB-INF/successQuote.jsp";
        } else if (operation.equals("rejectQuote")) {
            forwardAddress = "/WEB-INF/thankyou.jsp";

        } else {
            //forwardAddress = "/WEB-INF/unknownOperation.jsp";
            forwardAddress = "/index.xhtml";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(forwardAddress);
        dispatcher.forward(request, response);
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

}
