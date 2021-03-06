package com.amaker.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.amaker.dao.ShopDao;
import com.amaker.dao.UserDao;
import com.amaker.entity.CheckTable;
import com.amaker.entity.Shop;
import com.amaker.entity.User;
import com.amaker.util.DBUtil;
public class ShopDaoImpl implements ShopDao {
	
	@Override
	public List getShop() {
		// 查询SQL语句
				String sql = " select id,name,type,money,zhicheng"+
								" from shop ";
				// 数据库连接工具类
				DBUtil util = new DBUtil();
				// 获得连接
				Connection conn = util.openConnection();
				try {
					// 获得预定义语句
					Statement pstmt = conn.createStatement();
					ResultSet rs = pstmt.executeQuery(sql);
					List list = new ArrayList();
					// 判断用户是否存在
					while (rs.next()) {
						Shop ct = new Shop();
						ct.setName(rs.getString(2));
						ct.setType(rs.getString(3));
						ct.setMoney(rs.getString(4));
						ct.setZhicheng(rs.getString(5));
						list.add(ct);
					}
					return list;
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					util.closeConn(conn);
				}
				return null;
	}

}
