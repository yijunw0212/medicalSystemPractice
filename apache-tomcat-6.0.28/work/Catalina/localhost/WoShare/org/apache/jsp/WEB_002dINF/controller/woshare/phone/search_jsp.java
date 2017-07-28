package org.apache.jsp.WEB_002dINF.controller.woshare.phone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("    <title>The Coolest DHTML Calendar - Online Demo</title>\r\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/xml; charset=utf-8\" />\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/base.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"js/jscalendar/skins/aqua/theme.css\" title=\"Aqua\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jscalendar/calendar.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jscalendar/lang/calendar-zh.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"myForm\" action=\"phone/PhoneRegisterAction_search.action\" method=\"post\">\r\n");
      out.write("<table width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"2\" class=\"thead\">\r\n");
      out.write(" <div class=\"tit_box\">搜索条件查询</div>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"20%\">手机号码：</td>\r\n");
      out.write("    <td width=\"80%\"><input type=\"text\" name=\"phonenumb\" id=\"phonenumb\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>手机安装时间：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"s_addtime\" id=\"s_addtime\" size=\"30\" readonly\r\n");
      out.write("><input type=\"reset\" value=\" ...\" onclick=\"return showCalendar('s_addtime', '%Y-%m-%d %H:%M:00', '24', true);\" />\r\n");
      out.write("\t\t至\r\n");
      out.write("\t\t<input type=\"text\" name=\"e_addtime\" id=\"e_addtime\" size=\"30\" readonly\r\n");
      out.write("><input type=\"reset\" value=\" ...\" onclick=\"return showCalendar('e_addtime', '%Y-%m-%d %H:%M:00', '24', true);\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>手机标识：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"sysUuid\" id=\"sysUuid\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <!-- \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>手机硬件码(IMEI)：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"imei\" id=\"imei\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>手机卡码(IMSI)：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"imsi\" id=\"imsi\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>手机型号：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"model\" id=\"model\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>版本(SDK)：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"sdk\" id=\"sdk\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>操作系统版本：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"operationVersion\" id=\"operationVersion\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>屏幕宽度：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"width\" id=\"width\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>屏幕高度：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"heightin\" id=\"heightin\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>国家：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"country\" id=\"country\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>服务商：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"serviceBusiness\" id=\"serviceBusiness\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>SIM卡号：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"\" id=\"\" />\r\n");
      out.write("    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${phoneRegister.simSerialNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>制造商：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"manufacturer\" id=\"manufacturer\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>Linux版本：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"linuxVersion\" id=\"linuxVersion\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>处理器：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"processor\" id=\"processor\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>重要级别：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"status\" id=\"status\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>手机类型：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"iphonetype\" id=\"iphonetype\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("   -->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>操作系统类型：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <select id=\"type\" name=\"type\">\r\n");
      out.write("    \t<option value=\"\"></option>\r\n");
      out.write("    \t<option value=\"0\">Android</option>\r\n");
      out.write("    \t<option value=\"1\">IPhone</option>\r\n");
      out.write("    </select>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <!-- \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>客户端版本：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"version\" id=\"version\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>苹果标识：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"text\" name=\"udid\" id=\"udid\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("   -->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"2\" style=\"text-align:center\"><input type=\"submit\" name=\"button\" id=\"button\" value=\"搜索\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
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
