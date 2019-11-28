package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Book;
import com.ustglobal.springcore.di.Hello;

public class BookApp {
	
	public static void main(String[] args) {
		
	       ApplicationContext  context = new ClassPathXmlApplicationContext("book.xml");
	       Book book = context.getBean(Book.class);
	       System.out.println(book.getName());
	       System.out.println(book.getAuthor().getPenName());
	       System.out.println(book.getAuthor().getName());
	      
	}

}
