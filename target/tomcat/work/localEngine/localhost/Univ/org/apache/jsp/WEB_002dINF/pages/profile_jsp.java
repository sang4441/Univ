package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"content-left\">\n");
      out.write("    <ul class=\"nav-left\">\n");
      out.write("        <li class=\"nav-left-img\"><img align=\"middle\" width=\"200px\" height=\"100px\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/effel.jpg\" alt=\"effel tower\"></li>\n");
      out.write("        <li class=\"nav-left-menu\"><a href=\"#\">UW Act</a></li>\n");
      out.write("        <li class=\"nav-left-menu\"><a href=\"#\">Meeting/Events</a></li>\n");
      out.write("        <li class=\"nav-left-menu\"><a href=\"#\">Images/Videos</a></li>\n");
      out.write("        <li class=\"nav-left-menu\"><a href=\"#\">Chat</a></li>\n");
      out.write("        <li class=\"nav-left-menu active\"><a href=\"#\">Members</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("<div class=\"content-right\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("    ");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("    ");
      out.write('\n');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
