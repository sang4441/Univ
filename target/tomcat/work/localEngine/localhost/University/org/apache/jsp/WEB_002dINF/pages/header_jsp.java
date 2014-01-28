package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Univ</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/styles.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"row-fluid\">\n");
      out.write("\t<div class=\"span8 offset4\">\n");
      out.write("\t\t<input type=\"text\" placeholder=\"search\"/>\n");
      out.write("\t\t<button type=\"button\">Search</button>\n");
      out.write("\t\t<a href=\"signup\"><button type=\"button\">Sign up</button></a>\n");
      out.write("\t\t<a href=\"create_group_form\"><button type=\"button\">Create Group</button></a>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"resources/lib/jquery-1.7.1.min.js\"></script>\n");
      out.write("<script src=\"resources/lib/underscore-min.js\"></script>\n");
      out.write("<script src=\"resources/lib/backbone-min.js\"></script>\n");
      out.write("<script src=\"resources/lib/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"resources/js/utils.js\"></script>\n");
      out.write("<script src=\"resources/js/models/clubmodel.js\"></script>\n");
      out.write("<script src=\"resources/js/views/header.js\"></script>\n");
      out.write("<script src=\"resources/js/views/clublist.js\"></script>\n");
      out.write("<script src=\"resources/js/main.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\t$('.nav.myMenu > li').bind('mouseover', openSubMenu);\n");
      out.write("\t\t$('.nav.myMenu > li').bind('mouseout', closeSubMenu);\n");
      out.write("\t\t\n");
      out.write("\t\tfunction openSubMenu() {\n");
      out.write("\t\t\t$(this).find('ul').css('visibility', 'visible');\t\n");
      out.write("\t\t};\n");
      out.write("\t\t\n");
      out.write("\t\tfunction closeSubMenu() {\n");
      out.write("\t\t\t$(this).find('ul').css('visibility', 'hidden');\t\n");
      out.write("\t\t};\t\t\t\t   \n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write(" \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
