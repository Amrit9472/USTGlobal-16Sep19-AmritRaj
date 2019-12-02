package com.ustglobal.springmvcassis.dao;

import java.util.List;

import com.ustglobal.springmvcassis.bean.OrderProduct;
import com.ustglobal.springmvcassis.bean.Product;
import com.ustglobal.springmvcassis.bean.User;

public interface ProductDAO {
	public User login(String email,String password);
	public boolean register(User user);
	public Product search(String pname);
	public boolean updatePassword(String email,String password);
	public List<OrderProduct> getProducts(String email);
	public boolean buyProduct(OrderProduct orderProduct);
}
