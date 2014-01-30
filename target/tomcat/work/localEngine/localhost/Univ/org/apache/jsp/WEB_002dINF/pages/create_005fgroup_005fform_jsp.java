package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_005fgroup_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <h1>Group create!!!</h1>\n");
      out.write("\t\n");
      out.write("\t");
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t  ");
      out.write("\n");
      out.write("\t\t\t  ");
      out.write("\n");
      out.write("\t\t\t  ");
      out.write("\n");
      out.write("\t\t\t");
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t  ");
      out.write("\n");
      out.write("\t\t\t  ");
      out.write("\n");
      out.write("\t\t\t  ");
      out.write("\n");
      out.write("\t\t\t  ");
      out.write("\n");
      out.write("\t\t\t  ");
      out.write("\n");
      out.write("\t\t\t  ");
      out.write("\n");
      out.write("\t\t\t  ");
      out.write("\n");
      out.write("\t\t\t  ");
      out.write("\n");
      out.write("\t\t\t  ");
      out.write("\n");
      out.write("\t\t\t");
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"create_group\" method=\"post\">\n");
      out.write("    <div><input type=\"text\" name=\"name\" placeholder=\"name\"/></div>\n");
      out.write("    <div><textarea name=\"description\" rows=\"4\" cols=\"50\" placeholder=\"description\"></textarea></div>\n");
      out.write("    <div>\n");
      out.write("        <select name=\"typeId\">\n");
      out.write("            <option disabled>Choose type of your group</option>\n");
      out.write("            <option value=\"1\">Club</option>\n");
      out.write("            <option value=\"2\">Team</option>\n");
      out.write("        </select>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("        <select name=\"categoryId\">\n");
      out.write("            <option disabled>Choose category of your group</option>\n");
      out.write("            <option value=\"2\">Sports & athletic</option>\n");
      out.write("            <option value=\"3\">Arts & Music</option>\n");
      out.write("            <option value=\"4\">Charitable, cummunity service</option>\n");
      out.write("            <option value=\"5\">Health</option>\n");
      out.write("            <option value=\"6\">Learning & Academics & project</option>\n");
      out.write("            <option value=\"7\">Entertainment & leisure & life style</option>\n");
      out.write("            <option value=\"8\">Business, leadership, enterpreneur</option>\n");
      out.write("            <option value=\"9\">Religion & Culture</option>\n");
      out.write("        </select>\n");
      out.write("    </div>\n");
      out.write("    <div><input type=\"submit\" value=\"Create group\"></div>\n");
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
