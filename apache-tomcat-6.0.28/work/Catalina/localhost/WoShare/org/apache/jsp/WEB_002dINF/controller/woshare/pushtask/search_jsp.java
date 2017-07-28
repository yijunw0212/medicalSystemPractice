package org.apache.jsp.WEB_002dINF.controller.woshare.pushtask;

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
      out.write("<form name=\"myForm\" action=\"task/SendTaskShowAction_taskSearch.action\" method=\"post\">\r\n");
      out.write("<table width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"2\" class=\"thead\">\r\n");
      out.write(" <div class=\"tit_box\">条件搜索</div>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>标题：</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<input type=\"text\" id=\"title\" name=\"title\" value=\"\" />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>推送时间：</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<input type=\"text\" name=\"s_begintime\" id=\"s_begintime\" size=\"30\" readonly\r\n");
      out.write("><input type=\"reset\" value=\" ...\" onclick=\"return showCalendar('s_begintime', '%Y-%m-%d %H:%M:00', '24', true);\" />\r\n");
      out.write("\t\t至\r\n");
      out.write("\t\t<input type=\"text\" name=\"e_begintime\" id=\"e_begintime\" size=\"30\" readonly\r\n");
      out.write("><input type=\"reset\" value=\" ...\" onclick=\"return showCalendar('e_begintime', '%Y-%m-%d %H:%M:00', '24', true);\" />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>添加时间：</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<input type=\"text\" name=\"s_addtime\" id=\"s_addtime\" size=\"30\" readonly\r\n");
      out.write("><input type=\"reset\" value=\" ...\" onclick=\"return showCalendar('s_addtime', '%Y-%m-%d %H:%M:00', '24', true);\" />\r\n");
      out.write("\t\t至\r\n");
      out.write("\t\t<input type=\"text\" name=\"e_addtime\" id=\"e_addtime\" size=\"30\" readonly\r\n");
      out.write("><input type=\"reset\" value=\" ...\" onclick=\"return showCalendar('e_addtime', '%Y-%m-%d %H:%M:00', '24', true);\" />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>推送任务类型：</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<select id=\"type\" name=\"type\">\r\n");
      out.write("\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t<!-- \r\n");
      out.write("\t\t\t\t<option value=\"0\">系统消息任务</option>\r\n");
      out.write("\t\t\t\t -->\r\n");
      out.write("\t\t\t\t<option value=\"1\">软件任务</option>\r\n");
      out.write("\t\t\t\t<option value=\"2\">书籍任务</option>\r\n");
      out.write("\t\t\t\t<option value=\"3\">微博任务</option>\r\n");
      out.write("\t\t\t\t<option value=\"4\">客户端升级任务</option>\r\n");
      out.write("\t\t\t\t<option value=\"5\">广告任务</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>审核状态：</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<select id=\"status\" name=\"status\">\r\n");
      out.write("\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t<option value=\"0\">未审核</option>\r\n");
      out.write("\t\t\t\t<option value=\"1\">审核通过</option>\r\n");
      out.write("\t\t\t\t<option value=\"2\">审核未通过</option>\r\n");
      out.write("\t\t\t\t<!-- \r\n");
      out.write("\t\t\t\t<option value=\"3\">已翻译</option>\r\n");
      out.write("\t\t\t\t -->\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\" style=\"text-align:center\"><input type=\"submit\" name=\"tijiao\" id=\"tijiao\" value=\"提交\" />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
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
