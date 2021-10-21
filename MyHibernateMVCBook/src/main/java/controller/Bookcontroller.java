package controller;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Book;

import model.BookDAO;



@Controller
public class Bookcontroller {
	@Autowired
	BookDAO dao;

	@RequestMapping(value="/DisplayBooks",method = RequestMethod.GET)
	public ModelAndView getAllProducts(){
		
		
        // AnnotationConfigApplicationContext  applicationcontext =  new AnnotationConfigApplicationContext();
    	
    	//applicationcontext.scan("model");
    	//applicationcontext.refresh(); 
		
		ArrayList<Book> barr = (ArrayList<Book>) dao.getBooks();
		ModelAndView model = new ModelAndView("DisplayBooks");
		
		model.addObject("barr",(ArrayList<Book>)barr);
		
		return model;
	}

}
