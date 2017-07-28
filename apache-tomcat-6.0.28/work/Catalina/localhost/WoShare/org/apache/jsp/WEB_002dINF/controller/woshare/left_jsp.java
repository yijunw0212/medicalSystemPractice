package org.apache.jsp.WEB_002dINF.controller.woshare;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class left_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    <title>后台操作首页</title>\r\n");
      out.write("\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t\r\n");
      out.write("   <style type=\"text/css\">\r\n");
      out.write("    body{  overflow-x : hidden ;font-size:12px; font-family:\"宋体\";  margin:0; padding:0}\r\n");
      out.write("    \r\n");
      out.write("\timg{border:0}\r\n");
      out.write("\t\r\n");
      out.write("\tul,li{margin:0; padding:0; float:left; list-style:none; list-style-type:none}\r\n");
      out.write("\t\r\n");
      out.write("\t#content_box{padding:10px; width:186px; clear:both}\r\n");
      out.write("\t\r\n");
      out.write("\t#content_box .left_bg{width:184px; background-color:#E6E6E6; padding:0 3px 3px 0}\r\n");
      out.write("\t\r\n");
      out.write("\t#content_box .left_box{width:182px; background-color:#F0F2F3; border:1px solid #D6D6D6}\r\n");
      out.write("\r\n");
      out.write("\t.one_m_over{background:url(images/one_m_over.jpg); width:220px; padding-left:34px; height:32px; line-height:32px; display:block; font-size:14px; color:#004D91; font-weight:bold; clear:both; text-decoration:none}\r\n");
      out.write("\t.one_m_over:hover{background:url(images/one_m_bg.jpg); width:220px; padding-left:34px; height:32px; line-height:32px; display:block; font-size:14px; color:#004D91; font-weight:bold; clear:both; text-decoration:none}\r\n");
      out.write("\t.one_m_out{background:url(images/one_m_bg.jpg); width:220px; padding-left:34px; height:32px; line-height:32px; display:block; font-size:14px; color:#454545; font-weight:bold; clear:both; text-decoration:none}\r\n");
      out.write("\t.one_m_out:hover{background:url(images/one_m_over.jpg); width:220px; padding-left:34px; height:32px; line-height:32px; display:block; font-size:14px; color:#004D91; font-weight:bold; clear:both; text-decoration:none}\r\n");
      out.write("\t#content_box .left_box ul{width:202px}\r\n");
      out.write("\t#content_box .left_box li{width:202px; height:28px; padding:1px 0; clear:both}\r\n");
      out.write("\t.tow_m_over{background:url(images/two_m_over.jpg); width:168px; padding-left:34px; height:28px; line-height:28px; display:block; font-size:14px; color:#069DBF; font-weight:bold; clear:both; text-decoration:none}\r\n");
      out.write("\t.tow_m_over:hover{background:url(images/two_m_over.jpg); width:168px; padding-left:34px; height:28px; line-height:28px; display:block; font-size:14px; color:#069DBF; font-weight:bold; clear:both; text-decoration:none}\r\n");
      out.write("\t.tow_m_out{background:url(images/two_m_bg.jpg); width:168px; padding-left:34px; height:28px; line-height:28px; display:block; font-size:14px; color:#454545; clear:both; text-decoration:none}\r\n");
      out.write("\t.tow_m_out:hover{background:url(images/two_m_over.jpg); width:168px; padding-left:34px; height:28px; line-height:28px; display:block; font-size:14px; color:#069DBF; clear:both; text-decoration:none}\r\n");
      out.write("   </style>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/base.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tfunction viewChild(str){\r\n");
      out.write("\t\tvar styleValue=document.getElementById(str).style.display;\r\n");
      out.write("\t\tif(styleValue==\"\"){\r\n");
      out.write("\t\t\tdocument.getElementById(str).style.display=\"none\";\r\n");
      out.write("\t\t}else if (styleValue==\"none\"){\r\n");
      out.write("\t\t\tdocument.getElementById(str).style.display=\"\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("<div id=\"content_box\">\r\n");
      out.write("  <div class=\"left_bg\">\r\n");
      out.write("    <div class=\"left_box\">\r\n");
      out.write("    \t<!-- \r\n");
      out.write("      <a href=\"javascript:onClick=viewChild('child_1')\" class=\"one_m_out\">系统消息管理</a>\r\n");
      out.write("      <ul id=\"child_1\" style=\"display:none\">\r\n");
      out.write("        <li><a href=\"task/SendTaskAction_taskUrl.action?type=0\" class=\"tow_m_out\" target=\"main\">添加系统消息</a></li>\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_showTask.action?type=0&what=0\" class=\"tow_m_out\" target=\"main\">系统消息列表</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("       -->\r\n");
      out.write("      <a href=\"javascript:onClick=viewChild('child_2')\" class=\"one_m_out\">软件推送管理</a>\r\n");
      out.write("      <ul id=\"child_2\" style=\"display:none\">\r\n");
      out.write("     \t<li><a href=\"task/SendTaskAction_taskUrl.action?type=1\" class=\"tow_m_out\" target=\"main\">添加软件推送任务</a></li>\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_showTask.action?type=1&what=0\" class=\"tow_m_out\" target=\"main\">软件推送任务列表</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <a href=\"javascript:onClick=viewChild('child_3')\" class=\"one_m_out\">书籍推送任务管理</a>\r\n");
      out.write("      <ul id=\"child_3\" style=\"display:none\">\r\n");
      out.write("        <li><a href=\"task/SendTaskAction_taskUrl.action?type=2\" class=\"tow_m_out\" target=\"main\">添加书籍推送任务</a></li>\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_showTask.action?type=2&what=0\" class=\"tow_m_out\" target=\"main\">书籍推送任务列表</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <a href=\"javascript:onClick=viewChild('child_4')\" class=\"one_m_out\">微博推送任务管理</a>\r\n");
      out.write("      <ul id=\"child_4\" style=\"display:none\">\r\n");
      out.write("        <li><a href=\"task/SendTaskAction_taskUrl.action?type=3\" class=\"tow_m_out\" target=\"main\">添加微博推送任务</a></li>\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_showTask.action?type=3&what=0\" class=\"tow_m_out\" target=\"main\">微博推送任务列表</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <a href=\"javascript:onClick=viewChild('child_5')\" class=\"one_m_out\">客户端升级任务管理</a>\r\n");
      out.write("      <ul id=\"child_5\" style=\"display:none\">\r\n");
      out.write("        <li><a href=\"task/SendTaskAction_taskUrl.action?type=4\" class=\"tow_m_out\" target=\"main\">添加客户端升级任务</a></li>\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_showTask.action?type=4&what=0\" class=\"tow_m_out\" target=\"main\">客户端升级任务列表</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <a href=\"javascript:onClick=viewChild('child_6')\" class=\"one_m_out\">广告推送任务管理</a>\r\n");
      out.write("      <ul id=\"child_6\" style=\"display:none\">\r\n");
      out.write("        <li><a href=\"task/SendTaskAction_taskUrl.action?type=5\" class=\"tow_m_out\" target=\"main\">添加广告推送任务</a></li>\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_showTask.action?type=5&what=0\" class=\"tow_m_out\" target=\"main\">广告推送任务列表</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <a href=\"javascript:onClick=viewChild('child_7')\" class=\"one_m_out\">推送任务审核</a>\r\n");
      out.write("      <ul id=\"child_7\" style=\"display:none\">\r\n");
      out.write("        <!--\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_showTask.action?type=0&what=1\" class=\"tow_m_out\" target=\"main\">审核系统消息</a></li>\r\n");
      out.write("        -->\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_showTask.action?type=1&what=1\" class=\"tow_m_out\" target=\"main\">审核软件任务</a></li>\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_showTask.action?type=2&what=1\" class=\"tow_m_out\" target=\"main\">审核书籍任务</a></li>\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_showTask.action?type=3&what=1\" class=\"tow_m_out\" target=\"main\">审核微博任务</a></li>\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_showTask.action?type=4&what=1\" class=\"tow_m_out\" target=\"main\">审核客户端升级任务</a></li>\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_showTask.action?type=5&what=1\" class=\"tow_m_out\" target=\"main\">审核广告任务</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <a href=\"javascript:onClick=viewChild('child_8')\" class=\"one_m_out\">审核通过的任务</a>\r\n");
      out.write("      <ul id=\"child_8\" style=\"display:none\">\r\n");
      out.write("        <!--\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_taskSearch.action?type=0&status=1&what=2\" class=\"tow_m_out\" target=\"main\">通过系统消息</a></li>\r\n");
      out.write("        -->\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_taskSearch.action?type=1&status=1&what=2\" class=\"tow_m_out\" target=\"main\">通过软件任务</a></li>\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_taskSearch.action?type=2&status=1&what=2\" class=\"tow_m_out\" target=\"main\">通过书籍任务</a></li>\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_taskSearch.action?type=3&status=1&what=2\" class=\"tow_m_out\" target=\"main\">通过微博任务</a></li>\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_taskSearch.action?type=4&status=1&what=2\" class=\"tow_m_out\" target=\"main\">通过客户端升级任务</a></li>\r\n");
      out.write("        <li><a href=\"task/SendTaskShowAction_taskSearch.action?type=5&status=1&what=2\" class=\"tow_m_out\" target=\"main\">通过广告任务</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <a href=\"javascript:onClick=viewChild('child_9')\" class=\"one_m_out\">其他辅助</a>\r\n");
      out.write("      <ul id=\"child_9\" style=\"display:none\">\r\n");
      out.write("      \t<li><a href=\"task/SendTaskAction_searchUrl.action\" class=\"tow_m_out\" target=\"main\">推送任务查询</a></li>\r\n");
      out.write("        <li><a href=\"phone/PhoneRegisterAction_searchUrl.action\" class=\"tow_m_out\" target=\"main\">移动终端注册信息</a></li>\r\n");
      out.write("        <li><a href=\"phone/UserFeedbackInfoAction_search.action\" class=\"tow_m_out\" target=\"main\">用户反馈信息</a></li>\r\n");
      out.write("        <!-- \r\n");
      out.write("        <li><a href=\"task/SendTaskAction_sendSocket.action\" class=\"tow_m_out\" target=\"main\">文件同步</a></li>\r\n");
      out.write("         -->\r\n");
      out.write("      </ul>\r\n");
      out.write("      <a href=\"javascript:onClick=viewChild('child_11')\" class=\"one_m_out\">LBS投诉信息</a>\r\n");
      out.write("      <ul id=\"child_11\" style=\"display:none\">\r\n");
      out.write("      \t<li><a href=\"user/ChargeInfoAction_returnUrl.action?returnUrl=searchUrl\" class=\"tow_m_out\" target=\"main\">投诉信息搜索</a></li>\r\n");
      out.write("      \t<li><a href=\"user/ChargeManagerAction_returnUrl.action?returnUrl=typeAddUrl\" class=\"tow_m_out\" target=\"main\">投诉类型添加</a></li>\r\n");
      out.write("        <li><a href=\"user/ChargeManagerAction_typeList.action?chargeManager.parentid=-1\" class=\"tow_m_out\" target=\"main\">投诉类型列表</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <a href=\"javascript:onClick=viewChild('child_10')\" class=\"one_m_out\">用户管理</a>\r\n");
      out.write("      <ul id=\"child_10\" style=\"display:none\">\r\n");
      out.write("\t\t<li><a href=\"user/UserInfoAction_addUrl.action\" class=\"tow_m_out\" target=\"main\">添加用户</a></li>\r\n");
      out.write("        <li><a href=\"user/UserInfoAction_userList.action\" class=\"tow_m_out\" target=\"main\">用户列表</a></li>\r\n");
      out.write("        <li><a href=\"user/UserInfoAction_showUserInfo.action\" class=\"tow_m_out\" target=\"main\">查看本用户信息</a></li>\r\n");
      out.write("        <li><a href=\"user/UserInfoAction_updateUrl.action\" class=\"tow_m_out\" target=\"main\">修改密码</a></li>\r\n");
      out.write("        <li><a href=\"user/UserInfoAction_loginOut.action\" class=\"tow_m_out\" target=\"_top\">重新登录</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("  </body>\r\n");
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
