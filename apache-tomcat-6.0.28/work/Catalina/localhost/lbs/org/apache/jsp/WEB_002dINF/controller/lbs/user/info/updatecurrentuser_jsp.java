package org.apache.jsp.WEB_002dINF.controller.lbs.user.info;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updatecurrentuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'MyJsp.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/base.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tfunction tijiao(){\r\n");
      out.write("\t\t  var list=new Array(\r\n");
      out.write("\t\t  new ValidateEntity(\"oldPassword\",\"请输入原始密码！\",\"oldPasswordLayer\"),\r\n");
      out.write("\t\t  new ValidateEntity(\"password\",\"请输入新密码！\",\"passwordLayer\"),\r\n");
      out.write("\t\t  new ValidateEntity(\"confirmPassword\",\"请再次输入新密码！\",\"confirmPasswordLayer\")\r\n");
      out.write("\t\t  );\r\n");
      out.write("\t\t  if(validate(list)&& validatePass()){\r\n");
      out.write("\t\t  \tdocument.forms[0].submit();\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction validatePass(){\r\n");
      out.write("\t  \tvar p1=document.getElementById(\"password\");\r\n");
      out.write("\t  \tvar p2=document.getElementById(\"confirmPassword\");\r\n");
      out.write("  \t  \tvar show1=document.getElementById(\"passwordLayer\");\r\n");
      out.write("\t  \tvar show=document.getElementById(\"confirmPasswordLayer\");\r\n");
      out.write("\t  \t   if(p1.value!=null && p2.value!=null && p2.value!=\"\"  && p1.value!=\"\" &&  (p1.value.length<6 || p1.value.length>14) && (p2.value.length<6 ||p2.value.length>14) ){\r\n");
      out.write("\t\t  \t    p1.value=\"\";\r\n");
      out.write("\t\t  \t    p2.value=\"\";\r\n");
      out.write("\t\t  \t    show1.innerHTML=\"<font color='red'>*</font>\";\r\n");
      out.write("\t\t  \t\tshow.innerHTML=\"<font color='red'>输入的密码长度不能小于6位,大于14位！</font>\";\r\n");
      out.write("\t\t  \t}else if( p1.value!=p2.value ){\r\n");
      out.write("\t  \t       \r\n");
      out.write("\t\t  \t    p1.value=\"\";\r\n");
      out.write("\t\t  \t    p2.value=\"\";\r\n");
      out.write("\t\t  \t    show1.innerHTML=\"<font color='red'>*</font>\";\r\n");
      out.write("\t\t  \t\tshow.innerHTML=\"<font color='red'>两次输入的密码不一致！</font>\";\r\n");
      out.write("\t\t  \t\treturn false;\r\n");
      out.write("\t\t  \t}else{\r\n");
      out.write("\t\t  \tshow.innerHTML=\"<font color='red'>*</font>\";\r\n");
      out.write("\t\t  \tshow1.innerHTML=\"<font color='red'>*</font>\";\r\n");
      out.write("\t\t  \treturn true;\r\n");
      out.write("\t\t  \t}\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("\t<form action=\"user/UserinfoAction_updateUserInfo.action\" method=\"post\">\r\n");
      out.write("<table width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"2\" class=\"thead\">\r\n");
      out.write(" <div class=\"tit_box\">修改管理员信息</div>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"30%\">用户名:</td>\r\n");
      out.write("\t\t<td width=\"70%\">\r\n");
      out.write("\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.admin.loginName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"30%\">原始密码:</td>\r\n");
      out.write("\t\t<td width=\"70%\">\r\n");
      out.write("\t\t<input type=\"password\" id=\"oldPassword\" name=\"oldPassword\" value = \"\" />\r\n");
      out.write("\t\t<span id=\"oldPasswordLayer\"><font color=\"#FF0000\">*</font></span>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"30%\">密码:</td>\r\n");
      out.write("\t\t<td width=\"70%\">\r\n");
      out.write("\t\t<input type=\"password\" id=\"password\" name=\"password\" value = \"\" />\r\n");
      out.write("\t\t<span id=\"passwordLayer\"><font color=\"#FF0000\">*</font></span>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"30%\">确认密码:</td>\r\n");
      out.write("\t\t<td width=\"70%\">\r\n");
      out.write("\t\t<input type=\"password\" id=\"confirmPassword\" name=\"confirmPassword\" value = \"\"  onblur=\"validatePass()\"/>\r\n");
      out.write("\t\t<span id=\"confirmPasswordLayer\"><font color=\"#FF0000\">*</font></span>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\" style=\"text-align:center\"><input type=\"button\" id=\"tosub\" name=\"tosub\" value=\"提交\" onClick=\"tijiao()\" />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("   </table>\r\n");
      out.write("\t</form>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
