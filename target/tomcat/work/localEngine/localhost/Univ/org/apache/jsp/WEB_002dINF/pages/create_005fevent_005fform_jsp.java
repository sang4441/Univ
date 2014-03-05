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
      out.write("<script>\n");
      out.write("    $(function() {\n");
      out.write("        $( \"#datepicker\" ).datepicker();\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<div class=\"row-fluid\">\n");
      out.write("    <div class=\"span10 offset1\">\n");
      out.write("        <h1>New meeting/event</h1>\n");
      out.write("        <form action=\"create_event\" method=\"post\">\n");
      out.write("            <div><input class=\"span10\" type=\"text\" name=\"name\" placeholder=\"name\"/></div>\n");
      out.write("            <div><textarea class=\"span10\" name=\"description\" rows=\"4\" cols=\"50\" placeholder=\"description\"></textarea></div>\n");
      out.write("            <div><input class=\"span10\" type=\"text\" name=\"location\" placeholder=\"location\"/></div>\n");
      out.write("            ");
      out.write("\n");
      out.write("            <label class=\"radio\">\n");
      out.write("                <input type=\"radio\" name=\"event_type\" id=\"optionsRadios1\" value=\"1\" checked>\n");
      out.write("                meeting\n");
      out.write("            </label>\n");
      out.write("            <label calss=\"radio\">\n");
      out.write("                <input type=\"radio\" name=\"event_type\" id=\"optionsRadios2\" value=\"2\">\n");
      out.write("                public event\n");
      out.write("            </label>\n");
      out.write("            <div>Date:\n");
      out.write("                <input  class=\"span8\" type=\"text\" name=\"event_date\" placeholder=\"Event date\" id=\"datepicker\">\n");
      out.write("                <select name=\"time\" multiple=\"multiple\">\n");
      out.write("                    <option>12:00</option>\n");
      out.write("                    <option>12:30</option>\n");
      out.write("                    <option>13:00</option>\n");
      out.write("                    <option>13:30</option>\n");
      out.write("                    <option>14:00</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <label class=\"checkbox\">\n");
      out.write("                <input type=\"checkbox\" name=\"emailNotice\" value=\"\">\n");
      out.write("                Send email notifications to all members\n");
      out.write("            </label>\n");
      out.write("            <div><input type=\"submit\" value=\"Create event\"></div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>");
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
