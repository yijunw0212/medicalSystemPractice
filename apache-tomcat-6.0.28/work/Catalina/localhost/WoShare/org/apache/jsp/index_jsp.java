package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    <title>后台管理登陆页面</title>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tif(self!=top){\r\n");
      out.write("\t\twindow.parent.document.location.href = document.location.href;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\t\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\tbody{font-size:12px; font-family:\"宋体\"; background-color:#ccf0fe;  margin:0; padding:0}\r\n");
      out.write("\timg{border:0}\r\n");
      out.write("\t.inputs{border-top:solid 1px #0278A7; border-left:solid 1px #0278A7; border-right:solid 1px #048CC8; border-bottom:solid 1px #048CC8; height:24px; line-height:24px; background:url(images/inputbg.jpg) repeat-x; font-size:14px; font-family:Arial; color:#4c4c4c; padding:0 3px}\r\n");
      out.write("\t\r\n");
      out.write("\t#l_001{width:1000px; margin:0 auto; height:324px; background:url(images/l_01.jpg); overflow:hidden; clear:both}\r\n");
      out.write("\t#l_002{width:1000px; margin:0 auto; clear:both}\r\n");
      out.write("\t#l_002 .l_002_01{background:url(images/l_02.jpg) no-repeat; width:263px; height:121px; padding:15px 0; padding-left:306px; float:left; overflow:hidden}\r\n");
      out.write("\t#l_002 .l_002_01 .in_01{width:250px; height:26px; padding:8px 0; line-height:26px; float:left; clear:both}\r\n");
      out.write("\t#l_002 .l_002_01 .in_01 div{padding-right:5px; float:left; font-size:14px; color:#FFF; font-weight:bold;}\r\n");
      out.write("\t#l_002 .l_002_02{background:url(images/l_bt.jpg) no-repeat; width:132px; height:151px; float:left; overflow:hidden}\r\n");
      out.write("\t#l_002 .l_002_03{background:url(images/l_03.jpg) no-repeat; width:299px; height:151px; float:left; overflow:hidden}\r\n");
      out.write("\t#l_003{width:1000px; margin:0 auto; height:293px; background:url(images/l_04.jpg); overflow:hidden; clear:both}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tfunction loginCheck(){\r\n");
      out.write("\t\tvar username    = document.getElementById(\"username\");\r\n");
      out.write("\t\tvar password    = document.getElementById(\"password\");\r\n");
      out.write("\t\tvar checkNumber = document.getElementById(\"checkNumber\");\r\n");
      out.write("\t\tif(username==null || username.value==\"\"){\r\n");
      out.write("\t\t\talert(\"用户名不能为空！\")\r\n");
      out.write("\t\t\tusername.focus();\r\n");
      out.write("\t\t\treturn ;\r\n");
      out.write("\t\t}else if(password==null || password.value==\"\"){\r\n");
      out.write("\t\t\talert(\"密码不能为空！\");\r\n");
      out.write("\t\t\tpassword.focus();\r\n");
      out.write("\t\t\treturn ;\r\n");
      out.write("\t\t}else if(checkNumber.value.toUpperCase().length <=0){\r\n");
      out.write("\t\t\talert(\"请输入验证码！\");\r\n");
      out.write("\t\t\tcheckNumber.focus();\r\n");
      out.write("\t\t\treturn ;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tdocument.forms[0].submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfunction hotkey(eventobj){\r\n");
      out.write("        var _key;\r\n");
      out.write("        var _event;\r\n");
      out.write("        var nu = navigator.userAgent.toLowerCase();\r\n");
      out.write("        var webtype = /msie/.test(nu) ? \"msie\" : /mozilla/.test(nu) ? \"gecko\" : \"opera\";\r\n");
      out.write("        if(webtype==\"msie\" || webtype==\"opera\"){\r\n");
      out.write("                    _key = window.event.keyCode;\r\n");
      out.write("                    _event = window.event;\r\n");
      out.write("        }else{\r\n");
      out.write("                   _key = eventobj.which;\r\n");
      out.write("                   _event = eventobj;\r\n");
      out.write("        }\r\n");
      out.write("        if(_key == 13){\r\n");
      out.write("            //alert(\"您点击了enter 吧！！\");\r\n");
      out.write("            loginCheck()\r\n");
      out.write("        }\r\n");
      out.write("\t}\r\n");
      out.write("document.onkeydown = hotkey;\r\n");
      out.write("\t</script>\r\n");
      out.write("  </head>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"loginForm\" action=\"user/UserInfoAction_checkUser.action\" method=\"post\">\r\n");
      out.write("<div id=\"l_001\"></div>\r\n");
      out.write("<div id=\"l_002\">\r\n");
      out.write("  <div class=\"l_002_01\">\r\n");
      out.write("    <div class=\"in_01\">\r\n");
      out.write("      <div>用户名：</div>\r\n");
      out.write("      <div><input id=\"username\" name=\"username\" type=\"text\" class=\"inputs\" size=\"22\" value=\"\" /></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"in_01\">\r\n");
      out.write("      <div>密&nbsp;&nbsp;码：</div>\r\n");
      out.write("      <div><input id=\"password\" name=\"password\" type=\"password\" class=\"inputs\" size=\"22\" value=\"\" /></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"in_01\">\r\n");
      out.write("      <div>验证码：</div>\r\n");
      out.write("      <div><input type=\"text\" class=\"inputs\" id=\"checkNumber\" name=\"checkNumber\" size=\"10\" value=\"\"/></div>\r\n");
      out.write("      <div>\r\n");
      out.write("      <a href=\"JavaScript:reloadImage('base/image.jsp');\">\r\n");
      out.write("      <img border=0 src=\"base/image.jsp\" name=\"img1\"/>\r\n");
      out.write("      </a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"l_002_02\"><a href=\"javascript:onClick=loginCheck()\"><img src=\"images/l_bt.jpg\" /></a></div>\r\n");
      out.write("  <div class=\"l_002_03\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"l_003\"></div>\r\n");
      out.write("</form>\r\n");
if(request.getAttribute("message")!=null)
{

      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\talert('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\t</script>\r\n");

}

      out.write("\r\n");
      out.write("</body>\r\n");
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
