package org.apache.jsp.WEB_002dINF.pages.group;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chat_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "side_nav.jsp", out, false);
      out.write("\n");
      out.write("<div class=\"content-right\">\n");
      out.write("    <div class=\"post-input-wrap\">\n");
      out.write("        <form>\n");
      out.write("            <div class=\"post-input\">\n");
      out.write("                <textarea name=\"post-input-content\"></textarea>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"post-input-submit\">\n");
      out.write("                <input type=\"submit\" value=\"Chat\"/>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"post-container\">\n");
      out.write("        <div class=\"post-output-wrap\">\n");
      out.write("            <div class=\"post-output-img\">\n");
      out.write("                <img width=\"40px\" height=\"40px \" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/waterloo_logo.png\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"post-output\">\n");
      out.write("                <div class=\"post-output-name\">SANGHWAN KIM</div>\n");
      out.write("                <div class=\"post-output-content\">w: auto; overflow: aulow: auto; overflow: auto;</div>\n");
      out.write("                <div class=\"post-output-time\">10 hours ago</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"post-output-wrap\">\n");
      out.write("            <div class=\"post-output-img\">\n");
      out.write("                <img width=\"40px\" height=\"40px \" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/waterloo_logo.png\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"post-output\">\n");
      out.write("                <div class=\"post-output-name\">SANGHWAN KIM</div>\n");
      out.write("                <div class=\"post-output-content\">w: auto; overflow: auto; overflow: auto;o; overflow: auto; overflow: auto; o; overflow: auto; overflow: auto;</div>\n");
      out.write("                <div class=\"post-output-time\">10 hours ago</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"post-output-wrap\">\n");
      out.write("            <div class=\"post-output-img\">\n");
      out.write("                <img width=\"40px\" height=\"40px \" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/waterloo_logo.png\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"post-output\">\n");
      out.write("                <div class=\"post-output-name\">SANGHWAN KIM</div>\n");
      out.write("                <div class=\"post-output-content\">w: auto; overflow: auto; overflow: auto;o; overflow: auto; overflow: auto; o; overflow: auto; overflow: auto;</div>\n");
      out.write("                <div class=\"post-output-time\">10 hours ago</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"post-output-wrap\">\n");
      out.write("            <div class=\"post-output-img\">\n");
      out.write("                <img width=\"40px\" height=\"40px \" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/waterloo_logo.png\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"post-output\">\n");
      out.write("                <div class=\"post-output-name\">SANGHWAN KIM</div>\n");
      out.write("                <div class=\"post-output-content\">w: auto; overflow: auto; overflow: auto;o; overflow: auto; flow: auto; overflow: auto;o; overflow: au flow: auto; overflow: auto;o; overflow: au overflow: auto; o; overflow: auto; overflow: auto;</div>\n");
      out.write("                <div class=\"post-output-time\">10 hours ago</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"post-output-wrap\">\n");
      out.write("            <div class=\"post-output-img\">\n");
      out.write("                <img width=\"40px\" height=\"40px \" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/waterloo_logo.png\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"post-output\">\n");
      out.write("                <div class=\"post-output-name\">SANGHWAN KIM</div>\n");
      out.write("                <div class=\"post-output-content\">w: auto; overflow: auto; overflow: auto;o; overflow: auto; flow: auto; overflow: auto;o; overflow: au flow: auto; overflow: auto;o; overflow: au overflow: auto; o; overflow: auto; overflow: auto;</div>\n");
      out.write("                <div class=\"post-output-time\">10 hours ago</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"post-output-wrap\">\n");
      out.write("            <div class=\"post-output-img\">\n");
      out.write("                <img width=\"40px\" height=\"40px \" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/waterloo_logo.png\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"post-output\">\n");
      out.write("                <div class=\"post-output-name\">SANGHWAN KIM</div>\n");
      out.write("                <div class=\"post-output-content\">w: auto; overflow: auto; overflow: auto;o; overflow: auto; flow: auto; overflow: auto;o; overflow: au flow: auto; overflow: auto;o; overflow: au overflow: auto; o; overflow: auto; overflow: auto;</div>\n");
      out.write("                <div class=\"post-output-time\">10 hours ago</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"post-output-wrap\">\n");
      out.write("            <div class=\"post-output-img\">\n");
      out.write("                <img width=\"40px\" height=\"40px \" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/waterloo_logo.png\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"post-output\">\n");
      out.write("                <div class=\"post-output-name\">SANGHWAN KIM</div>\n");
      out.write("                <div class=\"post-output-content\">w: auto; overflow: auto; overflow: auto;o; overflow: auto; flow: auto; overflow: auto;o; overflow: au flow: auto; overflow: auto;o; overflow: au overflow: auto; o; overflow: auto; overflow: auto;</div>\n");
      out.write("                <div class=\"post-output-time\">10 hours ago</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"post-output-wrap\">\n");
      out.write("            <div class=\"post-output-img\">\n");
      out.write("                <img width=\"40px\" height=\"40px \" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/waterloo_logo.png\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"post-output\">\n");
      out.write("                <div class=\"post-output-name\">SANGHWAN KIM</div>\n");
      out.write("                <div class=\"post-output-content\">w: auto; overflow: auto; overflow: auto;o; overflow: auto; flow: auto; overflow: auto;o; overflow: au flow: auto; overflow: auto;o; overflow: au overflow: auto; o; overflow: auto; overflow: auto;</div>\n");
      out.write("                <div class=\"post-output-time\">10 hours ago</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"post-output-wrap\">\n");
      out.write("            <div class=\"post-output-img\">\n");
      out.write("                <img width=\"40px\" height=\"40px \" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/waterloo_logo.png\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"post-output\">\n");
      out.write("                <div class=\"post-output-name\">SANGHWAN KIM</div>\n");
      out.write("                <div class=\"post-output-content\">w: auto; overflow: auto; overflow: auto;o; overflow: auto; flow: auto; overflow: auto;o; overflow: au flow: auto; overflow: auto;o; overflow: au overflow: auto; o; overflow: auto; overflow: auto;</div>\n");
      out.write("                <div class=\"post-output-time\">10 hours ago</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
