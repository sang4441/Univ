package org.apache.jsp.WEB_002dINF.pages.group;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class event_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "side_nav.jsp", out, false);
      out.write("\n");
      out.write("<div class=\"content-right\">\n");
      out.write("    <div class=\"event-header\">\n");
      out.write("        <p><a class=\"btn btn-default\" id=\"create-event\" role=\"button\">Create event/meeting</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"event-wrap\">\n");
      out.write("        <div class=\"event-content\">\n");
      out.write("            <div class=\"event-img\">\n");
      out.write("                <img width=\"40px\" height=\"40px \" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/waterloo_logo.png\"> UW act\n");
      out.write("            </div>\n");
      out.write("            <div class=\"event-name\">Meeting name: Event name</div>\n");
      out.write("            <div class=\"event-description\">Description: My description</div>\n");
      out.write("            <div class=\"event-location\">Location: RCH 301</div>\n");
      out.write("            <div class=\"event-created-time\">10 hours ago</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"event-date-wrap\">\n");
      out.write("            <div class=\"event-date-container\">\n");
      out.write("                <div class=\"event-month-year\"><span class=\"event-month\">Jan</span><span class=\"event-year\">'14</span></div>\n");
      out.write("                <div class=\"event-day\">7th</div>\n");
      out.write("                <div class=\"event-time\">8:00 pm</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"event-wrap\">\n");
      out.write("        <div class=\"event-content\">\n");
      out.write("            <div class=\"event-img\">\n");
      out.write("                <img width=\"40px\" height=\"40px \" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/waterloo_logo.png\"> UW act\n");
      out.write("            </div>\n");
      out.write("            <div class=\"event-name\">Meeting name: Event name</div>\n");
      out.write("            <div class=\"event-description\">Description: My description</div>\n");
      out.write("            <div class=\"event-location\">Location: RCH 301</div>\n");
      out.write("            <div class=\"event-created-time\">10 hours ago</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"event-date-wrap\">\n");
      out.write("            <div class=\"event-date-container\">\n");
      out.write("                <div class=\"event-month-year\"><span class=\"event-month\">Jan</span><span class=\"event-year\">'14</span></div>\n");
      out.write("                <div class=\"event-day\">7th</div>\n");
      out.write("                <div class=\"event-time\">8:00 pm</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"event-wrap\">\n");
      out.write("        <div class=\"event-content\">\n");
      out.write("            <div class=\"event-img\">\n");
      out.write("                <img width=\"40px\" height=\"40px \" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/waterloo_logo.png\"> UW act\n");
      out.write("            </div>\n");
      out.write("            <div class=\"event-name\">Meeting name: Event name</div>\n");
      out.write("            <div class=\"event-description\">Description: My description</div>\n");
      out.write("            <div class=\"event-location\">Location: RCH 301</div>\n");
      out.write("            <div class=\"event-created-time\">10 hours ago</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"event-date-wrap\">\n");
      out.write("            <div class=\"event-date-container\">\n");
      out.write("                <div class=\"event-month-year-past\"><span class=\"event-month\">Jan</span><span class=\"event-year-past\">'14</span></div>\n");
      out.write("                <div class=\"event-day\">7th</div>\n");
      out.write("                <div class=\"event-time\">8:00 pm</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"event-wrap\">\n");
      out.write("        <div class=\"event-content\">\n");
      out.write("            <div class=\"event-img\">\n");
      out.write("                <img width=\"40px\" height=\"40px \" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/waterloo_logo.png\"> UW act\n");
      out.write("            </div>\n");
      out.write("            <div class=\"event-name\">Meeting name: Event name</div>\n");
      out.write("            <div class=\"event-description\"> Description: My description Description: My description Description: My description Description: My description Description: My description Description: My description Description: My description Description: My description Description: My description</div>\n");
      out.write("            <div class=\"event-location\">Location: RCH 301</div>\n");
      out.write("            <div class=\"event-created-time\">10 hours ago</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"event-date-wrap\">\n");
      out.write("            <div class=\"event-date-container\">\n");
      out.write("                <div class=\"event-month-year-past\"><span class=\"event-month\">Jan</span><span class=\"event-year-past\">'14</span></div>\n");
      out.write("                <div class=\"event-day\">7th</div>\n");
      out.write("                <div class=\"event-time\">8:00 pm</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"event-wrap\">\n");
      out.write("        <div class=\"event-content\">\n");
      out.write("            <div class=\"event-img\">\n");
      out.write("                <img width=\"40px\" height=\"40px \" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/waterloo_logo.png\"> UW act\n");
      out.write("            </div>\n");
      out.write("            <div class=\"event-name\">Meeting name: Event name</div>\n");
      out.write("            <div class=\"event-description\">Description: My description</div>\n");
      out.write("            <div class=\"event-location\">Location: RCH 301</div>\n");
      out.write("            <div class=\"event-created-time\">10 hours ago</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"event-date-wrap\">\n");
      out.write("            <div class=\"event-date-container\">\n");
      out.write("                <div class=\"event-month-year-past\"><span class=\"event-month\">Jan</span><span class=\"event-year-past\">'14</span></div>\n");
      out.write("                <div class=\"event-day\">7th</div>\n");
      out.write("                <div class=\"event-time\">8:00 pm</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function() {\n");
      out.write("        $('#create-event').click(function() {\n");
      out.write("            $.colorbox({href:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/create_event_form/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${group.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"});\n");
      out.write("        })\n");
      out.write("    });\n");
      out.write("</script>");
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
