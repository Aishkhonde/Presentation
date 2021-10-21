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

import model.Trains;
import model.TrainDAO;
@Controller
public class Traincontroller {
	@Autowired
	TrainDAO dao;

	@RequestMapping(value="/DisplayTrains",method = RequestMethod.GET)
	public ModelAndView getAllProducts(){
		
		
        // AnnotationConfigApplicationContext  applicationcontext =  new AnnotationConfigApplicationContext();
    	
    	//applicationcontext.scan("model");
    	//applicationcontext.refresh(); 
		
		ArrayList<Trains> barr = (ArrayList<Trains>) dao.getTrains();
		ModelAndView model = new ModelAndView("DisplayTrains");
		
		model.addObject("barr",(ArrayList<Trains>)barr);
		
		return model;
	}

}
