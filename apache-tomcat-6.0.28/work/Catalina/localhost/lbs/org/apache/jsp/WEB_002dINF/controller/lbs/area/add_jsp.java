package org.apache.jsp.WEB_002dINF.controller.lbs.area;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

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

      out.write('\r');
      out.write('\n');

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
      out.write("\t\t\tnew ValidateEntity(\"busiaera.areaName\", \"商圈名称不能为空！\",\"areaNameLayer\",\"50\",\"字符超过限制，不能超过20个字节，一个汉字为2个字节！\") \r\n");
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
      out.write("\t\t/*\r\n");
      out.write("\t\tdocument.getElementById(\"busiarea.areaNortheastJ\").value=\"\";\r\n");
      out.write("\t\tdocument.getElementById(\"busiarea.areaNortheastW\").value=\"\";\r\n");
      out.write("\t\tdocument.getElementById(\"busiarea.areaNorthwestJ\").value=\"\";\r\n");
      out.write("\t\tdocument.getElementById(\"busiarea.areaNorthwestW\").value=\"\";\r\n");
      out.write("\t\tdocument.getElementById(\"busiarea.areaSouthwestJ\").value=\"\";\r\n");
      out.write("\t\tdocument.getElementById(\"busiarea.areaSouthwestW\").value=\"\";\r\n");
      out.write("\t\tdocument.getElementById(\"busiarea.areaSoutheastJ\").value=\"\";\r\n");
      out.write("\t\tdocument.getElementById(\"busiarea.areaSoutheastW\").value=\"\";\r\n");
      out.write("\t\t*/\r\n");
      out.write("\t\t\r\n");
      out.write("\t}else if(obj.value==1){\r\n");
      out.write("\t\t//块\r\n");
      out.write("\t\tdocument.getElementById(\"kuaitable\").style.display=\"\";\r\n");
      out.write("\t\tdocument.getElementById(\"quantable\").style.display=\"none\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/*\r\n");
      out.write("\t\tdocument.getElementById(\"busiaera.areaCenterJ\").value=\"\";\r\n");
      out.write("\t\tdocument.getElementById(\"busiaera.areaCenterW\").value=\"\";\r\n");
      out.write("\t\tdocument.getElementById(\"busiarea.areaRadius\").value=\"\";\r\n");
      out.write("\t\t*/\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("  <body>\r\n");
      out.write("\t<form name=\"myForm\" action=\"area/BusiaeraAction_add.action\" method=\"post\">\r\n");
      out.write("\t\t\t<table id=\"maintable\" width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" class=\"thead\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tit_box\">\r\n");
      out.write("\t\t\t\t\t\t\t商圈信息录入\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"150px\">\r\n");
      out.write("\t\t\t\t\t\t所属城市：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"busiaera.cityid\" id=\"busiaera.cityid\" value=\"-1\" readonly/>\r\n");
      out.write("\t\t\t\t\t\t<span id=\"cityName\"></span>\r\n");
      out.write("        \t\t  \t\t<a href=\"javascript:openPage('选择所属城市','");
      out.print(basePath);
      out.write("province/ProvinceAction_searchList.action?returnUrl=selectProvince&returnid=busiaera.cityid&returnname=cityName&type=2')\">选择</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t所属区域：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"busiaera.boroughid\" id=\"busiaera.boroughid\" value=\"-1\" readonly/>\r\n");
      out.write("\t\t\t\t\t\t<span id=\"boroughidLayer\"></span>\r\n");
      out.write("        \t\t  \t\t<a href=\"javascript:openPage('选择所属区域','");
      out.print(basePath);
      out.write("province/ProvinceAction_searchList.action?returnUrl=selectProvince&returnid=busiaera.boroughid&returnname=boroughidLayer&type=3')\">选择</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t商圈名称：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"busiaera.areaName\" name=\"busiaera.areaName\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"areaNameLayer\"><font color=\"#FF0000\">*</font>不能超过20个字节，一个汉字为2个字节！(汉字，数字，字母和下划线)</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t定义方式：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select id=\"busiaera.areaDefinetype\" name=\"busiaera.areaDefinetype\" onchange=\"changeview(this)\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\" selected>圈</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">块</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<table id=\"quantable\" width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\" style=\"display:\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"150px\">\r\n");
      out.write("\t\t\t\t\t\t区域中心经度：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"busiaera.areaCenterJ\" name=\"busiaera.areaCenterJ\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"areaCenterJLayer\"><font color=\"#FF0000\">*</font>请输入小数，单位度（°），例：122.56</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t区域中心纬度：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"busiaera.areaCenterW\" name=\"busiaera.areaCenterW\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"areaCenterWLayer\"><font color=\"#FF0000\">*</font>请输入小数，单位度（°），例：122.56</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t区域半径：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"busiaera.areaRadius\" name=\"busiaera.areaRadius\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"areaRadiusLayer\"><font color=\"#FF0000\">*</font>请输入小数，单位度（°），例：122.56</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<table id=\"kuaitable\" width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\" style=\"display:none\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"150px\">\r\n");
      out.write("\t\t\t\t\t\t东北经度：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"busiaera.areaNortheastJ\" name=\"busiaera.areaNortheastJ\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"areaNortheastJLayer\"><font color=\"#FF0000\">*</font>请输入小数，单位度（°），例：122.56</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t东北纬度：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"busiaera.areaNortheastW\" name=\"busiaera.areaNortheastW\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"areaNortheastWLayer\"><font color=\"#FF0000\">*</font>请输入小数，单位度（°），例：122.56</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t西北经度：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"busiaera.areaNorthwestJ\" name=\"busiaera.areaNorthwestJ\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"areaNortheastJLayer\"><font color=\"#FF0000\">*</font>请输入小数，单位度（°），例：122.56</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t西北纬度：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"busiaera.areaNorthwestW\" name=\"busiaera.areaNorthwestW\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"areaNorthwestWLayer\"><font color=\"#FF0000\">*</font>请输入小数，单位度（°），例：122.56</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t西南经度：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"busiaera.areaSouthwestJ\" name=\"busiaera.areaSouthwestJ\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"areaSouthwestJLayer\"><font color=\"#FF0000\">*</font>请输入小数，单位度（°），例：122.56</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t西南纬度：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"busiaera.areaSouthwestW\" name=\"busiaera.areaSouthwestW\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"areaSouthwestWLayer\"><font color=\"#FF0000\">*</font>请输入小数，单位度（°），例：122.56</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t东南经度：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"busiaera.areaSoutheastJ\" name=\"busiaera.areaSoutheastJ\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"areaSoutheastJLayer\"><font color=\"#FF0000\">*</font>请输入小数，单位度（°），例：122.56</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t东南纬度：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"busiaera.areaSoutheastW\" name=\"busiaera.areaSoutheastW\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"areaSoutheastWLayer\"><font color=\"#FF0000\">*</font>请输入小数，单位度（°），例：122.56</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<table id=\"tijiaotable\" width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\" style=\"display:\">\r\n");
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
