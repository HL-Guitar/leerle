/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-11-09 04:33:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.commons;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/base-v1.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<!--shortcut start-->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "shortcut.jsp", out, false);
      out.write("\r\n");
      out.write("<!--shortcut end-->\r\n");
      out.write("<div id=\"o-header-2013\">\r\n");
      out.write("\t<div class=\"w\" id=\"header-2013\">\r\n");
      out.write("\t\t<div id=\"logo-2013\" class=\"ld\"><a href=\"/\" hidefocus=\"true\" clstag=\"homepage|keycount|home2013|02a\"><b></b><img src=\"/images/taotao-logo.gif\" width=\"270\" height=\"60\" alt=\"淘淘\"></a></div>\r\n");
      out.write("\t\t<!--logo end-->\r\n");
      out.write("\t\t<div id=\"search-2013\">\r\n");
      out.write("\t\t\t<div class=\"i-search ld\">\r\n");
      out.write("\t\t\t\t<ul id=\"shelper\" class=\"hide\">\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div class=\"form\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"text\" accesskey=\"s\" id=\"key\" autocomplete=\"off\" onkeydown=\"javascript:if(event.keyCode==13) search('key');\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"搜索\" class=\"button\" onclick=\"search('key');return false;\" clstag=\"homepage|keycount|home2013|03a\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"hotwords\" clstag=\"homepage|keycount|home2013|03b\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--search end-->\r\n");
      out.write("\t\t<div id=\"my360buy-2013\">\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt class=\"ld\"><s></s><a href=\"http://localhost:8084/page/login\" clstag=\"homepage|keycount|home2012|04a\">我的淘淘</a><b></b></dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<div class=\"loading-style1\"><b></b>加载中，请稍候...</div>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--my360buy end-->\r\n");
      out.write("\t\t<div id=\"settleup-2013\" clstag=\"homepage|keycount|home2013|05a\">\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt class=\"ld\"><s></s><span class=\"shopping\"><span id=\"shopping-amount\"></span></span><a href=\"/cart/cart.html\" id=\"settleup-url\">去购物车结算</a> <b></b> </dt>\r\n");
      out.write("<!-- \t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<div class=\"prompt\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"loading-style1\"><b></b>加载中，请稍候...</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write(" -->\t\t\t</dl>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--settleup end-->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--header end-->\r\n");
      out.write("\t<div class=\"w\">\r\n");
      out.write("\t\t<div id=\"nav-2013\">\r\n");
      out.write("\t\t\t<div id=\"categorys-2013\" class=\"categorys-2014\">\r\n");
      out.write("\t\t\t\t<div class=\"mt ld\">\r\n");
      out.write("\t\t\t\t\t<h2><a href=\"http://www.jd.com/allSort.aspx\" clstag=\"homepage|keycount|home2013|06a\">全部商品分类<b></b></a></h2>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"_JD_ALLSORT\" class=\"mc\">\r\n");
      out.write("\t\t\t\t\t<div class=\"item fore1\">\r\n");
      out.write("\t\t\t\t\t\t<span data-split=\"1\"><h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/products/1.html\">图书、音像、电子书刊</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<s></s></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item fore2\">\r\n");
      out.write("\t\t\t\t\t\t<span data-split=\"1\"><h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/products/74.html\">家用电器</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<s></s></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item fore3\">\r\n");
      out.write("\t\t\t\t\t\t<span data-split=\"1\"><h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/products/161.html\">电脑、办公</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<s></s></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item fore4\">\r\n");
      out.write("\t\t\t\t\t\t<span data-split=\"1\"><h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/products/249.html\">个护化妆</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<s></s></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item fore5\">\r\n");
      out.write("\t\t\t\t\t\t<span data-split=\"1\"><h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/products/290.html\">钟表</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<s></s></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item fore6\">\r\n");
      out.write("\t\t\t\t\t\t<span data-split=\"1\"><h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/products/296.html\">母婴</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<s></s></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item fore7\">\r\n");
      out.write("\t\t\t\t\t\t<span data-split=\"1\"><h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/products/378.html\">食品饮料、保健食品</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<s></s></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item fore8\">\r\n");
      out.write("\t\t\t\t\t\t<span data-split=\"1\"><h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/products/438.html\">汽车用品</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<s></s></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item fore9\">\r\n");
      out.write("\t\t\t\t\t\t<span data-split=\"1\"><h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/products/495.html\">玩具乐器</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<s></s></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item fore10\">\r\n");
      out.write("\t\t\t\t\t\t<span data-split=\"1\"><h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/products/558.html\">手机</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<s></s></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item fore11\">\r\n");
      out.write("\t\t\t\t\t\t<span data-split=\"1\"><h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/products/580.html\">数码</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<s></s></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item fore12\">\r\n");
      out.write("\t\t\t\t\t\t<span data-split=\"1\"><h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/products/633.html\">家居家装</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<s></s></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item fore13\">\r\n");
      out.write("\t\t\t\t\t\t<span data-split=\"1\"><h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/products/699.html\">厨具</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<s></s></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item fore14\">\r\n");
      out.write("\t\t\t\t\t\t<span data-split=\"1\"><h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/products/749.html\">服饰内衣</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<s></s></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"extra\">\r\n");
      out.write("\t\t\t\t\t\t<a {if=\"\" pageconfig.ishome}clstag=\"homepage|keycount|home2013|0614a\"\r\n");
      out.write("\t\t\t\t\t\t\t{=\"\" if}=\"\" href=\"http://www.jd.com/allSort.aspx\">全部商品分类</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"treasure\" clstag=\"homepage|keycount|home2013|08a\"></div>\r\n");
      out.write("\t\t\t\t<ul id=\"navitems-2013\">\r\n");
      out.write("\t\t\t\t\t<li class=\"fore1\" id=\"nav-home\" clstag=\"homepage|keycount|home2013|07a\"><a href=\"/\">首页</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"fore2\" id=\"nav-fashion\" clstag=\"homepage|keycount|home2013|07b\"><a href=\"http://fashion.jd.com/\">服装城</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"fore3\" id=\"nav-chaoshi\" clstag=\"homepage|keycount|home2013|07c\"><a href=\"http://channel.jd.com/chaoshi.html\">食品</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"fore4\" id=\"nav-tuan\" clstag=\"homepage|keycount|home2013|07d\"><a href=\"http://tuan.jd.com/\" target=\"_blank\">团购</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"fore5\" id=\"nav-auction\" clstag=\"homepage|keycount|home2013|07e\"><a href=\"http://auction.jd.com/\">夺宝岛</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"fore6\" id=\"nav-shan\" clstag=\"homepage|keycount|home2013|07f\"><a href=\"http://red.jd.com/\" target=\"_blank\">闪购</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"fore7\" id=\"nav-jinrong\" clstag=\"homepage|keycount|home2013|07g1\"><a href=\"http://jr.jd.com/\" target=\"_blank\">金融</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("(function(){if(pageConfig.navId){var object=document.getElementById(\"nav-\"+pageConfig.navId);if(object)object.className+=\" curr\";}})();\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
