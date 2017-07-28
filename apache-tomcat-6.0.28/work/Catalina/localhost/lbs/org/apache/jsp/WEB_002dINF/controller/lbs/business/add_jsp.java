package org.apache.jsp.WEB_002dINF.controller.lbs.business;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("String path = request.getContextPath();\r\n");
      out.write("String basePath = request.getScheme()+\"://\"+request.getServerName()+\":\"+request.getServerPort()+path+\"/\";\r\n");
      out.write("%>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'add.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/base.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("function checkForm(){\r\n");
      out.write("\tvar list = null;\r\n");
      out.write("\tlist = new Array(\r\n");
      out.write("\t\t\tnew ValidateEntity(\"businessinfo.areaName\", \"商圈名称不能为空！\",\"areaNameLayer\",\"50\",\"字符超过限制，不能超过20个字节，一个汉字为2个字节！\") \r\n");
      out.write("\t\t\t);\r\n");
      out.write("\tif (validate(list)) {\r\n");
      out.write("\t\tdocument.forms[0].submit();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function changeview(obj){\r\n");
      out.write("\tif(obj.value==0){\r\n");
      out.write("\t\t//圈\r\n");
      out.write("\t\tdocument.getElementById(\"quantable\").style.display=\"\";\r\n");
      out.write("\t\tdocument.getElementById(\"kuaitable\").style.display=\"none\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t}else if(obj.value==1){\r\n");
      out.write("\t\t//块\r\n");
      out.write("\t\tdocument.getElementById(\"kuaitable\").style.display=\"\";\r\n");
      out.write("\t\tdocument.getElementById(\"quantable\").style.display=\"none\";\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("  <body>\r\n");
      out.write("\t<form name=\"myForm\" action=\"business/BusinessinfoAction_add.action\" method=\"post\">\r\n");
      out.write("\t\t\t<table id=\"maintable\" width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" class=\"thead\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tit_box\">\r\n");
      out.write("\t\t\t\t\t\t\t商家信息录入\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"150px\">\r\n");
      out.write("\t\t\t\t\t\t所属城市：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"businessinfo.cityId\" id=\"businessinfo.cityId\" value=\"-1\" readonly/>\r\n");
      out.write("\t\t\t\t\t\t<span id=\"cityName\"></span>\r\n");
      out.write("        \t\t  \t\t<a href=\"javascript:openPage('选择所属城市','");
      out.print(basePath);
      out.write("province/ProvinceAction_searchList.action?returnUrl=selectProvince&returnid=businessinfo.cityId&returnname=cityName&type=2')\">选择</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t所属区域：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"businessinfo.boroughid\" id=\"businessinfo.boroughid\" value=\"-1\" readonly/>\r\n");
      out.write("\t\t\t\t\t\t<span id=\"boroughidLayer\"></span>\r\n");
      out.write("        \t\t  \t\t<a href=\"javascript:openPage('选择所属区域','");
      out.print(basePath);
      out.write("province/ProvinceAction_searchList.action?returnUrl=selectProvince&returnid=businessinfo.boroughid&returnname=boroughidLayer&type=3')\">选择</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t商家名称：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"businessinfo.shangjiaName\" name=\"businessinfo.shangjiaName\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"shangjiaNameLayer\"><font color=\"#FF0000\">*</font>不能超过20个字节，一个汉字为2个字节！(汉字，数字，字母和下划线)</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t商家别名：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"businessinfo.surname\" name=\"businessinfo.surname\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"surnameLayer\"><font color=\"#FF0000\">*</font>不能超过20个字节，一个汉字为2个字节！(汉字，数字，字母和下划线)</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t地址：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"businessinfo.address\" name=\"businessinfo.address\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"addressLayer\"><font color=\"#FF0000\">*</font>不能超过20个字节，一个汉字为2个字节！(汉字，数字，字母和下划线)</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t登陆名称：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"businessinfo.loginName\" name=\"businessinfo.loginName\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"loginNameLayer\"><font color=\"#FF0000\">*</font>不能超过20个字节，一个汉字为2个字节！(汉字，数字，字母和下划线)</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t登陆密码：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" id=\"businessinfo.loginPwd\" name=\"businessinfo.loginPwd\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"loginPwdLayer\"><font color=\"#FF0000\">*</font>不能超过20个字节，一个汉字为2个字节！(汉字，数字，字母和下划线)</span>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t商家充值的钱：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"businessinfo.money\" name=\"businessinfo.money\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"moneyLayer\"><font color=\"#FF0000\">*</font>不能超过20个字节，一个汉字为2个字节！(汉字，数字，字母和下划线)</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t商家级别：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select id=\"businessinfo.shangjiaLevel\" name=\"businessinfo.shangjiaLevel\" onchange=\"changeview(this)\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\" selected>免费用户</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">VIP用户</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t商家大类型ID：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"businessinfo.shangjiaBigtypeid\" name=\"businessinfo.shangjiaBigtypeid\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"shangjiaBigtypeidLayer\"><font color=\"#FF0000\">*</font>不能超过20个字节，一个汉字为2个字节！(汉字，数字，字母和下划线)</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t商家ICON：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"businessinfo.shangjiaIcon\" name=\"businessinfo.shangjiaIcon\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"shangjiaIconLayer\"><font color=\"#FF0000\">*</font>不能超过20个字节，一个汉字为2个字节！(汉字，数字，字母和下划线)</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t商家微博账号：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"businessinfo.shangjiaWeibo\" name=\"businessinfo.shangjiaWeibo\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"shangjiaWeiboLayer\"><font color=\"#FF0000\">*</font>不能超过20个字节，一个汉字为2个字节！(汉字，数字，字母和下划线)</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t商家位置：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"businessinfo.shangjiaJingdu\" name=\"businessinfo.shangjiaJingdu\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t，\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"businessinfo.shangjiaWeidu\" name=\"businessinfo.shangjiaWeidu\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t是否认证商家：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"businessinfo.isAuthenShangjia\" name=\"businessinfo.isAuthenShangjia\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"isAuthenShangjiaLayer\"><font color=\"#FF0000\">*</font>不能超过20个字节，一个汉字为2个字节！(汉字，数字，字母和下划线)</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t商家积分：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"businessinfo.shangjiaScore\" name=\"businessinfo.shangjiaScore\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"shangjiaScoreLayer\"><font color=\"#FF0000\">*</font>不能超过20个字节，一个汉字为2个字节！(汉字，数字，字母和下划线)</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t所属商圈：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"businessinfo.boroughid\" id=\"businessinfo.boroughid\" value=\"-1\" readonly/>\r\n");
      out.write("\t\t\t\t\t\t<span id=\"boroughidLayer\"></span>\r\n");
      out.write("        \t\t  \t\t<a href=\"javascript:openPage('选择所属区域','");
      out.print(basePath);
      out.write("province/ProvinceAction_searchList.action?returnUrl=selectProvince&returnid=businessinfo.boroughid&returnname=boroughidLayer&type=3')\">选择</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t商家描述：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"businessinfo.descShort\" name=\"businessinfo.descShort\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"descShortLayer\"><font color=\"#FF0000\">*</font>不能超过20个字节，一个汉字为2个字节！(汉字，数字，字母和下划线)</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t标签：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"businessinfo.tags\" name=\"businessinfo.tags\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"tagsLayer\"><font color=\"#FF0000\">*</font>不能超过20个字节，一个汉字为2个字节！(汉字，数字，字母和下划线)</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" style=\"text-align: center\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" name=\"tijiao\" id=\"tijiao\" value=\"提交\"\r\n");
      out.write("\t\t\t\t\t\t\tonClick=\"checkForm()\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
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
