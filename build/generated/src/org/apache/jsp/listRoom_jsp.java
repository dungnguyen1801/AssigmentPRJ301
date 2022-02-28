package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listRoom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("  <style>\n");
      out.write("            table{\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                margin:auto;\n");
      out.write("                box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background: #ffeaa785;\n");
      out.write("            }\n");
      out.write("            th,td{\n");
      out.write("                padding: 8px 32px;\n");
      out.write("                border:1px solid gray;\n");
      out.write("                font-size:20px;\n");
      out.write("            }\n");
      out.write("            .content{\n");
      out.write("                width:100%;\n");
      out.write("                \n");
      out.write("                margin-left:30px;\n");
      out.write("                height:auto;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .pagination {\n");
      out.write("                 display: inline-block;\n");
      out.write("                 box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;\n");
      out.write("\n");
      out.write("              }\n");
      out.write("             .pagination a {\n");
      out.write("                color: black;\n");
      out.write("                font-size: 16px;\n");
      out.write("                float: left;\n");
      out.write("                padding: 8px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("              }\n");
      out.write("            .pagination a.active {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("              }\n");
      out.write("            .pagination a:hover:not(.active) {\n");
      out.write("                background-color: chocolate;\n");
      out.write("            }   \n");
      out.write("            #search-form{\n");
      out.write("                position:absolute;\n");
      out.write("                top:5%;\n");
      out.write("                right:5%;\n");
      out.write("                box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;\n");
      out.write("            }\n");
      out.write("            #search-form input{\n");
      out.write("                font-size: 18px;\n");
      out.write("                padding:4px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                font-family:\"Helvetica Neue\",Helvetica,Arial,sans-serif;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            \n");
      out.write("            <c:set var=\"page\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.page}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("            <h3 class=\"dom\">DOM:</h3>\n");
      out.write("            <div class=\"pagination\">\n");
      out.write("               \n");
      out.write("                <c:forEach begin=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" end=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.num}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"i\">\n");
      out.write("                    <a class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i==page?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" href=\"listRoom?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i==1?\"A\":i==2?\"B\":i==3?\"C\":\"D\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                </c:forEach>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <form action=\"search\" id=\"search-form\">\n");
      out.write("                <input type=\"text\" name=\"name\" placeholder=\"Search student's Name\"/>\n");
      out.write("                <input type=\"Submit\" value=\"Search\"/>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>STT </th>               \n");
      out.write("                    <th>Dom</th>\n");
      out.write("                    <th>Floor</th>\n");
      out.write("                    <th>Room</th>\n");
      out.write("                    <th>Bed</th>\n");
      out.write("                    <th>Bed used</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Action</th>\n");
      out.write("                    ");
 int i=1;
      out.write("\n");
      out.write("                    <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.data}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"p\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(i++);
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.dom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.floor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.roomId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.bed}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.usedBed}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td><a href=\"roomDetail?room=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.roomId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Detail</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </c:forEach>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
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
