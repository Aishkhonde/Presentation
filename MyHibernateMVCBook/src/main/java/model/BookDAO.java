package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class BookDAO {
	
	HibernateTemplate template;  
	


	public HibernateTemplate getTemplate() {
		return template;
	}
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	//method to save employee  
	public void saveBook(Book b){  
	    template.save(b);  
	}  
	//method to update employee  
	public void updateEmployee(Book b){  
	    template.update(b);  
	}  
	//method to delete employee  
	public void deleteEmployee(Book b){  
	    template.delete(b);  
	}  
	//method to return one employee of given id  
	public Book getById(int id){  
	    Book b=(Book)template.get(Book.class,id);  
	    return b;  
	}  
	//method to return all Books  
	public List<Book> getBooks(){  
	    List<Book> list=new ArrayList<Book>();  
	    list=template.loadAll(Book.class);  
	    return list;  
	}  
	
	
	}  
	
