package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.PrintWriter;

public final class getUserRecomment_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');



PrintWriter w=response.getWriter();



w.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
w.write("<result>");
   w.write("<status>1</status>");
   w.write("<data>");
      w.write("<list>");
    w.write(" <item>");
          w.write("  <uuid>1</uuid>");
           w.write(" <iconURL>http://192.168.1.68/wanwei/image/h_user_icon_default.png</iconURL>");
           w.write(" <name>11111</name>");
           w.write(" <baId>2222222222222</baId>");
          w.write("  <baName>3333333333333</baName>");
         w.write("   <content>推荐内容1推荐内容1推荐内容1推荐内容1推荐内容1</content>");
          w.write("  <createdTime>推荐时间</createdTime>");
       w.write("  </item>");
       w.write("  <item>");
         w.write("   <uuid>1</uuid>");
        w.write("    <iconURL>http://192.168.1.68/wanwei/image/h_user_icon.png</iconURL>");
        w.write("    <name>用户名称</name>");
        w.write("    <baId>被推荐的商家或活动id</baId>");
        w.write("    <baName>被推荐的商家或活动名称</baName>");
       w.write("     <content>推荐内容2推荐内容2推荐内容2推荐内容2推荐内容2推荐内容2</content>");
      w.write("      <createdTime>推荐时间</createdTime>");
     w.write("    </item>");
      w.write("   <item>");
        w.write("    <uuid>1</uuid>");
       w.write("     <iconURL>http://192.168.1.68/wanwei/image/h_user_icon_default.png</iconURL>");
       w.write("     <name>用户名称</name>");
      w.write("      <baId>被推荐的商家或活动id</baId>");
    w.write("        <baName>被推荐的商家或活动名称</baName>");
      w.write("      <content>推荐内容3推荐内容3推荐内容3推荐内容3推荐内容3推荐内容3推荐内容3</content>");
      w.write("      <createdTime>推荐时间</createdTime>");
       w.write("  </item>");
 

    w.write("  </list>");
  w.write(" </data>");
w.write("</result>");



w.flush();
w.close();

 
      out.write('\r');
      out.write('\n');
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
