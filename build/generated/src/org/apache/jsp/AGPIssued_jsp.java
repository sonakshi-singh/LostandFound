package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AGPIssued_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/UItemplate/header.jsp");
    _jspx_dependants.add("/UItemplate/headTag.jsp");
    _jspx_dependants.add("/UItemplate/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      out.write("        <title>Admin</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    ");
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
      out.write("    <body class=\"bg\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h1 style=\"color:blue;font-size: 200%\" >Administration</h1>\n");
      out.write("        <h1 id=\"PR\" style=\"color: blue; font-size: 200% ; font-weight: bold\">GatePass Issued</h1><br>\n");
      out.write("        \n");
      out.write("        <form name=\"formhistory\" action=\"AdminHistoryServlet\"  method=\"post\" class=\"form-inline\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"from\" style=\"font-size: 120%\">From:</label>\n");
      out.write("                <input type=\"date\" class=\"form-control\" name=\"fromdate\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"to\" style=\"font-size: 120%\">To:</label>\n");
      out.write("                <input type=\"date\" class=\"form-control\" name=\"todate\">\n");
      out.write("            </div>\n");
      out.write("            <input   type=\"submit\" value=\"Submit\" style=\"font-size:125% \"/> \n");
      out.write("        </form><br>\n");
      out.write("\n");
      out.write("        <table rules=\"all\" style=\"width:100%; border: 1px solid black\" class=\"css-serial table table-bordered \">\n");
      out.write("            <thead>\n");
      out.write("            <th style=\"text-align: center ;font-size: 100%;font-weight: bold\">No.</th>\n");
      out.write("            <th style=\"text-align: center ;font-size: 100%;font-weight: bold\">EQUIPMENT TYPE</th>\n");
      out.write("            <th style=\"text-align: center ;font-size: 100%;font-weight: bold\">SERIAL NO.</th>\n");
      out.write("            <th style=\"text-align: center ;font-size: 100%;font-weight: bold\">MAKE TYPE</th>\n");
      out.write("            <th style=\"text-align: center ;font-size: 100%;font-weight: bold\">MODEL TYPE</th>\n");
      out.write("            <th style=\"text-align: center ;font-size: 100%;font-weight: bold\">ISSUED BY</th>\n");
      out.write("            <th style=\"text-align: center ;font-size: 100%;font-weight: bold\">IS APPROVAL</th>\n");
      out.write("            <th style=\"text-align: center ;font-size: 100%;font-weight: bold\">ADMIN APPROVAL</th>\n");
      out.write("            <th style=\"text-align: center ;font-size: 100%;font-weight: bold\">ISSUE DATE</th>\n");
      out.write("            <th style=\"text-align: center ;font-size: 100%;font-weight: bold\">RETURNABLE</th>\n");
      out.write("            <th style=\"text-align: center ;font-size: 100%;font-weight: bold\">ISSUED TO</th>\n");
      out.write("            <th style=\"text-align: center ;font-size: 100%;font-weight: bold\">TYPE OF TRANSFER</th>\n");
      out.write("            <th style=\"text-align: center ;font-size: 100%;font-weight: bold\">GP GENERATED</th>\n");
      out.write("            \n");
      out.write("        </thead>\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<footer>\n");
      out.write("    <hr style=\"border-bottom: 1px solid gray; \" />\n");
      out.write("    <p class=\"container-fluid\" style=\"text-align: center\">Copyright &copy; 2017 MPSTME.co.in. All Rights Reserved.</p>\n");
      out.write("</footer>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("data");
    _jspx_th_c_forEach_0.setVarStatus("count");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <tr>\n");
          out.write("                <td></td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.assetName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.serialNo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.makeType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.modeltype}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.issuedBy}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.isApproval}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.adminApproval}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.strissueDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.returnable}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.issuedTo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.transfer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.gpGenerated}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\n");
          out.write("                \n");
          out.write("            </tr>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
