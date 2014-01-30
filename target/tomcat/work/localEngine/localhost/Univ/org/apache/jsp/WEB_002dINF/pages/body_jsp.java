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
      out.write("        <div class=\"span7\">\n");
      out.write("            <div class=\"group-box\">\n");
      out.write("                <div class=\"group-create\">Created: Jan-04-2014</div>\n");
      out.write("                <div class=\"group-img\">\n");
      out.write("                    <img src=\"resources/img/effel.jpg\" alt=\"effel tower\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"group-info\">\n");
      out.write("                    <div class=\"group-name\">A Capella Club</div>\n");
      out.write("                    <div class=\"group-category\">Category: Music</div>\n");
      out.write("                    <div class=\"group-leader\">Leader: John Kim</div>\n");
      out.write("                    <div class=\"group-member\">Members: 184 </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Second Category for SNS group -->\n");
      out.write("            <div class=\"group-box\">\n");
      out.write("                <div class=\"group-create\">Created: Jan-08-2014</div>\n");
      out.write("                <div class=\"group-img\">\n");
      out.write("                    <img src=\"resources/img/facebook.jpg\" alt=\"facebook\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"group-info\">\n");
      out.write("                    <div class=\"group-name\">Facebook</div>\n");
      out.write("                    <div class=\"group-category\">Category: SNS</div>\n");
      out.write("                    <div class=\"group-leader\">Leader: John Kim</div>\n");
      out.write("                    <div class=\"group-member\">Members: 234 </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Third Category for soccer -->\n");
      out.write("            <div>\n");
      out.write("                <div class=\"group-box\">\n");
      out.write("                    <div class=\"group-create\">Created: Jan-12-2014</div>\n");
      out.write("                    <div class=\"group-img\">\n");
      out.write("                        <img src=\"resources/img/soccer.jpg\" alt=\"soccer\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"group-info\">\n");
      out.write("                        <div class=\"group-name\">UW Warriors Soccer Team</div>\n");
      out.write("                        <div class=\"group-category\">Category: Sports</div>\n");
      out.write("                        <div class=\"group-leader\">Leader: Messi</div>\n");
      out.write("                        <div class=\"group-member\">Members: 3042 </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Fourth Category for mma -->\n");
      out.write("            <div>\n");
      out.write("                <div class=\"group-box\">\n");
      out.write("                    <div class=\"group-create\">Created: Jan-12-2014</div>\n");
      out.write("                    <div class=\"group-img\">\n");
      out.write("                        <img src=\"resources/img/mma.jpg\" alt=\"mma\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"group-info\">\n");
      out.write("                        <div class=\"group-name\">Ultimate Fighting Club</div>\n");
      out.write("                        <div class=\"group-category\">Category: Sports</div>\n");
      out.write("                        <div class=\"group-leader\">Leader: Fedor</div>\n");
      out.write("                        <div class=\"group-member\">Members: 594 </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"group-box\">\n");
      out.write("                    <div class=\"group-create\">Created: Jan-12-2014</div>\n");
      out.write("                    <div class=\"group-img\">\n");
      out.write("                        <img src=\"resources/img/medical.jpg\" alt=\"medical\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"group-info\">\n");
      out.write("                        <div class=\"group-name\">Hospital Association</div>\n");
      out.write("                        <div class=\"group-category\">Category: Health</div>\n");
      out.write("                        <div class=\"group-leader\">Leader: god of gaw top</div>\n");
      out.write("                        <div class=\"group-member\">Members: 302 </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"group-box\">\n");
      out.write("                    <div class=\"group-create\">Created: Jan-12-2014</div>\n");
      out.write("                    <div class=\"group-img\">\n");
      out.write("                        <img src=\"resources/img/hospital.jpg\" alt=\"medical\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"group-info\">\n");
      out.write("                        <div class=\"group-name\">Doctor Assembly</div>\n");
      out.write("                        <div class=\"group-category\">Category: Health</div>\n");
      out.write("                        <div class=\"group-leader\">Leader: god of gaw top</div>\n");
      out.write("                        <div class=\"group-member\">Members: 302 </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"span3\">\n");
      out.write("            <div class=\"group-event\">\n");
      out.write("                <div class=\"see-all\"> See All</div>\n");
      out.write("                <div class=\"event-head\"><i class=\"icon-calendar\"></i> Upcoming Events</div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"group-event-date\">\n");
      out.write("                    <div class=\"group-event-schedule\">Nov<div>14th</div></div>\n");
      out.write("                    <div class=\"group-event-clubname\">UW Colic</div>\n");
      out.write("                    <div class=\"group-event-type\">Indoor Soccer Game</div>\n");
      out.write("                    <div class=\"group-event-time\">7 PM - 9 PM</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"group-event-date\">\n");
      out.write("                    <div class=\"group-event-schedule\">Nov<div>18th</div></div>\n");
      out.write("                    <div class=\"group-event-clubname\">France Union</div>\n");
      out.write("                    <div class=\"group-event-type\">Culture</div>\n");
      out.write("                    <div class=\"group-event-time\">7 PM - 10 PM</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"group-event-date\">\n");
      out.write("                    <div class=\"group-event-schedule\">Nov<div>19th</div></div>\n");
      out.write("                    <div class=\"group-event-clubname\">Chef CLub</div>\n");
      out.write("                    <div class=\"group-event-type\">Cooking</div>\n");
      out.write("                    <div class=\"group-event-time\">6 PM - 7 PM</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"group-event-date\">\n");
      out.write("                    <div class=\"group-event-schedule\">Nov<div>20th</div></div>\n");
      out.write("                    <div class=\"group-event-clubname\">Exploring Science</div>\n");
      out.write("                    <div class=\"group-event-type\">Education</div>\n");
      out.write("                    <div class=\"group-event-time\">3 PM - 4 PM</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"group-event-date\">\n");
      out.write("                    <div class=\"group-event-schedule\">Nov<div>21th</div></div>\n");
      out.write("                    <div class=\"group-event-clubname\">Fight for good</div>\n");
      out.write("                    <div class=\"group-event-type\">Combat</div>\n");
      out.write("                    <div class=\"group-event-time\">7 PM - 9 PM</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"addition-li\"> View More...</div>\n");
      out.write("            <div class=\"Suggestion\">\n");
      out.write("                <i class=\"icon-user\"></i>Suggested Clubs & Teams <div class=\"see-all\">See All</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"group-suggest\">\n");
      out.write("                <div class=\"group-image-suggestion\">\n");
      out.write("                    <img src=\"resources/img/hospital.jpg\" alt=\"Health\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"group-name-suggest\"> God of Gaw Top</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"group-suggest\">\n");
      out.write("                <div class=\"group-image-suggestion\">\n");
      out.write("                    <img src=\"resources/img/medical.jpg\" alt=\"meduc\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"group-name-suggest\"> Medicine</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"group-suggest\">\n");
      out.write("                <div class=\"group-image-suggestion\">\n");
      out.write("                    <img src=\"resources/img/effel.jpg\" alt=\"tour\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"group-name-suggest\"> La Swiss</div>\n");
      out.write("            </div>\n");
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
