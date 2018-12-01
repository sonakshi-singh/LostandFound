package Servlet;

import Servlet.IssuePassServlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FoundServlet extends HttpServlet
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String UniqueId = request.getParameter("uniqueId");
        System.out.println("UniqueId = " + UniqueId);
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        try
        {
             String url="jdbc:derby://localhost:1527/LFMS";
            Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection(url,"newdbuser","123");
            st = con.createStatement();
            rs = st.executeQuery("UPDATE MAINTABLE SET STATUS='1'");
        } 
        
        catch (ClassNotFoundException | SQLException e2)
        {
         System.out.println(e2);
        } 
        finally 
        {
            try 
            {
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) 
            {
                Logger.getLogger(IssuePassServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         RequestDispatcher rd = request.getRequestDispatcher("/Admin.jsp");
        rd.forward(request, response);
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
