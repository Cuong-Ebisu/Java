/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2023-11-21 08:24:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("<title>Sign Up Form by Colorlib</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Font Icon -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Main css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<input type = \"hidden\" id = \"status\" value = \"");
      out.print( request.getAttribute("status"));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("	<div class=\"main\">\r\n");
      out.write("\r\n");
      out.write("		<!-- Sing in  Form -->\r\n");
      out.write("		<section class=\"sign-in\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\"signin-content\">\r\n");
      out.write("					<div class=\"signin-image\">\r\n");
      out.write("						<figure>\r\n");
      out.write("							<img src=\"images/signin-image.jpg\" alt=\"sing up image\">\r\n");
      out.write("						</figure>\r\n");
      out.write("						<a href=\"registration.jsp\" class=\"signup-image-link\">Create an\r\n");
      out.write("							account</a>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"signin-form\">\r\n");
      out.write("						<h2 class=\"form-title\">Sign in</h2>\r\n");
      out.write("						<form method=\"post\" action=\"login\" class=\"register-form\"\r\n");
      out.write("							id=\"login-form\">\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"username\"><i\r\n");
      out.write("									class=\"zmdi zmdi-account material-icons-name\"></i></label> <input\r\n");
      out.write("									type=\"text\" name=\"username\" id=\"username\"\r\n");
      out.write("									placeholder=\"Your Name\" />\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"password\"><i class=\"zmdi zmdi-lock\"></i></label> <input\r\n");
      out.write("									type=\"password\" name=\"password\" id=\"password\"\r\n");
      out.write("									placeholder=\"Password\" />\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<input type=\"checkbox\" name=\"remember-me\" id=\"remember-me\"\r\n");
      out.write("									class=\"agree-term\" /> <label for=\"remember-me\"\r\n");
      out.write("									class=\"label-agree-term\"><span><span></span></span>Remember\r\n");
      out.write("									me</label>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group form-button\">\r\n");
      out.write("								<input type=\"submit\" name=\"signin\" id=\"signin\"\r\n");
      out.write("									class=\"form-submit\" value=\"Log in\" />\r\n");
      out.write("							</div>\r\n");
      out.write("						</form>\r\n");
      out.write("						<div class=\"social-login\">\r\n");
      out.write("							<span class=\"social-label\">Or login with</span>\r\n");
      out.write("							<ul class=\"socials\">\r\n");
      out.write("								<li><a href=\"#\"><i\r\n");
      out.write("										class=\"display-flex-center zmdi zmdi-facebook\"></i></a></li>\r\n");
      out.write("								<li><a href=\"#\"><i\r\n");
      out.write("										class=\"display-flex-center zmdi zmdi-twitter\"></i></a></li>\r\n");
      out.write("								<li><a href=\"#\"><i\r\n");
      out.write("										class=\"display-flex-center zmdi zmdi-google\"></i></a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- JS -->\r\n");
      out.write("	<script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("	<script src=\"js/main.js\"></script>\r\n");
      out.write("		<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	var status = document.getElementById(\"status\").value;\r\n");
      out.write("	if(status == \"failed\"){\r\n");
      out.write("		swal(\"Sorry\", \"Wrong Username or Password\", \"error\");\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("<!-- This templates was made by Colorlib (https://colorlib.com) -->\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
