package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"width: 20%; margin-left: 40%; margin-top: 10%\">\n");
      out.write("                        <!-- Pills navs -->\n");
      out.write("            <ul class=\"nav nav-pills nav-justified mb-3\" id=\"ex1\" role=\"tablist\">\n");
      out.write("              <li class=\"nav-item\" role=\"presentation\">\n");
      out.write("                <a class=\"nav-link active\" id=\"tab-login\" data-mdb-toggle=\"pill\" href=\"#pills-login\" role=\"tab\"\n");
      out.write("                  aria-controls=\"pills-login\" aria-selected=\"true\">Login</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\" role=\"presentation\">\n");
      out.write("                <a class=\"nav-link\" id=\"tab-register\" data-mdb-toggle=\"pill\" href=\"#pills-register\" role=\"tab\"\n");
      out.write("                  aria-controls=\"pills-register\" aria-selected=\"false\">Register</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("            <!-- Pills navs -->\n");
      out.write("\n");
      out.write("            <!-- Pills content -->\n");
      out.write("            <div class=\"tab-content\">\n");
      out.write("              <div class=\"tab-pane fade show active\" id=\"pills-login\" role=\"tabpanel\" aria-labelledby=\"tab-login\">\n");
      out.write("                <form>\n");
      out.write("                  <div class=\"text-center mb-3\">\n");
      out.write("                  <div class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"email\" id=\"loginName\" class=\"form-control\" />\n");
      out.write("                    <label class=\"form-label\" for=\"loginName\">Email or username</label>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <!-- Password input -->\n");
      out.write("                  <div class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"password\" id=\"loginPassword\" class=\"form-control\" />\n");
      out.write("                    <label class=\"form-label\" for=\"loginPassword\">Password</label>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <!-- 2 column grid layout -->\n");
      out.write("                  <div class=\"row mb-4\">\n");
      out.write("                    <div class=\"col-md-6 d-flex justify-content-center\">\n");
      out.write("                      <!-- Checkbox -->\n");
      out.write("                      <div class=\"form-check mb-3 mb-md-0\">\n");
      out.write("                        <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"loginCheck\" checked />\n");
      out.write("                        <label class=\"form-check-label\" for=\"loginCheck\"> Remember me </label>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-6 d-flex justify-content-center\">\n");
      out.write("                      <!-- Simple link -->\n");
      out.write("                      <a href=\"#!\">Forgot password?</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <!-- Submit button -->\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-primary btn-block mb-4\">Sign in</button>\n");
      out.write("\n");
      out.write("                  <!-- Register buttons -->\n");
      out.write("                  <div class=\"text-center\">\n");
      out.write("                    <p>Not a member? <a href=\"#!\">Register</a></p>\n");
      out.write("                  </div>\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"tab-pane fade\" id=\"pills-register\" role=\"tabpanel\" aria-labelledby=\"tab-register\">\n");
      out.write("                <form>\n");
      out.write("                  <div class=\"text-center mb-3\">\n");
      out.write("                    <p>Sign up with:</p>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-link btn-floating mx-1\">\n");
      out.write("                      <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <button type=\"button\" class=\"btn btn-link btn-floating mx-1\">\n");
      out.write("                      <i class=\"fab fa-google\"></i>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <button type=\"button\" class=\"btn btn-link btn-floating mx-1\">\n");
      out.write("                      <i class=\"fab fa-twitter\"></i>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <button type=\"button\" class=\"btn btn-link btn-floating mx-1\">\n");
      out.write("                      <i class=\"fab fa-github\"></i>\n");
      out.write("                    </button>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <p class=\"text-center\">or:</p>\n");
      out.write("\n");
      out.write("                  <!-- Name input -->\n");
      out.write("                  <div class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"text\" id=\"registerName\" class=\"form-control\" />\n");
      out.write("                    <label class=\"form-label\" for=\"registerName\">Name</label>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <!-- Username input -->\n");
      out.write("                  <div class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"text\" id=\"registerUsername\" class=\"form-control\" />\n");
      out.write("                    <label class=\"form-label\" for=\"registerUsername\">Username</label>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <!-- Email input -->\n");
      out.write("                  <div class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"email\" id=\"registerEmail\" class=\"form-control\" />\n");
      out.write("                    <label class=\"form-label\" for=\"registerEmail\">Email</label>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <!-- Password input -->\n");
      out.write("                  <div class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"password\" id=\"registerPassword\" class=\"form-control\" />\n");
      out.write("                    <label class=\"form-label\" for=\"registerPassword\">Password</label>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <!-- Repeat Password input -->\n");
      out.write("                  <div class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"password\" id=\"registerRepeatPassword\" class=\"form-control\" />\n");
      out.write("                    <label class=\"form-label\" for=\"registerRepeatPassword\">Repeat password</label>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <!-- Checkbox -->\n");
      out.write("                  <div class=\"form-check d-flex justify-content-center mb-4\">\n");
      out.write("                    <input class=\"form-check-input me-2\" type=\"checkbox\" value=\"\" id=\"registerCheck\" checked\n");
      out.write("                      aria-describedby=\"registerCheckHelpText\" />\n");
      out.write("                    <label class=\"form-check-label\" for=\"registerCheck\">\n");
      out.write("                      I have read and agree to the terms\n");
      out.write("                    </label>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <!-- Submit button -->\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-primary btn-block mb-3\">Sign in</button>\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Pills content -->\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
