package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/UItemplate/headTag.jsp");
    _jspx_dependants.add("/UItemplate/allHeader.jsp");
    _jspx_dependants.add("/UItemplate/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    ");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link href=\"resources/css/site.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"resources/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <script src=\"resources/js/jquery-2.2.3.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!--script src=\"resources/js/bootstrap.js\" type=\"text/javascript\"></script-->\n");
      out.write("    <script src=\"resources/js/siteScript.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"resources/js/jspdf.debug.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!--link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\"-->\n");
      out.write("</head>");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("<header>\n");
      out.write("    <div class=\"row\" style=\"background-color: #F5C52C\">\n");
      out.write("        <div class=\"text-left col-md-1\">\n");
      out.write("            <img src=\"resources/images/nmims-logo.jpg\" alt=\"nmims Logo\" width=\"300\" height=\"200\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-offset-2 col-md-6\" style=\"padding-top: 20px\">\n");
      out.write("             <h1 class=\"text-center\" style=\"font-weight: bold;font-size: 300%;color: red\">Lost and Found Management System</h1> \n");
      out.write("             <marquee direction=\"left\"><h1 class=\"text-center\" style=\"font-weight: bold;font-size:150%;color:blue\">MUKESH PATEL SCHOOL OF TECHNOLOGY MANAGEMENT AND ENGINEERING</h1></marquee> \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container-fluid custom-container\">\n");
      out.write("        <a href=\"userServlet?userId=1\">REQUESTER</a>\n");
      out.write("        <a href=\"userServlet?userId=2\">SECURITY</a>\n");
      out.write("    </div>\n");
      out.write("</header>");
      out.write("\n");
      out.write("    <body class=\"bg\">\n");
      out.write("        <h1 style=\"font-size: 300%;font-weight: bold;color:blue\">Home Page</h1>\n");
      out.write("    </body>\n");
      out.write("    ");
      out.write("<footer>\n");
      out.write("    <hr style=\"border-bottom: 1px solid gray; \" />\n");
      out.write("    <p class=\"container-fluid\" style=\"text-align: center\">Copyright &copy; 2017 MPSTME.co.in. All Rights Reserved.</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
