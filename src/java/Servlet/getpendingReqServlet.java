/*package Servlet;

import Model.ApplicationDate;
import Model.mainTable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getpendingReqServlet extends HttpServlet

{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        List mtList = new ArrayList<>();
      /*  try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@10.147.66.56:1521:xe", "SYSTEM", "123456");
            st = con.createStatement();
            rs = st.executeQuery("Select * from MAINTABLE where STATUS=1");
            while (rs.next()) 
            {
                mainTable mt = new mainTable();
                mt.setUniqueId(rs.getString(1));
                mt.setAssetName(rs.getString(2));
                mt.setSerialNo(rs.getString(3));
                mt.setMakeType(rs.getString(4));
                mt.setModeltype(rs.getString(5));
                mt.setIssuedBy(rs.getString(6));
                mt.setIsApproval(rs.getString(7));
                mt.setAdminApproval(rs.getString(8));
                mt.setIssueDate(rs.getDate(9));
                mt.setStrissueDate(ApplicationDate.convertUtilDatetoString(mt.getIssueDate()));
                mt.setReturnable(rs.getString(13));
                mt.setGpGenerated(rs.getString(10));
                mt.setIssue(rs.getString(11));
                mt.setIssuedTo(rs.getString(17));
                mt.setTransfer(rs.getString(18));
                mtList.add(mt);
            }
            request.setAttribute("mtList", mtList);
        }
        catch (ClassNotFoundException | SQLException e2)
        {
            System.out.println(e2);
        } 
        finally
        {
            try {
                if (st != null)
                {
                    st.close();
                }
                if (con != null)
                {
                    con.close();
                }
            } 
            catch (SQLException ex) {
                Logger.getLogger(IssuePassServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        RequestDispatcher rd = request.getRequestDispatcher("/IS.jsp");
        rd.forward(request, response);
    }*/

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  /*  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }*/

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   /* @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   /* @Override
    public String getServletInfo()
    {
        return "Short description";
    }}*/
