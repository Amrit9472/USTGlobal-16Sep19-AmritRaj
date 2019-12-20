package com.stockmanagement.stock.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.stockmanagement.stock.dto.CartPro;
import com.stockmanagement.stock.dto.OrderInfo;
import com.stockmanagement.stock.dto.ProductInfo;

@Repository
public class StockDAOImpl implements IStockDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	EntityManager manager = null;
	EntityTransaction transaction =null;
	 
	
	@Override
	public boolean addProduct(ProductInfo bean) {
		 manager = factory.createEntityManager();
		 transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateProductInfo(int id, String name, String category, String company, int quantity, double price) {
		 manager = factory.createEntityManager();
		 transaction = manager.getTransaction();
		try {
			transaction.commit();
			ProductInfo info = manager.find(ProductInfo.class, id);
			info.setName(name);
			info.setCategory(category);
			info.setCompany(company);
			info.setQuantity(quantity);
			info.setPrice(price);
			manager.persist(info);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public List<ProductInfo> findByName(String name) {
		manager = factory.createEntityManager();
		String jpql = "from ProductInfo where name=:name";
		TypedQuery<ProductInfo> query =  manager.createQuery(jpql, ProductInfo.class);
		query.setParameter("name", name);
		List<ProductInfo> ls = query.getResultList();
		return ls;
	}

	@Override
	public List<ProductInfo> findByCompany(String comp) {
		manager = factory.createEntityManager();
		String jpql = "from ProductInfo where company=:comp";
		TypedQuery<ProductInfo> query =  manager.createQuery(jpql, ProductInfo.class);
		query.setParameter("company", comp);
		List<ProductInfo> ls = query.getResultList();
		return ls;
	}

	@Override
	public List<ProductInfo> findByCategory(String category) {
		manager = factory.createEntityManager();
		String jpql = "from ProductInfo where category=:category";
		TypedQuery<ProductInfo> query =  manager.createQuery(jpql, ProductInfo.class);
		query.setParameter("category", category);
		List<ProductInfo> ls = query.getResultList();
		return ls;
	}

	@Override
	public boolean addToCart(int pid) {
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		try {
			transaction.begin();
			ProductInfo info = manager.find(ProductInfo.class, pid);
			info.setQuantity(info.getQuantity()-1);
			OrderInfo order = new OrderInfo();
			order.setProduct(Arrays.asList(info));
			manager.persist(order);
			CartPro cart = new CartPro();
			cart.setProd(info);
			cart.setPrice(info.getPrice());
			manager.persist(cart);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean totalBill() {
		double price = 0.0;
		manager = factory.createEntityManager();
		String jpql = "from CartPro";
		TypedQuery<CartPro> query = manager.createQuery(jpql, CartPro.class);
		List<CartPro> ls = query.getResultList();
		
		for(CartPro c : ls) {
			price = price + c.getPrice();
		}
		OrderInfo order = new OrderInfo();
		order.setTotal_price(price);
		manager.persist(order);
			return true;
	}
}
