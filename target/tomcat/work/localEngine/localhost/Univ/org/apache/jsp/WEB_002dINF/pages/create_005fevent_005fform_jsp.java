package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_005fevent_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <h1>Event create!!!</h1>\n");
      out.write("\n");
      out.write("<form action=\"create_event\" method=\"post\">\n");
      out.write("    <div><input type=\"text\" name=\"title\" placeholder=\"title\"/></div>\n");
      out.write("    <div><textarea name=\"description\" rows=\"4\" cols=\"50\" placeholder=\"description\"></textarea></div>\n");
      out.write("    <div><input type=\"text\" name=\"location\" placeholder=\"location\"/></div>\n");
      out.write("    ");
      out.write("\n");
      out.write("    <label class=\"radio\">\n");
      out.write("        <input type=\"radio\" name=\"public\" id=\"optionsRadios1\" value=\"public\" checked>\n");
      out.write("        public</label>\n");
      out.write("    <label class=\"radio\">\n");
      out.write("        <input type=\"radio\" name=\"private\" id=\"optionsRadios2\" value=\"private\">\n");
      out.write("        private\n");
      out.write("    </label>\n");
      out.write("    <div><input type=\"text\" name=\"privacy\" placeholder=\"privacy\"></div>\n");
      out.write("    <div><input type=\"submit\" value=\"Create event\"></div>\n");
      out.write("</form>");
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
