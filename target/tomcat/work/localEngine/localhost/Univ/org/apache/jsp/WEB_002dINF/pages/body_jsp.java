package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class body_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    ");
      out.write("\n");
      out.write("        <div class=\"span1 offset2\">\n");
      out.write("            <div>\n");
      out.write("                <div class=\"left-nav-title\">Others</div>\n");
      out.write("                <div class=\"left-nav-list\">\n");
      out.write("                    <div>basketball(15)</div>\n");
      out.write("                    <div>baseball(12)</div>\n");
      out.write("                    <div>volleyball(3)</div>\n");
      out.write("                    <div>hockey(1)</div>\n");
      out.write("                    <div>example(5)</div>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"#\"><small>see more</small></a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <div class=\"left-nav-title\">Open range</div>\n");
      out.write("                <label class=\"checkbox\">\n");
      out.write("                    <input type=\"checkbox\"> Public\n");
      out.write("                </label>\n");
      out.write("                <label class=\"checkbox\">\n");
      out.write("                    <input type=\"checkbox\"> Private\n");
      out.write("                </label>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <div class=\"left-nav-title\">Applicable</div>\n");
      out.write("                <label class=\"checkbox\">\n");
      out.write("                    <input type=\"checkbox\"> open\n");
      out.write("                </label>\n");
      out.write("                <label class=\"checkbox\">\n");
      out.write("                    <input type=\"checkbox\"> closed\n");
      out.write("                </label>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"span5\">\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <div id=\"group-content-header\">\n");
      out.write("                            <div id=\"group-navigation\">University of Waterloo / Sports / Soccer</div>\n");
      out.write("                            <div id=\"group-sort\">\n");
      out.write("                                Sort by\n");
      out.write("                                <select class=\"span5\">\n");
      out.write("                                    <option value=\"1\">Date</option>\n");
      out.write("                                    <option value=\"2\">Popularity</option>\n");
      out.write("                                    <option value=\"2\">Members</option>\n");
      out.write("                                </select>\n");
      out.write("                                <a class=\"btn btn-small\"><i class=\" icon-arrow-up\"></i></a>\n");
      out.write("                                <a class=\"btn btn-small\"><i class=\" icon-arrow-down\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li><div class=\"group-box\">\n");
      out.write("\n");
      out.write("                        <div class=\"group-img\">\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/effel.jpg\" alt=\"effel tower\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"group-content\">\n");
      out.write("                                <div class=\"group-create\">Created: Jan-04-2014</div>\n");
      out.write("                                <div class=\"group-info\">\n");
      out.write("                                    <div class=\"group-name\">A Capella Club</div>\n");
      out.write("                                    <div class=\"group-category\">Category: Music</div>\n");
      out.write("                                    <div class=\"group-leader\">Leader: John Kim</div>\n");
      out.write("                                    <div class=\"group-member\">Members: 184 </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li><div class=\"group-box\">\n");
      out.write("\n");
      out.write("                        <div class=\"group-img\">\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/effel.jpg\" alt=\"effel tower\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"group-content\">\n");
      out.write("                                <div class=\"group-create\">Created: Jan-04-2014</div>\n");
      out.write("                                <div class=\"group-info\">\n");
      out.write("                                    <div class=\"group-name\">A Capella Club</div>\n");
      out.write("                                    <div class=\"group-category\">Category: Music</div>\n");
      out.write("                                    <div class=\"group-leader\">Leader: John Kim</div>\n");
      out.write("                                    <div class=\"group-member\">Members: 184 </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li><div class=\"group-box\">\n");
      out.write("\n");
      out.write("                        <div class=\"group-img\">\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/effel.jpg\" alt=\"effel tower\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"group-content\">\n");
      out.write("                                <div class=\"group-create\">Created: Jan-04-2014</div>\n");
      out.write("                                <div class=\"group-info\">\n");
      out.write("                                    <div class=\"group-name\">A Capella Club</div>\n");
      out.write("                                    <div class=\"group-category\">Category: Music</div>\n");
      out.write("                                    <div class=\"group-leader\">Leader: John Kim</div>\n");
      out.write("                                    <div class=\"group-member\">Members: 184 </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li><div class=\"group-box\">\n");
      out.write("\n");
      out.write("                        <div class=\"group-img\">\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/effel.jpg\" alt=\"effel tower\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"group-content\">\n");
      out.write("                            <div class=\"group-create\">Created: Jan-04-2014</div>\n");
      out.write("                            <div class=\"group-info\">\n");
      out.write("                                <div class=\"group-name\">A Capella Club</div>\n");
      out.write("                                <div class=\"group-category\">Category: Music</div>\n");
      out.write("                                <div class=\"group-leader\">Leader: John Kim</div>\n");
      out.write("                                <div class=\"group-member\">Members: 184 </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li><div class=\"group-box\">\n");
      out.write("\n");
      out.write("                        <div class=\"group-img\">\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/effel.jpg\" alt=\"effel tower\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"group-content\">\n");
      out.write("                            <div class=\"group-create\">Created: Jan-04-2014</div>\n");
      out.write("                            <div class=\"group-info\">\n");
      out.write("                                <div class=\"group-name\">A Capella Club</div>\n");
      out.write("                                <div class=\"group-category\">Category: Music</div>\n");
      out.write("                                <div class=\"group-leader\">Leader: John Kim</div>\n");
      out.write("                                <div class=\"group-member\">Members: 184 </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"span2\">\n");
      out.write("            <div class=\"group-event\">\n");
      out.write("                <div class=\"see-all\"> See All</div>\n");
      out.write("                <div class=\"event-head\"><i class=\"icon-calendar\"></i> Upcoming Events</div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"group-event-date\">\n");
      out.write("                    <div class=\"group-event-schedule\">Nov<div>14th</div></div>\n");
      out.write("                    <div class=\"group-event-content\">\n");
      out.write("                        <div class=\"group-event-clubname\">UW Colic</div>\n");
      out.write("                        <div class=\"group-event-type\">Indoor Soccer Game</div>\n");
      out.write("                        <div class=\"group-event-time\">7 PM - 9 PM</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"group-event-date\">\n");
      out.write("                    <div class=\"group-event-schedule\">Nov<div>14th</div></div>\n");
      out.write("                    <div class=\"group-event-content\">\n");
      out.write("                        <div class=\"group-event-clubname\">UW Colic</div>\n");
      out.write("                        <div class=\"group-event-type\">Indoor Soccer Game</div>\n");
      out.write("                        <div class=\"group-event-time\">7 PM - 9 PM</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"group-event-date\">\n");
      out.write("                    <div class=\"group-event-schedule\">Nov<div>14th</div></div>\n");
      out.write("                    <div class=\"group-event-content\">\n");
      out.write("                        <div class=\"group-event-clubname\">UW Colic</div>\n");
      out.write("                        <div class=\"group-event-type\">Indoor Soccer Game</div>\n");
      out.write("                        <div class=\"group-event-time\">7 PM - 9 PM</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"group-event-date\">\n");
      out.write("                    <div class=\"group-event-schedule\">Nov<div>14th</div></div>\n");
      out.write("                    <div class=\"group-event-content\">\n");
      out.write("                        <div class=\"group-event-clubname\">UW Colic</div>\n");
      out.write("                        <div class=\"group-event-type\">Indoor Soccer Game</div>\n");
      out.write("                        <div class=\"group-event-time\">7 PM - 9 PM</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"group-event-date\">\n");
      out.write("                    <div class=\"group-event-schedule\">Nov<div>14th</div></div>\n");
      out.write("                    <div class=\"group-event-content\">\n");
      out.write("                        <div class=\"group-event-clubname\">UW Colic</div>\n");
      out.write("                        <div class=\"group-event-type\">Indoor Soccer Game</div>\n");
      out.write("                        <div class=\"group-event-time\">7 PM - 9 PM</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"addition-li\"> View More...</div>\n");
      out.write("            ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("        </div>\n");
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
