package org.apache.jsp.WEB_002dINF.controller.woshare.lbs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'search.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/base.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jscalendar/calendar.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jscalendar/lang/calendar-zh.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"js/jscalendar/skins/aqua/theme.css\" title=\"Aqua\" />\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("var oldLink = null;\r\n");
      out.write("function selected(cal, date) {\r\n");
      out.write("  cal.sel.value = date;\r\n");
      out.write("  if (cal.dateClicked && (cal.sel.id == \"sel1\" || cal.sel.id == \"sel3\"))\r\n");
      out.write("    cal.callCloseHandler();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function closeHandler(cal) {\r\n");
      out.write("  cal.hide();\r\n");
      out.write("  _dynarch_popupCalendar = null;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function showCalendar(id, format, showsTime, showsOtherMonths) {\r\n");
      out.write("  var el = document.getElementById(id);\r\n");
      out.write("  if (_dynarch_popupCalendar != null) {\r\n");
      out.write("    _dynarch_popupCalendar.hide();\r\n");
      out.write("  } else {\r\n");
      out.write("    var cal = new Calendar(1, null, selected, closeHandler);\r\n");
      out.write("    if (typeof showsTime == \"string\") {\r\n");
      out.write("      cal.showsTime = true;\r\n");
      out.write("      cal.time24 = (showsTime == \"24\");\r\n");
      out.write("    }\r\n");
      out.write("    if (showsOtherMonths) {\r\n");
      out.write("      cal.showsOtherMonths = true;\r\n");
      out.write("    }\r\n");
      out.write("    _dynarch_popupCalendar = cal;\r\n");
      out.write("    cal.setRange(1900, 2070);\r\n");
      out.write("    cal.create();\r\n");
      out.write("  }\r\n");
      out.write("  _dynarch_popupCalendar.setDateFormat(format);\r\n");
      out.write("  _dynarch_popupCalendar.parseDate(el.value);\r\n");
      out.write("  _dynarch_popupCalendar.sel = el;\r\n");
      out.write("\r\n");
      out.write("  _dynarch_popupCalendar.showAtElement(el.nextSibling, \"Br\");\r\n");
      out.write("\r\n");
      out.write("  return false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var MINUTE = 60 * 1000;\r\n");
      out.write("var HOUR = 60 * MINUTE;\r\n");
      out.write("var DAY = 24 * HOUR;\r\n");
      out.write("var WEEK = 7 * DAY;\r\n");
      out.write("\r\n");
      out.write("function isDisabled(date) {\r\n");
      out.write("  var today = new Date();\r\n");
      out.write("  return (Math.abs(date.getTime() - today.getTime()) / DAY) > 10;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function flatSelected(cal, date) {\r\n");
      out.write("  var el = document.getElementById(\"preview\");\r\n");
      out.write("  el.innerHTML = date;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function showFlatCalendar() {\r\n");
      out.write("  var parent = document.getElementById(\"display\");\r\n");
      out.write("  var cal = new Calendar(0, null, flatSelected);\r\n");
      out.write("  cal.weekNumbers = false;\r\n");
      out.write("  cal.setDisabledHandler(isDisabled);\r\n");
      out.write("  cal.setDateFormat(\"%A, %B %e\");\r\n");
      out.write("  cal.create(parent);\r\n");
      out.write("  cal.show();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("  <body>\r\n");
      out.write("  <form name=\"typeForm\" action=\"user/ChargeInfoAction_infoList.action\"\r\n");
      out.write("\t\t\tmethod=\"post\">\r\n");
      out.write("\t\t\t<table width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" class=\"thead\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tit_box\">\r\n");
      out.write("\t\t\t\t\t\t\t投诉信息查询\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t手机号码:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"chargeInfo.phone\" name=\"chargeInfo.phone\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t系统UUID:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"chargeInfo.uuid\" name=\"chargeInfo.uuid\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t投诉类型:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"chargeInfo.typeLevel1\" id=\"chargeManager.parentid\" value=\"\" readonly/>\r\n");
      out.write("\t\t\t\t\t<span id=\"parentname\"></span>\r\n");
      out.write("\t\t\t\t\t<!-- < a href=\"javascript:openPage('选择产品类型','user/ChargeManagerAction_typeList.action?chargeManager.parentid=-1&returnUrl=returnType')\">选择</a>-->\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:openPage('选择产品类型','user/ChargeManagerAction_typeList.action?chargeManager.parentid=-1&returnUrl=selectType')\">选择</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t标题[关键字]:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"chargeInfo.title\" name=\"chargeInfo.title\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t状态:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select id=\"chargeInfo.status\" name=\"chargeInfo.status\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\" selected></option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\">未发送</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">已发送</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t是否紧急:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select id=\"chargeInfo.isexigence\" name=\"chargeInfo.isexigence\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\" selected></option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\">否</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">是</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t发送时间:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"s_addtime\" id=\"s_addtime\" size=\"30\" readonly\r\n");
      out.write("><input type=\"reset\" value=\" ...\" onclick=\"return showCalendar('s_addtime', '%Y-%m-%d %H:%M:00', '24', true);\" />\r\n");
      out.write("\t\t至\r\n");
      out.write("\t\t<input type=\"text\" name=\"e_addtime\" id=\"e_addtime\" size=\"30\" readonly\r\n");
      out.write("><input type=\"reset\" value=\" ...\" onclick=\"return showCalendar('e_addtime', '%Y-%m-%d %H:%M:00', '24', true);\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t位置[关键字]:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t经度：<input type=\"text\" id=\"chargeInfo.jingdu\" name=\"chargeInfo.jingdu\" /> &nbsp;纬度：<input type=\"text\" id=\"chargeInfo.weidu\" name=\"chargeInfo.weidu\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t附近建筑[关键字]:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"chargeInfo.aboutbuilding\" name=\"chargeInfo.aboutbuilding\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t投诉内容[关键字]:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"chargeInfo.content\" name=\"chargeInfo.content\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t姓名[关键字]:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"chargeInfo.name\" name=\"chargeInfo.name\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\tQQ:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"chargeInfo.qq\" name=\"chargeInfo.qq\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t性别:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select id=\"chargeInfo.sex\" name=\"chargeInfo.sex\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\" selected></option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">男</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\">女</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t投诉人电话号码:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"chargeInfo.phonenumber\" name=\"chargeInfo.phonenumber\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t投诉人E-mail:\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"chargeInfo.email\" name=\"chargeInfo.email\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" style=\"text-align:center\"><input type=\"submit\" name=\"tijiao\" id=\"tijiao\" value=\"提交\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("  </form>\r\n");
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
