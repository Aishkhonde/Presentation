package com.thbs.repository;

import java.util.ArrayList;
import java.util.List;

import com.thbs.model.Book;

public class BookRepository {
	List<Book> blist;
	public BookRepository()
	{
		blist=new ArrayList<Book>();
		Book b1=new Book();
		b1.setBookId(100);
		b1.setBookName("Java");
		b1.setBookPrice(300);
		
		Book b2=new Book();
		b2.setBookId(101);
		b2.setBookName("HTML");
		b2.setBookPrice(400);
		
		Book b3=new Book();
		b3.setBookId(102);
		b3.setBookName("Spring");
		b3.setBookPrice(600);
		
		blist.add(b1);
		blist.add(b2);
		blist.add(b3);
	}
	public List<Book> getAllBooks()
	{
		return blist;
	}
	public Book getABook(int bookId)
	{
		for(Book b:blist)
		{
			if(b.getBookId()==bookId)
				return b;
		}
		return null;
	}
	
		
	
	

}
