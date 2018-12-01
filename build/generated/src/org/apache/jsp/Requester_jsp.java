package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Requester_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/UItemplate/headTag.jsp");
    _jspx_dependants.add("/UItemplate/header.jsp");
    _jspx_dependants.add("/UItemplate/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Requester</title>\n");
      out.write("        <script>\n");
      out.write("                    function myFunction()\n");
      out.write("                    {\n");
      out.write("                        var x = document.getElementById(\"snackbar\");\n");
      out.write("                        x.className = \"show\";\n");
      out.write("                        setTimeout(function () {\n");
      out.write("                            x.className = x.className.replace(\"show\", \"\");\n");
      out.write("                        }, 3000);\n");
      out.write("                    }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"bg site\">\n");
      out.write("        ");
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
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("    <div class=\"row\" style=\"background-color: #F5C52C\">\n");
      out.write("        <div class=\"text-left col-md-1\">\n");
      out.write("            <img src=\"resources/images/nmims-logo.jpg\" alt=\"nmims Logo\" width=\"300\" height=\"200\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-offset-2 col-md-6\" style=\"padding-top: 20px\">\n");
      out.write("            <h1 class=\"text-center\" style=\"font-weight: bold;font-size: 300%;color:red\">Lost and Found Management System</h1> \n");
      out.write("            <marquee direction=\"left\" scrollamount='6'><h1 class=\"text-center\" style=\"font-weight: bold;font-size:150%;color:blue\">MUKESH PATEL SCHOOL OF TECHNOLOGY MANAGEMENT AND ENGINEERING</h1></marquee> \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"container-fluid custom-container\">\n");
      out.write("        \n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            \n");
      out.write("        \n");
      out.write("            \n");
      out.write("        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            \n");
      out.write("        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            \n");
      out.write("        <a style=\"float: right; color:white;font-weight: bold\" class=\"active\" href=\"Login.jsp\">Log Out</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</header>");
      out.write("\n");
      out.write("        \n");
      out.write("        <h1 style=\" color: blue; text-align:center;\">Issue Request</h1><br><br>\n");
      out.write("\n");
      out.write("        <form name=\"form\" action=\"issuePass\"  method=\"post\" align=\"center\" class=\".form-horizontal\" >\n");
      out.write("            \n");
      out.write("                <center><table>\n");
      out.write("                    <tr><td style=\"font-size: 20px\"><label class=\".control-label\">Name</label></td>\n");
      out.write("                        <td><input  class=\".form-control\" type=\"text\" style=\"font-size:75%\" name=\"Name\" required></td></p></tr><br>\n");
      out.write("                    \n");
      out.write("                     <tr><td style=\"font-size: 20px\"><label class=\".control-label\">Lost Item</label></td>\n");
      out.write("                     <td><input  class=\".form-control\" type=\"text\" style=\"font-size:75%\" name=\"LostItem\" required></td></tr>\n");
      out.write("\n");
      out.write("                     <tr><td style=\"font-size: 20px\"><label class=\".control-label\">Location</label></td>\n");
      out.write("                         <td><input  class=\".form-control\" type=\"text\" style=\"font-size:75%\" name=\"Location\" required></td></tr>\n");
      out.write("\n");
      out.write("                     <tr> <td style=\"font-size: 20px\"><label class=\".control-label\">Details of the item</label>&nbsp&nbsp</td>\n");
      out.write("                         <td><textarea  class=\".form-control\" name=\"Details\" style=\"font-size:75%\"></textarea></td></tr>\n");
      out.write("\n");
      out.write("                <tr><td style=\"font-size: 20px\"><label class=\".control-label\">Date </label></td>\n");
      out.write("                    <td><input  class=\".form-control\" name=\"Date\" type=\"date\"></td><br><br></tr>\n");
      out.write(" \n");
      out.write("                <tr><td style=\"font-size: 15px\" colspan=\"2\"><input  class=\".form-control\" data-toggle=\"tooltip\" title=\"Submit\" onclick=\"myFunction()\" type=\"submit\" value=\"Send Request\" /> \n");
      out.write("                    <div id=\"snackbar\">Request Sent</div></td></tr>\n");
      out.write("\n");
      out.write("                    </table></center>\n");
      out.write("        </form>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userId eq '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <a href=\"Requester.jsp\">Home</a>\n");
        out.write("         ]\n");
        out.write("            <a href=\"index.jsp\">index</a>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userId eq '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <a href=\"APRServlet\">Pending Requests</a>\n");
        out.write("            <div class=\"custom-dropdown\">\n");
        out.write("                <button class=\"dropbtn\">View</button>\n");
        out.write("                <div class=\"custom-dropdown-content\">\n");
        out.write("                    <a href=\"CollectedServlet\">Collected Items</a>\n");
        out.write("                        <a href=\"MatchedServlet\">Matched Items</a>\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("                <a href=\"HistoryServlet\">History</a>\n");
        out.write("            \n");
        out.write("            <a href=\"index.jsp\">index</a>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userId eq '3'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <a href=\"index.jsp\">index</a>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
