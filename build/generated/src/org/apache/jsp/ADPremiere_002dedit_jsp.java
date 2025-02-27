package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ADPremiere_002dedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/ADPremiere-edit.css\">\n");
      out.write("        <title>ABC Cinema | Premiere Edit</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String user = (String) session.getAttribute("admin");

            if (user == null) {
                response.sendRedirect(request.getContextPath() + "/ADLogin.jsp");
            }
        
      out.write("\n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <img src=\"assets/logo header.png\" alt=\"header logo\" class=\"logo\">\n");
      out.write("                <ul>\n");
      out.write("                    <div class=\"nav-right\">\n");
      out.write("                        <li>\n");
      out.write("                            <h5>Admin</h5>\n");
      out.write("                        </li>\n");
      out.write("                    </div>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"container-main\">\n");
      out.write("            <div class=\"side-menu\">\n");
      out.write("                <menu>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"ADdashboard.jsp\">\n");
      out.write("                                <p>Dashboard</p>\n");
      out.write("                            </a></li>\n");
      out.write("                        <li><a class=\"active\" href=\"ADPremiere.jsp\">\n");
      out.write("                                <p>Premiere</p>\n");
      out.write("                            </a></li>\n");
      out.write("                        <li><a href=\"ADbookingjsp.jsp\">\n");
      out.write("                                <p>Bookings</p>\n");
      out.write("                            </a></li>\n");
      out.write("                        <li><a href=\"ADUpcoming.jsp\">\n");
      out.write("                                <p>Upcoming</p>\n");
      out.write("                            </a></li>\n");
      out.write("                        <li><a href=\"#\">\n");
      out.write("                                <p>Log-out</p>\n");
      out.write("                            </a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </menu>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"movie-edit\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <form action=\"premierMovie\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("                        <label for=\"mname\">\n");
      out.write("                            <h3>Movie Name</h3>\n");
      out.write("                        </label>\n");
      out.write("                        <input type=\"text\"  name=\"moviename\" placeholder=\"Movie name here\" value=\"\"><br>\n");
      out.write("                        <label for=\"mdirector\">\n");
      out.write("                            <h3>Director name</h3>\n");
      out.write("                        </label>\n");
      out.write("                        <input type=\"text\"  name=\"moviedirector\" placeholder=\"Director name\" value=\"\"><br>\n");
      out.write("                        <label for=\"mname\">\n");
      out.write("                            <h3>Movie Categary</h3>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"movie-category\">\n");
      out.write("                            <input type=\"checkbox\"  name=\"movie\" value=\"Action & Adventure\">\n");
      out.write("                            <label for=\"movie\"> Action & Adventure </label><br>\n");
      out.write("                            <input type=\"checkbox\"  name=\"movie\" value=\"Comedy\">\n");
      out.write("                            <label for=\"movie\"> Comedy </label><br>\n");
      out.write("                            <input type=\"checkbox\"  name=\"movie\" value=\"Horror\">\n");
      out.write("                            <label for=\"movie\"> Horror </label><br>\n");
      out.write("                            <input type=\"checkbox\"  name=\"movie\" value=\"Drama \">\n");
      out.write("                            <label for=\"movie\"> Drama </label><br>\n");
      out.write("                            <input type=\"checkbox\"  name=\"movie\" value=\"Fantasy\">\n");
      out.write("                            <label for=\"movie\"> Fantasy </label><br>\n");
      out.write("                            <input type=\"checkbox\"  name=\"movie\" value=\"Sci-Fi\">\n");
      out.write("                            <label for=\"movie\"> Sci-Fi </label><br>\n");
      out.write("                            <input type=\"checkbox\"  name=\"movie\" value=\"Romantic\">\n");
      out.write("                            <label for=\"movie\"> Romantic </label><br>\n");
      out.write("                        </div>\n");
      out.write("                        <label for=\"cast\">\n");
      out.write("                            <h3>Cast</h3>\n");
      out.write("                        </label>\n");
      out.write("                        <input type=\"text\" id=\"cast\" name=\"cast\" placeholder=\"Actor 01, Actor 02, Actor 03 ...\">\n");
      out.write("                        <label for=\"movie details\">\n");
      out.write("                            <h3>Movie Details</h3>\n");
      out.write("                            <textarea id=\"m-details\" name=\"m-details\" placeholder=\"Description here\" style=\"height:200px\"></textarea>\n");
      out.write("                        </label>\n");
      out.write("                            <label for=\"banner-img\">\n");
      out.write("                            <h3>Upload a banner</h3>\n");
      out.write("                            <input type=\"file\" id=\"banner-upload\" name=\"banner-img\">\n");
      out.write("                        </label>\n");
      out.write("                        </form>\n");
      out.write("                        <label for=\"poster-img\">\n");
      out.write("                            <h3>Upload a background</h3>\n");
      out.write("                            <input type=\"file\" id=\"poster-upload\" name=\"file\">\n");
      out.write("                        </label>\n");
      out.write("                        <label for=\"video\">\n");
      out.write("                            <h3>Link</h3>\n");
      out.write("                        </label>\n");
      out.write("                        <input type=\"text\" id=\"video\" name=\"video\" placeholder=\"URL\"><br>\n");
      out.write("                        <div class=\"set-price\">\n");
      out.write("                            <label for=\"price\">\n");
      out.write("                                <h3>Set Price</h3>\n");
      out.write("                                <input type=\"number\" id=\"price01\" name=\"gold\" placeholder=\"Gold\">\n");
      out.write("                                <input type=\"number\" id=\"price02\" name=\"silver\" placeholder=\"Silver\">\n");
      out.write("                                <input type=\"number\" id=\"price03\" name=\"bronze\" placeholder=\"Bronze\">\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" value=\"Submit\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
}
