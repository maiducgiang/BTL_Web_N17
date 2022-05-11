package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"/css/main.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            <!-- Navbar -->\n");
      out.write("            <nav class=\"navbar-color navbar fixed-top navbar-expand-lg navbar-light white scrolling-navbar\" style=\"background-color: #929fba;\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("          <!-- Brand -->\n");
      out.write("          <a class=\"navbar-brand waves-effect\" href=\"https://mdbootstrap.com/docs/jquery/\" target=\"_blank\">\n");
      out.write("            <strong class=\"blue-text\">MDB</strong>\n");
      out.write("          </a>\n");
      out.write("\n");
      out.write("          <!-- Collapse -->\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\n");
      out.write("            aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("          </button>\n");
      out.write("\n");
      out.write("          <!-- Links -->\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("\n");
      out.write("            <!-- Left -->\n");
      out.write("            <ul class=\"navbar-nav mr-auto\">\n");
      out.write("              <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link waves-effect\" href=\"#\">Home\n");
      out.write("                  <span class=\"sr-only\">(current)</span>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link waves-effect\" href=\"https://mdbootstrap.com/docs/jquery/\" target=\"_blank\">About MDB</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link waves-effect\" href=\"https://mdbootstrap.com/docs/jquery/getting-started/download/\" target=\"_blank\">Free download</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link waves-effect\" href=\"https://mdbootstrap.com/education/bootstrap/\" target=\"_blank\">Free tutorials</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <!-- Right -->\n");
      out.write("            <ul class=\"navbar-nav nav-flex-icons\">\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link waves-effect\">\n");
      out.write("                  <span class=\"badge red z-depth-1 mr-1\"> 1 </span>\n");
      out.write("                  <i class=\"fas fa-shopping-cart\"></i>\n");
      out.write("                  <span class=\"clearfix d-none d-sm-inline-block\"> Cart </span>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a href=\"https://www.facebook.com/mdbootstrap\" class=\"nav-link waves-effect\" target=\"_blank\">\n");
      out.write("                  <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a href=\"https://twitter.com/MDBootstrap\" class=\"nav-link waves-effect\" target=\"_blank\">\n");
      out.write("                  <i class=\"fab fa-twitter\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a href=\"https://github.com/mdbootstrap/bootstrap-material-design\" class=\"nav-link border border-light rounded waves-effect\"\n");
      out.write("                  target=\"_blank\">\n");
      out.write("                  <i class=\"fab fa-github mr-2\"></i>MDB GitHub\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("      <!-- Navbar -->\n");
      out.write("\n");
      out.write("      <!--Carousel Wrapper-->\n");
      out.write("      <div id=\"carousel-example-1z\" class=\"carousel slide carousel-fade pt-4\" data-ride=\"carousel\">\n");
      out.write("\n");
      out.write("        <!--Indicators-->\n");
      out.write("        <ol class=\"carousel-indicators\">\n");
      out.write("          <li data-target=\"#carousel-example-1z\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("          <li data-target=\"#carousel-example-1z\" data-slide-to=\"1\"></li>\n");
      out.write("          <li data-target=\"#carousel-example-1z\" data-slide-to=\"2\"></li>\n");
      out.write("        </ol>\n");
      out.write("        <!--/.Indicators-->\n");
      out.write("      </div>\n");
      out.write("      <!--/.Carousel Wrapper-->\n");
      out.write("\n");
      out.write("      <!--Main layout-->\n");
      out.write("      <main>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("          <!--Navbar-->\n");
      out.write("          <nav class=\"navbar navbar-expand-lg navbar-dark mdb-color lighten-3 mt-5 mb-5\">\n");
      out.write("\n");
      out.write("            <!-- Navbar brand -->\n");
      out.write("            <span class=\"navbar-brand\" style=\"color: black\">Categories:</span>\n");
      out.write("\n");
      out.write("            <!-- Collapse button -->\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#basicExampleNav\" aria-controls=\"basicExampleNav\"\n");
      out.write("              aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("              <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <!-- Collapsible content -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"basicExampleNav\">\n");
      out.write("\n");
      out.write("              <!-- Links -->\n");
      out.write("              <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                  <a style=\"color: black\" class=\"nav-link\" href=\"#\">All\n");
      out.write("                    <span class=\"sr-only\">(current)</span>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a style=\"color: black\" class=\"nav-link\" href=\"#\">Shirts</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a style=\"color: black\" class=\"nav-link\" href=\"#\">Sport wears</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a style=\"color: black\" class=\"nav-link\" href=\"#\">Outwears</a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("              </ul>\n");
      out.write("              <!-- Links -->\n");
      out.write("\n");
      out.write("              <form class=\"form-inline\">\n");
      out.write("                <div class=\"md-form my-0\">\n");
      out.write("                  <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                </div>\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("            <!-- Collapsible content -->\n");
      out.write("\n");
      out.write("          </nav>\n");
      out.write("          <!--/.Navbar-->\n");
      out.write("\n");
      out.write("          <!--Section: Products v.3-->\n");
      out.write("          <section class=\"text-center mb-4\">\n");
      out.write("\n");
      out.write("            <!--Grid row-->\n");
      out.write("            <div class=\"row wow fadeIn\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!--Grid row-->\n");
      out.write("          </section>\n");
      out.write("          <!--Section: Products v.3-->\n");
      out.write("\n");
      out.write("          <!--Pagination-->\n");
      out.write("          <nav class=\"d-flex justify-content-center wow fadeIn\">\n");
      out.write("            <ul class=\"pagination pg-blue\">\n");
      out.write("\n");
      out.write("              <!--Arrow left-->\n");
      out.write("              <li class=\"page-item disabled\">\n");
      out.write("                <a class=\"page-link\" href=\"#\" aria-label=\"Previous\">\n");
      out.write("                  <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                  <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("\n");
      out.write("              <li class=\"page-item active\">\n");
      out.write("                <a class=\"page-link\" href=\"#\">1\n");
      out.write("                  <span class=\"sr-only\">(current)</span>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"page-item\">\n");
      out.write("                <a class=\"page-link\" href=\"#\">2</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"page-item\">\n");
      out.write("                <a class=\"page-link\" href=\"#\">3</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"page-item\">\n");
      out.write("                <a class=\"page-link\" href=\"#\">4</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"page-item\">\n");
      out.write("                <a class=\"page-link\" href=\"#\">5</a>\n");
      out.write("              </li>\n");
      out.write("\n");
      out.write("              <li class=\"page-item\">\n");
      out.write("                <a class=\"page-link\" href=\"#\" aria-label=\"Next\">\n");
      out.write("                  <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                  <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </nav>\n");
      out.write("          <!--Pagination-->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </main>\n");
      out.write("      <!--Main layout-->\n");
      out.write("\n");
      out.write("      <!--Footer-->\n");
      out.write("      <footer class=\"page-footer text-center font-small mt-4 wow fadeIn\">\n");
      out.write("\n");
      out.write("        <!--Call to action-->\n");
      out.write("        <div class=\"pt-4\">\n");
      out.write("          <a class=\"btn btn-outline-white\" href=\"https://mdbootstrap.com/docs/jquery/getting-started/download/\" target=\"_blank\" role=\"button\">Download MDB\n");
      out.write("            <i class=\"fas fa-download ml-2\"></i>\n");
      out.write("          </a>\n");
      out.write("          <a class=\"btn btn-outline-white\" href=\"https://mdbootstrap.com/education/bootstrap/\" target=\"_blank\" role=\"button\">Start free tutorial\n");
      out.write("            <i class=\"fas fa-graduation-cap ml-2\"></i>\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("        <!--/.Call to action-->\n");
      out.write("\n");
      out.write("        <hr class=\"my-4\">\n");
      out.write("\n");
      out.write("        <!-- Social icons -->\n");
      out.write("        <div class=\"pb-4\">\n");
      out.write("          <a href=\"https://www.facebook.com/mdbootstrap\" target=\"_blank\">\n");
      out.write("            <i class=\"fab fa-facebook-f mr-3\"></i>\n");
      out.write("          </a>\n");
      out.write("\n");
      out.write("          <a href=\"https://twitter.com/MDBootstrap\" target=\"_blank\">\n");
      out.write("            <i class=\"fab fa-twitter mr-3\"></i>\n");
      out.write("          </a>\n");
      out.write("\n");
      out.write("          <a href=\"https://www.youtube.com/watch?v=7MUISDJ5ZZ4\" target=\"_blank\">\n");
      out.write("            <i class=\"fab fa-youtube mr-3\"></i>\n");
      out.write("          </a>\n");
      out.write("\n");
      out.write("          <a href=\"https://plus.google.com/u/0/b/107863090883699620484\" target=\"_blank\">\n");
      out.write("            <i class=\"fab fa-google-plus-g mr-3\"></i>\n");
      out.write("          </a>\n");
      out.write("\n");
      out.write("          <a href=\"https://dribbble.com/mdbootstrap\" target=\"_blank\">\n");
      out.write("            <i class=\"fab fa-dribbble mr-3\"></i>\n");
      out.write("          </a>\n");
      out.write("\n");
      out.write("          <a href=\"https://pinterest.com/mdbootstrap\" target=\"_blank\">\n");
      out.write("            <i class=\"fab fa-pinterest mr-3\"></i>\n");
      out.write("          </a>\n");
      out.write("\n");
      out.write("          <a href=\"https://github.com/mdbootstrap/bootstrap-material-design\" target=\"_blank\">\n");
      out.write("            <i class=\"fab fa-github mr-3\"></i>\n");
      out.write("          </a>\n");
      out.write("\n");
      out.write("          <a href=\"http://codepen.io/mdbootstrap/\" target=\"_blank\">\n");
      out.write("            <i class=\"fab fa-codepen mr-3\"></i>\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("        <!-- Social icons -->\n");
      out.write("\n");
      out.write("        <!--Copyright-->\n");
      out.write("        <div class=\"footer-copyright py-3\">\n");
      out.write("          © 2018 Copyright:\n");
      out.write("          <a href=\"https://mdbootstrap.com/education/bootstrap/\" target=\"_blank\"> MDBootstrap.com </a>\n");
      out.write("        </div>\n");
      out.write("        <!--/.Copyright-->\n");
      out.write("\n");
      out.write("      </footer>\n");
      out.write("      <!--/.Footer-->\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems(new String("listP"));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <!--Grid column-->\n");
          out.write("                  <div class=\"col-lg-3 col-md-6 mb-4\">\n");
          out.write("\n");
          out.write("                    <!--Card-->\n");
          out.write("                    <div class=\"card\">\n");
          out.write("\n");
          out.write("                      <!--Card image-->\n");
          out.write("                      <div class=\"view overlay\">\n");
          out.write("                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"card-img-top\" alt=\"\">\n");
          out.write("                        <a>\n");
          out.write("                          <div class=\"mask rgba-white-slight\"></div>\n");
          out.write("                        </a>\n");
          out.write("                      </div>\n");
          out.write("                      <!--Card image-->\n");
          out.write("\n");
          out.write("                      <!--Card content-->\n");
          out.write("                      <div class=\"card-body text-center\">\n");
          out.write("                        <!--Category & Title-->\n");
          out.write("                        <a href=\"\" class=\"grey-text\">\n");
          out.write("                          <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                        </a>\n");
          out.write("                        <h5>\n");
          out.write("                          <strong>\n");
          out.write("                            <a href=\"\" class=\"dark-grey-text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                            </a>\n");
          out.write("                          </strong>\n");
          out.write("                        </h5>\n");
          out.write("\n");
          out.write("                        <h4 class=\"font-weight-bold blue-text\">\n");
          out.write("                          <strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong>\n");
          out.write("                        </h4>\n");
          out.write("\n");
          out.write("                      </div>\n");
          out.write("                      <!--Card content-->\n");
          out.write("\n");
          out.write("                    </div>\n");
          out.write("                    <!--Card-->\n");
          out.write("\n");
          out.write("                  </div>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
