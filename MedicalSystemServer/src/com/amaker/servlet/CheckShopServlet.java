package com.amaker.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.amaker.dao.CheckTableDao;
import com.amaker.dao.UserDao;
import com.amaker.dao.impl.CheckTableDaoImpl;
import com.amaker.dao.impl.ShopDaoImpl;
import com.amaker.dao.impl.UserDaoImpl;
import com.amaker.entity.User;
/**
 * ��Ӧ Android�ͻ��˷���������
 */
public class CheckShopServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/json");
		PrintWriter out = response.getWriter();
		// ʵ����CheckTableDao
		ShopDaoImpl dao = new ShopDaoImpl();
		// ��ò�����Ϣ�б�
		List list = dao.getShop();
		// ת��Ϊ�ַ���
		String msg = buildJson(list);
		// ���ظ��ͻ���
		out.print(msg);
		out.flush();
		out.close();
	}
	
	
	private String buildJson(List list)
	{
		JSONObject person = new JSONObject(); 
		JSONArray array = new JSONArray();
		for(Object o :list)
		{
			JSONObject obj = new JSONObject();
			obj.put("shop", JSONObject.fromObject(o));
			array.add(obj);
		}
		person.put("shoplist", array);
		return person.toString();
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}
	public void init() throws ServletException {
	}
	
	public CheckShopServlet() {
		super();
	}

	public void destroy() {
		super.destroy();
	}

}
