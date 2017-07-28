package org.apache.jsp.WEB_002dINF.controller.woshare.pushtask;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftoken_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fdate_0026_005fname_005fformat_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005ftoken_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fname_005fformat_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005ftoken_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fname_005fformat_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.release();
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
      out.write("    <title>推送任务添加</title>\r\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/xml; charset=utf-8\" />\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/base.js\"></script>\r\n");
      out.write("\t\r\n");
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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function checkHomepage (str) {\r\n");
      out.write("\t//主页正则表达式 //\r\n");
      out.write("\tvar isHomepage=/^\\w+([\\.\\-]\\w)*$/; \r\n");
      out.write("\t//验证主页，返回结果\r\n");
      out.write("\t//return !(isHomepage.test(str)); \r\n");
      out.write("\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("//比较时间 格式 yyyy-mm-dd hh:mi:ss\r\n");
      out.write("function comptime(time) {\r\n");
      out.write("\ttry{\r\n");
      out.write("\t\tvar now = new Date();\r\n");
      out.write("\t\tvar beginTime = time.toString();\r\n");
      out.write("\t\tvar beginTimes = beginTime.substring(0, 10).split('-');\r\n");
      out.write("\t\tbeginTime = beginTimes[1] + '-' + beginTimes[2] + '-' + beginTimes[0]\r\n");
      out.write("\t\t\t\t+ ' ' + beginTime.substring(10, 19);\r\n");
      out.write("\t\t//firefox对于类似“2010-12-20 15:55:00”这种时间的转换格式不感冒，返回Nan，查了查资料，把“-”替换为“/”就可以了\r\n");
      out.write("\t\tbeginTime = beginTime.replace(\"-\", \"/\").replace(\"-\", \"/\");\r\n");
      out.write("\t\tvar a = (Date.parse(beginTime) - now.getTime()) / 3600 / 1000;\r\n");
      out.write("\t\tif (a >= 0) {\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}catch(ex){\r\n");
      out.write("\t\talert(\"时间格式传入错误，目前仅支持 yyyy-mm-dd hh:mi:ss的时间格式\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\tfunction checkForm(tp) {\r\n");
      out.write("\t\t//判断推送对象\r\n");
      out.write("\t\tif (document.getElementById(\"sendUrl\").value != null\r\n");
      out.write("\t\t\t\t&& document.getElementById(\"sendUrl\").value.trim() != \"\") {\r\n");
      out.write("\t\t\tif (!(checkImage('sendUrl', 'sendUrlLayer', true, 2))) {\r\n");
      out.write("\t\t\t\t//填写推送对象，则必须上传txt类型的\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//判断推送时间\r\n");
      out.write("\t\tif(document.getElementById(\"begintime\").value!=null && document.getElementById(\"begintime\").value.trim()!=\"\"){\r\n");
      out.write("\t\t\tif(!comptime(document.getElementById(\"begintime\").value)){\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"begintimeLayer\").innerHTML=\"<font color='red'>推送时间小于系统当前时间，无法完成推送，请重新选择！</font>\";\r\n");
      out.write("\t\t\t\treturn ;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar type = parseInt(tp);\r\n");
      out.write("\t\tvar list = null;\r\n");
      out.write("\t\tswitch (type) {\r\n");
      out.write("\t\tcase 0://系统消息\r\n");
      out.write("\t\t\tlist = new Array(new ValidateEntity(\"title\", \"标题不能为空！\",\r\n");
      out.write("\t\t\t\t\t\"titleLayer\",\"100\",\"字符超过限制，不能超过100个字节，一个汉字为2个字节！\"), new ValidateEntity(\"begintime\", \"请选择推送时间！\",\r\n");
      out.write("\t\t\t\t\t\"begintimeLayer\"), new ValidateEntity(\"url\", \"请上传图片！\",\r\n");
      out.write("\t\t\t\t\t\"urlLayer\"), new ValidateEntity(\"sysdescription\", \"请填写描述！\",\r\n");
      out.write("\t\t\t\t\t\"sysdescriptionLayer\",\"1000\",\"字符超过限制，不能超过1000个字节，一个汉字为2个字节！\"));\r\n");
      out.write("\t\t\tif (validate(list)) {\r\n");
      out.write("\t\t\t\tif (!(checkImage('url', 'urlLayer', true, 1))) {\r\n");
      out.write("\t\t\t\t\t//必须上传海报图片\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tdocument.forms[0].submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase 1://软件\r\n");
      out.write("\t\t\tlist = new Array(\r\n");
      out.write("\t\t\t\t\t\t\tnew ValidateEntity(\"title\", \"标题不能为空！\",\"titleLayer\",\"100\",\"字符超过限制，不能超过100个字节，一个汉字为2个字节！\"), \r\n");
      out.write("\t\t\t\t\t\t\tnew ValidateEntity(\"begintime\", \"请选择推送时间！\",\"begintimeLayer\"),\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tnew ValidateEntity(\"softName\", \"请填写软件名称！\", \"softNameLayer\",\"100\",\"字符超过限制，不能超过100个字节，一个汉字为2个字节！\"),\r\n");
      out.write("\t\t\t\t\t\t\tnew ValidateEntity(\"softVersion\",\"请填写软件版本！\", \"softVersionLayer\",\"20\",\"字符超过限制，不能超过20个字节，一个汉字为2个字节！\"),\r\n");
      out.write("\t\t\t\t\t\t\tnew ValidateEntity(\"softSize\",\"请填写软件大小！\", \"softSizeLayer\",\"200\",\"字符超过限制，不能超过200个字节，一个汉字为2个字节！\"),\r\n");
      out.write("\t\t\t\t\t\t\tnew ValidateEntity(\"softType\",\"请选择软件类型！\", \"softTypeLayer\"), \r\n");
      out.write("\t\t\t\t\t\t\tnew ValidateEntity(\"softUrl\", \"请填写软件链接！\", \"softUrlLayer\",\"500\",\"字符超过限制，不能超过500个字节，一个汉字为2个字节！\"),\r\n");
      out.write("\t\t\t\t\t\t\tnew ValidateEntity(\"softImageUrl\", \"请上传软件图片！\",\"softImageUrlLayer\"), \r\n");
      out.write("\t\t\t\t\t\t\tnew ValidateEntity(\"softDescription\", \"请填写软件描述！\",\"softDescriptionLayer\",\"1000\",\"字符超过限制，不能超过1000个字节，一个汉字为2个字节！\")\r\n");
      out.write("\t\t\t\t\t\t\t);\r\n");
      out.write("\t\t\tif (validate(list)) {\r\n");
      out.write("\t\t\t\t//判断链接地址\r\n");
      out.write("\t\t\t\tif (checkHomepage(document.getElementById(\"softUrl\"))) {\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"softUrlLayer\").innerHTML = \"<font color='red'>链接地址不符合要求！请重新填写！</font>\";\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (!(checkImage('softImageUrl', 'softImageUrlLayer', true, 1))) {\r\n");
      out.write("\t\t\t\t\t//必须上传海报图片\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (!(checkImage('upload', 'uploadLayer', false, 1))) {\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"uploadLayer\").innerHTML = \"\" ;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tdocument.forms[0].submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase 2://书籍\r\n");
      out.write("\t\t\tlist = new Array(new ValidateEntity(\"title\", \"标题不能为空！\",\r\n");
      out.write("\t\t\t\t\t\"titleLayer\",\"100\",\"字符超过限制，不能超过100个字节，一个汉字为2个字节！\"), new ValidateEntity(\"begintime\", \"请选择推送时间！\",\r\n");
      out.write("\t\t\t\t\t\"begintimeLayer\"),\r\n");
      out.write("\r\n");
      out.write("\t\t\tnew ValidateEntity(\"bookName\", \"请填写书籍名称！\", \"bookNameLayer\",\"50\",\"字符超过限制，不能超过50个字节，一个汉字为2个字节！\"),\r\n");
      out.write("\t\t\t\t\tnew ValidateEntity(\"bookAuthor\", \"请填写书籍作者！\",\r\n");
      out.write("\t\t\t\t\t\t\t\"bookAuthorLayer\",\"50\",\"字符超过限制，不能超过50个字节，一个汉字为2个字节！\"), new ValidateEntity(\"bookUrl\",\r\n");
      out.write("\t\t\t\t\t\t\t\"请填写链接地址！\", \"bookUrlLayer\",\"500\",\"字符超过限制，不能超过500个字节，一个汉字为2个字节！\"), new ValidateEntity(\r\n");
      out.write("\t\t\t\t\t\t\t\"bookImageUrl\", \"请上传书籍图片！\", \"bookImageUrlLayer\"),\r\n");
      out.write("\t\t\t\t\tnew ValidateEntity(\"bookDescription\", \"请填写书籍描述！\",\r\n");
      out.write("\t\t\t\t\t\t\t\"bookDescriptionLayer\",\"1000\",\"字符超过限制，不能超过1000个字节，一个汉字为2个字节！\"));\r\n");
      out.write("\t\t\tif (validate(list)) {\r\n");
      out.write("\t\t\t\tif (checkHomepage(document.getElementById(\"bookUrl\"))) {\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"bookUrlLayer\").innerHTML = \"<font color='red'>链接地址不符合要求！请重新填写！</font>\";\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (!(checkImage('bookImageUrl', 'bookImageUrlLayer', true, 1))) {\r\n");
      out.write("\t\t\t\t\t//必须上传海报图片\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tdocument.forms[0].submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase 3://微博\r\n");
      out.write("\t\t\tlist = new Array(\r\n");
      out.write("\t\t\t\t\tnew ValidateEntity(\"title\", \"标题不能为空！\", \"titleLayer\",\"100\",\"字符超过限制，不能超过100个字节，一个汉字为2个字节！\"),\r\n");
      out.write("\t\t\t\t\tnew ValidateEntity(\"begintime\", \"请选择推送时间！\",\r\n");
      out.write("\t\t\t\t\t\t\t\"begintimeLayer\"),\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tnew ValidateEntity(\"weiboName\", \"请填写名称！\", \"weiboNameLayer\",\"100\",\"字符超过限制，不能超过100个字节，一个汉字为2个字节！\"),\r\n");
      out.write("\t\t\t\t\tnew ValidateEntity(\"weiboUrl\", \"请填写链接地址！\", \"weiboUrlLayer\",\"500\",\"字符超过限制，不能超过500个字节，一个汉字为2个字节！\"),\r\n");
      out.write("\t\t\t\t\tnew ValidateEntity(\"weiboImageUrl\", \"请上传图片！\",\r\n");
      out.write("\t\t\t\t\t\t\t\"weiboImageUrlLayer\"), new ValidateEntity(\r\n");
      out.write("\t\t\t\t\t\t\t\"weiboContent\", \"请填写内容！\", \"weiboContentLayer\"));\r\n");
      out.write("\t\t\tif (validate(list)) {\r\n");
      out.write("\t\t\t\tif (checkHomepage(document.getElementById(\"weiboUrl\"))) {\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"weiboUrlLayer\").innerHTML = \"<font color='red'>链接地址不符合要求！请重新填写！</font>\";\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (!(checkImage('weiboImageUrl', 'weiboImageUrlLayer', true, 4))) {\r\n");
      out.write("\t\t\t\t\t//必须上传海报图片\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(document.getElementById(\"weiboContent\").value.length>140){\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"weiboContentLayer\").innerHTML=\"<font color='red'>字符超过限制，不能超过140个字符！</font>\";\r\n");
      out.write("\t\t\t\t\treturn ;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tdocument.forms[0].submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase 4://客户端升级\r\n");
      out.write("\t\t\tlist = new Array(new ValidateEntity(\"title\", \"标题不能为空！\",\r\n");
      out.write("\t\t\t\t\t\"titleLayer\",\"100\",\"字符超过限制，不能超过100个字节，一个汉字为2个字节！\"), new ValidateEntity(\"begintime\", \"请选择推送时间！\",\r\n");
      out.write("\t\t\t\t\t\"begintimeLayer\"),\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tnew ValidateEntity(\"upSoftName\", \"请填写软件名称！\", \"upSoftNameLayer\",\"200\",\"字符超过限制，不能超过200个字节，一个汉字为2个字节！\"),\r\n");
      out.write("\t\t\t\t\tnew ValidateEntity(\"downUrl\", \"请填写下载地址！\", \"downUrlLayer\",\"500\",\"字符超过限制，不能超过500个字节，一个汉字为2个字节！\"),\r\n");
      out.write("\t\t\t\t\tnew ValidateEntity(\"upDescription\", \"请填写升级描述！\",\"upDescriptionLayer\",\"1000\",\"字符超过限制，不能超过1000个字节，一个汉字为2个字节！\"));\r\n");
      out.write("\t\t\tif (validate(list)) {\r\n");
      out.write("\t\t\t\t//组合软件版本\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"upVersion\").value=document.getElementById(\"upVersionA\").value+document.getElementById(\"upVersionB\").value+document.getElementById(\"upVersionC\").value+document.getElementById(\"upVersionD\").value;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (!(checkImage('downUrl', 'downUrlLayer', true, 3))) {\r\n");
      out.write("\t\t\t\t\t//必须上传海报图片\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tdocument.forms[0].submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase 5://广告任务\r\n");
      out.write("\t\t\tlist = new Array(new ValidateEntity(\"title\", \"标题不能为空！\",\r\n");
      out.write("\t\t\t\t\t\"titleLayer\",\"100\",\"字符超过限制，不能超过100个字节，一个汉字为2个字节！\"), new ValidateEntity(\"begintime\", \"请选择推送时间！\",\r\n");
      out.write("\t\t\t\t\t\"begintimeLayer\"),\r\n");
      out.write("\r\n");
      out.write("\t\t\tnew ValidateEntity(\"adTitle\", \"请填写标题！\", \"adTitleLayer\",\"100\",\"字符超过限制，不能超过100个字节，一个汉字为2个字节！\"),\r\n");
      out.write("\t\t\t\t\tnew ValidateEntity(\"adUrl\", \"请填写链接地址！\", \"adUrlLayer\",\"500\",\"字符超过限制，不能超过500个字节，一个汉字为2个字节！\"),\r\n");
      out.write("\t\t\t\t\tnew ValidateEntity(\"adImageUrl\", \"请上传图片！\",\r\n");
      out.write("\t\t\t\t\t\t\t\"adImageUrlLayer\"));\r\n");
      out.write("\t\t\tif (validate(list)) {\r\n");
      out.write("\t\t\t\tif (checkHomepage(document.getElementById(\"adUrl\"))) {\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"adUrlLayer\").innerHTML = \"<font color='red'>链接地址不符合要求！请重新填写！</font>\";\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (!(checkImage('adImageUrl', 'adImageUrlLayer', true, 1))) {\r\n");
      out.write("\t\t\t\t\t//必须上传海报图片\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(checkAllowLength(document.getElementById(\"adDescription\").value,\"1000\")){\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"adDescriptionLayer\").innerHTML=\"<font color='red'>字符超过限制，不能超过1000个字节，一个汉字为2个字节！</font>\";\r\n");
      out.write("\t\t\t\t\treturn ;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tdocument.forms[0].submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction deleteRow(obj)   \r\n");
      out.write("\t{   \r\n");
      out.write("\tvar i=obj.parentNode.parentNode.rowIndex;\r\n");
      out.write("\tdocument.getElementById('myTable').deleteRow(i)   \r\n");
      out.write("\t}\r\n");
      out.write("\tfunction insertRowInTable(){\r\n");
      out.write("\t\tvar table = document.getElementById(\"myTable\");   \r\n");
      out.write("\t\tif(table.rows.length>=5){\r\n");
      out.write("\t\t\talert(\"最多添加五组图片！\");\r\n");
      out.write("\t\t\treturn ;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar newRow = table.insertRow(-1);   \r\n");
      out.write("\t\tnewRow.insertCell(0).innerHTML = \"<div name='div' >组图片： <input type=file size=70 name=upload onkeydown='return   false'  onpaste='return   false'  ondragenter='return   false'  /><br/></div>\";   \r\n");
      out.write("\t\tnewRow.insertCell(-1).innerHTML = \"<input type='button' value='删除' onclick='deleteRow(this)'>\";\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"myForm\" action=\"task/SendTaskAction_taskAdd.action\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      if (_jspx_meth_s_005ftoken_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<input type=\"hidden\" id=\"type\" name=\"type\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("<table width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"2\" class=\"thead\">\r\n");
      out.write(" <div class=\"tit_box\">推送任务</div>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td style=\"width:120px; word-break:break-all\">标题：</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"dateStr\" name=\"dateStr\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${date }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t<!-- \r\n");
      out.write("\t\t[");
      if (_jspx_meth_s_005fdate_005f0(_jspx_page_context))
        return;
      out.write("]:\r\n");
      out.write("\t\t -->\r\n");
      out.write("\t\t<input type=\"text\" id=\"title\" name=\"title\" value=\"\" />\r\n");
      out.write("\t\t<span id=\"titleLayer\"><font color=\"#FF0000\">*</font>不超过50个汉字，或100个字节(数字，字母和下划线)</span>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>推送时间：</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<input type=\"text\" name=\"begintime\" id=\"begintime\" size=\"30\" readonly\r\n");
      out.write("><input type=\"reset\" value=\" ...\" onClick=\"return showCalendar('begintime', '%Y-%m-%d %H:%M:00', '24', true);\" />\r\n");
      out.write("\t\t<span id=\"begintimeLayer\"><font color=\"#FF0000\">*</font>格式：yyyy-MM-dd HH:mm:ss,精确到分</span>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>发送对象：</td>\r\n");
      out.write("\t\t<td><input type=\"file\" id=\"sendUrl\" name=\"sendUrl\" disabled=\"disabled\" size=\"60\" onkeydown='return   false'  onpaste='return   false'  ondragenter='return   false'/>\r\n");
      out.write("\t\t<span id=\"sendUrlLayer\"><font color=\"green\">*二期实现</font></span>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>追加号码：</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<textarea rows=\"5\" cols=\"60\" id=\"superaddition\" name=\"superaddition\" disabled=\"disabled\" ></textarea>\r\n");
      out.write("\t\t<span id=\"superadditionLayer\"><font color=\"green\">*二期实现</font></span>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_s_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      if (_jspx_meth_s_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_s_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_s_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_s_005fif_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_s_005fif_005f6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td style=\"text-align:center\"><input type=\"button\" name=\"tijiao\" id=\"tijiao\" value=\"提交\" onClick=\"checkForm('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("')\">\r\n");
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

  private boolean _jspx_meth_s_005ftoken_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:token
    org.apache.struts2.views.jsp.ui.TokenTag _jspx_th_s_005ftoken_005f0 = (org.apache.struts2.views.jsp.ui.TokenTag) _005fjspx_005ftagPool_005fs_005ftoken_005fnobody.get(org.apache.struts2.views.jsp.ui.TokenTag.class);
    _jspx_th_s_005ftoken_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftoken_005f0.setParent(null);
    int _jspx_eval_s_005ftoken_005f0 = _jspx_th_s_005ftoken_005f0.doStartTag();
    if (_jspx_th_s_005ftoken_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftoken_005fnobody.reuse(_jspx_th_s_005ftoken_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftoken_005fnobody.reuse(_jspx_th_s_005ftoken_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fdate_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_005fdate_005f0 = (org.apache.struts2.views.jsp.DateTag) _005fjspx_005ftagPool_005fs_005fdate_0026_005fname_005fformat_005fnobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_005fdate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fdate_005f0.setParent(null);
    // /WEB-INF/controller/woshare/pushtask/add.jsp(315,3) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f0.setName("#request.date");
    // /WEB-INF/controller/woshare/pushtask/add.jsp(315,3) name = format type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fdate_005f0.setFormat("yyyy-MM-dd HH:mm:ss");
    int _jspx_eval_s_005fdate_005f0 = _jspx_th_s_005fdate_005f0.doStartTag();
    if (_jspx_th_s_005fdate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fdate_0026_005fname_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fdate_0026_005fname_005fformat_005fnobody.reuse(_jspx_th_s_005fdate_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent(null);
    // /WEB-INF/controller/woshare/pushtask/add.jsp(342,1) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("#request.type==0");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>图片链接：</td>\r\n");
        out.write("\t\t<td><input type=\"file\" id=\"url\" name=\"url\" size=\"60\" onkeydown='return   false'  onpaste='return   false'  ondragenter='return   false'/>\r\n");
        out.write("\t\t<span id=\"urlLayer\"><font color=\"#FF0000\">*</font>支持jpg，png格式，建议图片小于200K</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>系统通知描述：</td>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t<textarea rows=\"5\" cols=\"60\" id=\"sysdescription\" name=\"sysdescription\" class=\"txtarea\"></textarea>\r\n");
        out.write("\t\t<span id=\"sysdescriptionLayer\"><font color=\"#FF0000\">*</font>不超过1000个字节，一个汉字为2个字节(汉字，数字，字母和下划线)</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f1.setParent(null);
    // /WEB-INF/controller/woshare/pushtask/add.jsp(357,1) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f1.setTest("#request.type==1");
    int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
    if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>版本类型：</td>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t\t<select name=\"edition\">\r\n");
        out.write("\t\t\t\t<option value=\"1\">Android</option>\r\n");
        out.write("\t\t\t\t<option value=\"2\">IPhone</option>\r\n");
        out.write("\t\t\t</select>\r\n");
        out.write("\t\t\t<span id=\"editionLayer\"><font color=\"#FF0000\">*</font>版本类型用于知道软件用于那一款手机操作系统上</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f2 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f2.setParent(null);
    // /WEB-INF/controller/woshare/pushtask/add.jsp(371,0) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f2.setTest("#request.type==1");
    int _jspx_eval_s_005fif_005f2 = _jspx_th_s_005fif_005f2.doStartTag();
    if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("<table width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td colspan=\"2\" class=\"thead\">\r\n");
        out.write(" <div class=\"tit_box\">添加软件</div>\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td style=\"width:120px; word-break:break-all\">软件名称：</td>\r\n");
        out.write("\t\t<td><input type=\"text\" id=\"softName\" name=\"softName\" value=\"\" />\r\n");
        out.write("\t\t<span id=\"softNameLayer\"><font color=\"#FF0000\">*</font>不超过50个汉字，或100个字节(汉字，数字，字母和下划线)</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>软件版本：</td>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t<input type=\"text\" id=\"softVersion\" name=\"softVersion\" value=\"\" />\r\n");
        out.write("\t\t<span id=\"softVersionLayer\"><font color=\"#FF0000\">*</font>支持字符串格式，如:1.0,9.9,绿色版，稳定版等</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>软件大小：</td>\r\n");
        out.write("\t\t<td><input type=\"text\" id=\"softSize\" name=\"softSize\" value=\"\" />\r\n");
        out.write("\t\t<span id=\"softSizeLayer\"><font color=\"#FF0000\">*</font>支持字符串格式，例：2.56M，128K等</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>软件类型：</td>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t<select id=\"softType\" name=\"softType\">\r\n");
        out.write("\t\t\t<option value=\"系统\">系统</option>\r\n");
        out.write("\t\t\t<option value=\"网络\">网络</option>\r\n");
        out.write("\t\t\t<option value=\"音乐\">音乐</option>\r\n");
        out.write("\t\t\t<option value=\"视频\">视频</option>\r\n");
        out.write("\t\t\t<option value=\"商务\">商务</option>\r\n");
        out.write("\t\t\t<option value=\"社交\">社交</option>\r\n");
        out.write("\t\t\t<option value=\"信息\">信息</option>\r\n");
        out.write("\t\t\t<option value=\"游戏\">游戏</option>\r\n");
        out.write("\t\t\t<option value=\"健康\">健康</option>\r\n");
        out.write("\t\t\t<option value=\"其它\">其它</option>\r\n");
        out.write("\t\t</select>\r\n");
        out.write("\t\t<span id=\"softTypeLayer\"><font color=\"#FF0000\">*</font>软件类型用于对软件快速分类</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>链接地址：</td>\r\n");
        out.write("\t\t<td><input type=\"text\" id=\"softUrl\" name=\"softUrl\" value=\"\" />\r\n");
        out.write("\t\t<span id=\"softUrlLayer\"><font color=\"#FF0000\">*</font>对于IPhone软件，请给出iTunes地址</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>应用图标：</td>\r\n");
        out.write("\t\t<td><input type=\"file\" id=\"softImageUrl\" name=\"softImageUrl\" size=\"60\" onkeydown='return   false'  onpaste='return   false'  ondragenter='return   false'/>\r\n");
        out.write("\t\t<span id=\"softImageUrlLayer\"><font color=\"#FF0000\">*</font>支持jpg，png格式，建议图片小于200K，android大小72*72，iPhone大小57*57</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>软件套图：</td>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t\t<input name=\"paragraphAdd\" type=\"button\" value=\"增加图片\" onClick=\"insertRowInTable();\" />\r\n");
        out.write("\t\t\t<span id=\"uploadLayer\"><font color=\"#FF0000\">*</font>支持jpg，png格式，建议图片小于200K</span>\r\n");
        out.write("\t\t\t<table id=\"myTable\" width=\"100%\" align=\"center\">  \r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t<td id=\"c1\"><div id='div0' onMouseMove=\"\">\r\n");
        out.write("\t\t\t            组图片： <input type=file name=upload size=70 onkeydown='return   false'  onpaste='return   false'  ondragenter='return   false' />\r\n");
        out.write("\t\t\t            <br/></div>\r\n");
        out.write("\t\t\t</td>\r\n");
        out.write("\t\t\t<td id=\"c2\"><input type=\"button\" value=\"删除\" onClick=\"deleteRow(this)\"></td>   \r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t</table>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\t\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>软件描述：</td>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t<textarea rows=\"5\" cols=\"60\" id=\"softDescription\" name=\"softDescription\"></textarea>\r\n");
        out.write("\t\t<span id=\"softDescriptionLayer\"><font color=\"#FF0000\">*</font>不超过1000个字节，一个汉字为2个字节(汉字，数字，字母和下划线)</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("</table>\r\n");
        int evalDoAfterBody = _jspx_th_s_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f3 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f3.setParent(null);
    // /WEB-INF/controller/woshare/pushtask/add.jsp(453,0) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f3.setTest("#request.type==2");
    int _jspx_eval_s_005fif_005f3 = _jspx_th_s_005fif_005f3.doStartTag();
    if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("<table width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td colspan=\"2\" class=\"thead\">\r\n");
        out.write(" <div class=\"tit_box\">添加书籍</div>\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td style=\"width:120px; word-break:break-all\">书名：</td>\r\n");
        out.write("\t\t<td><input type=\"text\" id=\"bookName\" name=\"bookName\" value=\"\" />\r\n");
        out.write("\t\t<span id=\"bookNameLayer\"><font color=\"#FF0000\">*</font>不超过25个汉字，或50个字节(汉字，数字，字母和下划线)</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>作者：</td>\r\n");
        out.write("\t\t<td><input type=\"text\" id=\"bookAuthor\" name=\"bookAuthor\" value=\"\" />\r\n");
        out.write("\t\t<span id=\"bookAuthorLayer\"><font color=\"#FF0000\">*</font>请填写书籍的作者</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>链接地址：</td>\r\n");
        out.write("\t\t<td><input type=\"text\" id=\"bookUrl\" name=\"bookUrl\" value=\"\" />\r\n");
        out.write("\t\t<span id=\"bookUrlLayer\"><font color=\"#FF0000\">*</font>书籍的链接地址</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>书籍大小：</td>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t<input type=\"text\" id=\"bookSize\" name=\"bookSize\" value=\"\" />\r\n");
        out.write("\t\t<span id=\"bookUrlLayer\"><font color=\"#FF0000\">*</font>支持字符串格式，例：2.56M，128K等</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>书籍类型：</td>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t<select id=\"bookType\" name=\"bookType\">\r\n");
        out.write("\t\t\t<option value=\"图书\">图书</option>\r\n");
        out.write("\t\t\t<option value=\"杂志\">杂志</option>\r\n");
        out.write("\t\t\t<option value=\"连载\">连载</option>\r\n");
        out.write("\t\t\t<option value=\"女生\">女生</option>\r\n");
        out.write("\t\t\t<option value=\"男生\">男生</option>\r\n");
        out.write("\t\t\t<option value=\"其它\">其它</option>\r\n");
        out.write("\t\t</select>\r\n");
        out.write("\t\t<span id=\"bookTypeLayer\"><font color=\"#FF0000\">*</font>书籍类型用于对书籍快速分类</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>封面图片：</td>\r\n");
        out.write("\t\t<td><input type=\"file\" id=\"bookImageUrl\" name=\"bookImageUrl\" size=\"60\" onkeydown='return   false'  onpaste='return   false'  ondragenter='return   false'/>\r\n");
        out.write("\t\t<span id=\"bookImageUrlLayer\"><font color=\"#FF0000\">*</font>支持jpg，png格式，建议图片小于200K,大小110*154</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>描述：</td>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t<textarea rows=\"5\" cols=\"60\" id=\"bookDescription\" name=\"bookDescription\"></textarea>\r\n");
        out.write("\t\t<span id=\"bookDescriptionLayer\"><font color=\"#FF0000\">*</font>不超过1000个字节，一个汉字为2个字节(汉字，数字，字母和下划线)</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("</table>\r\n");
        int evalDoAfterBody = _jspx_th_s_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f4 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f4.setParent(null);
    // /WEB-INF/controller/woshare/pushtask/add.jsp(515,0) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f4.setTest("#request.type==3");
    int _jspx_eval_s_005fif_005f4 = _jspx_th_s_005fif_005f4.doStartTag();
    if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("<table width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td colspan=\"2\" class=\"thead\">\r\n");
        out.write(" <div class=\"tit_box\">添加微博</div>\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td style=\"width:120px; word-break:break-all\">微博作者：</td>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t<input type=\"text\" id=\"weiboName\" name=\"weiboName\" value=\"\" />\r\n");
        out.write("\t\t<span id=\"weiboNameLayer\"><font color=\"#FF0000\">*</font>不超过50个汉字，或100个字节(汉字，数字，字母和下划线)</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>微博类型：</td>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t<select id=\"weiboType\" name=\"weiboType\">\r\n");
        out.write("\t\t\t<option value=\"热门\">热门</option>\r\n");
        out.write("\t\t\t<option value=\"名人\">名人</option>\r\n");
        out.write("\t\t\t<option value=\"官方\">官方</option>\r\n");
        out.write("\t\t\t<option value=\"注册\">注册</option>\r\n");
        out.write("\t\t\t<option value=\"其它\">其它</option>\r\n");
        out.write("\t\t</select>\r\n");
        out.write("\t\t<span id=\"weiboTypeLayer\"><font color=\"#FF0000\">*</font>微博类型用于对微博快速分类</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>链接：</td>\r\n");
        out.write("\t\t<td><input type=\"text\" id=\"weiboUrl\" name=\"weiboUrl\" value=\"\" />\r\n");
        out.write("\t\t<span id=\"weiboUrlLayer\"><font color=\"#FF0000\">*</font>微博的链接地址</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>微博头像：</td>\r\n");
        out.write("\t\t<td><input type=\"file\" id=\"weiboImageUrl\" name=\"weiboImageUrl\" size=\"60\" onkeydown='return   false'  onpaste='return   false'  ondragenter='return   false'  />\r\n");
        out.write("\t\t<span id=\"weiboImageUrlLayer\"><font color=\"#FF0000\">*</font>支持jpg，png，jpeg格式，建议图片小于200K，大小72*72</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>内容：</td>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t<textarea rows=\"5\" cols=\"60\" id=\"weiboContent\" name=\"weiboContent\"></textarea>\r\n");
        out.write("\t\t<span id=\"weiboContentLayer\"><font color=\"#FF0000\">*</font>不超过140个字符(汉字，数字，字母和下划线)</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("</table>\r\n");
        int evalDoAfterBody = _jspx_th_s_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f5 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f5.setParent(null);
    // /WEB-INF/controller/woshare/pushtask/add.jsp(564,0) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f5.setTest("#request.type==4");
    int _jspx_eval_s_005fif_005f5 = _jspx_th_s_005fif_005f5.doStartTag();
    if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f5.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("<table width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td colspan=\"2\" class=\"thead\">\r\n");
        out.write(" <div class=\"tit_box\">添加客户端升级任务</div>\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td style=\"width:120px; word-break:break-all\">软件名称：</td>\r\n");
        out.write("\t\t<td><input type=\"text\" id=\"upSoftName\" name=\"upSoftName\" value=\"\" />\r\n");
        out.write("\t\t<span id=\"upSoftNameLayer\"><font color=\"#FF0000\">*</font>不超过50个汉字，或100个字节(汉字，数字，字母和下划线)</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>下载地址：</td>\r\n");
        out.write("\t\t<td><input type=\"file\" id=\"downUrl\" name=\"downUrl\" size=\"60\" onkeydown='return   false'  onpaste='return   false'  ondragenter='return   false' />\r\n");
        out.write("\t\t<span id=\"downUrlLayer\"><font color=\"#FF0000\">*</font>客户端新版本的下载地址</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>版本号：</td>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t<select id=\"upVersionA\" name=\"upVersionA\">\r\n");
        out.write("\t\t");
        if (_jspx_meth_s_005fiterator_005f0(_jspx_th_s_005fif_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t</select>\r\n");
        out.write("\t\t.\r\n");
        out.write("\t\t<select id=\"upVersionB\" name=\"upVersionB\">\r\n");
        out.write("\t\t");
        if (_jspx_meth_s_005fiterator_005f1(_jspx_th_s_005fif_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t</select>\r\n");
        out.write("\t\t.\r\n");
        out.write("\t\t<select id=\"upVersionC\" name=\"upVersionC\">\r\n");
        out.write("\t\t");
        if (_jspx_meth_s_005fiterator_005f2(_jspx_th_s_005fif_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t</select>\r\n");
        out.write("\t\t.\r\n");
        out.write("\t\t<select id=\"upVersionD\" name=\"upVersionD\">\r\n");
        out.write("\t\t");
        if (_jspx_meth_s_005fiterator_005f3(_jspx_th_s_005fif_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t</select>\r\n");
        out.write("\t\t<input type=\"hidden\" id=\"upVersion\" name=\"upVersion\" value=\"\" />\r\n");
        out.write("\t\t<span id=\"upVersionLayer\"><font color=\"#FF0000\">*</font>支持字符串格式，如:1.0.0.0,9.9.9.9等</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<input type=\"hidden\" id=\"isup\" name=\"isup\" value=\"0\" />\r\n");
        out.write("\t<!-- \r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>是否强制升级：</td>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t<select name=\"isup\">\r\n");
        out.write("\t\t\t<option value=\"0\">否</option>\r\n");
        out.write("\t\t</select>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t -->\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>描述：</td>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t<textarea rows=\"5\" cols=\"60\" id=\"upDescription\" name=\"upDescription\"></textarea>\r\n");
        out.write("\t\t<span id=\"upDescriptionLayer\"><font color=\"#FF0000\">*</font>不超过1000个字节，一个汉字为2个字节(汉字，数字，字母和下划线)</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("</table>\r\n");
        int evalDoAfterBody = _jspx_th_s_005fif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f0 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f5);
    // /WEB-INF/controller/woshare/pushtask/add.jsp(589,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setValue("{'1','2','3','4','5','6','7','8','9'}");
    // /WEB-INF/controller/woshare/pushtask/add.jsp(589,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setId("number");
    int _jspx_eval_s_005fiterator_005f0 = _jspx_th_s_005fiterator_005f0.doStartTag();
    if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f0.doInitBody();
      }
      do {
        out.write(" \t\t\t\r\n");
        out.write("\t\t\t<option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${number}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${number}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</option>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f1 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f5);
    // /WEB-INF/controller/woshare/pushtask/add.jsp(595,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f1.setValue("{'0','1','2','3','4','5','6','7','8','9'}");
    // /WEB-INF/controller/woshare/pushtask/add.jsp(595,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f1.setId("number");
    int _jspx_eval_s_005fiterator_005f1 = _jspx_th_s_005fiterator_005f1.doStartTag();
    if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f1.doInitBody();
      }
      do {
        out.write(" \t\t\t\r\n");
        out.write("\t\t\t<option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${number}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${number}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</option>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f2 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f5);
    // /WEB-INF/controller/woshare/pushtask/add.jsp(601,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f2.setValue("{'0','1','2','3','4','5','6','7','8','9'}");
    // /WEB-INF/controller/woshare/pushtask/add.jsp(601,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f2.setId("number");
    int _jspx_eval_s_005fiterator_005f2 = _jspx_th_s_005fiterator_005f2.doStartTag();
    if (_jspx_eval_s_005fiterator_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f2.doInitBody();
      }
      do {
        out.write(" \t\t\t\r\n");
        out.write("\t\t\t<option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${number}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${number}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</option>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f3 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f5);
    // /WEB-INF/controller/woshare/pushtask/add.jsp(607,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f3.setValue("{'0','1','2','3','4','5','6','7','8','9'}");
    // /WEB-INF/controller/woshare/pushtask/add.jsp(607,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f3.setId("number");
    int _jspx_eval_s_005fiterator_005f3 = _jspx_th_s_005fiterator_005f3.doStartTag();
    if (_jspx_eval_s_005fiterator_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f3.doInitBody();
      }
      do {
        out.write(" \t\t\t\r\n");
        out.write("\t\t\t<option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${number}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${number}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</option>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f6 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f6.setParent(null);
    // /WEB-INF/controller/woshare/pushtask/add.jsp(636,0) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f6.setTest("#request.type==5");
    int _jspx_eval_s_005fif_005f6 = _jspx_th_s_005fif_005f6.doStartTag();
    if (_jspx_eval_s_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f6.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("<table width=\"90%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td colspan=\"2\" class=\"thead\">\r\n");
        out.write(" <div class=\"tit_box\">添加广告任务</div>\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td style=\"width:120px; word-break:break-all\">标题：</td>\r\n");
        out.write("\t\t<td><input type=\"text\" id=\"adTitle\" name=\"adTitle\" value=\"\" />\r\n");
        out.write("\t\t<span id=\"adTitleLayer\"><font color=\"#FF0000\">*</font>不超过50个汉字，或100个字节(汉字，数字，字母和下划线)</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>广告链接地址：</td>\r\n");
        out.write("\t\t<td><input type=\"text\" id=\"adUrl\" name=\"adUrl\" value=\"\" />\r\n");
        out.write("\t\t<span id=\"adUrlLayer\"><font color=\"#FF0000\">*</font>广告的链接地址</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>广告图片：</td>\r\n");
        out.write("\t\t<td><input type=\"file\" id=\"adImageUrl\" name=\"adImageUrl\" size=\"60\" onkeydown='return   false'  onpaste='return   false'  ondragenter='return   false' />\r\n");
        out.write("\t\t<span id=\"adImageUrlLayer\"><font color=\"#FF0000\">*</font>支持jpg，png格式，建议图片小于200K，大小614*164</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>描述：</td>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t<textarea rows=\"5\" cols=\"60\" id=\"adDescription\" name=\"adDescription\"></textarea>\r\n");
        out.write("\t\t<span id=\"adDescriptionLayer\"><font color=\"#FF0000\">*</font>不超过1000个字节，一个汉字为2个字节(汉字，数字，字母和下划线)</span>\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("</table>\r\n");
        int evalDoAfterBody = _jspx_th_s_005fif_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f6);
    return false;
  }
}
