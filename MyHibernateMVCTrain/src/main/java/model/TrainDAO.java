package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class TrainDAO {
	
	HibernateTemplate template;  
	


	public HibernateTemplate getTemplate() {
		return template;
	}
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	//method to save employee  
	public void saveTrain(Trains b){  
	    template.save(b);  
	}  
	//method to update employee  
	public void updateEmployee(Trains b){  
	    template.update(b);  
	}  
	//method to delete employee  
	public void deleteEmployee(Trains b){  
	    template.delete(b);  
	}  
	//method to return one employee of given id  
	public Trains getById(int id){  
	    Trains b=(Trains)template.get(Trains.class,id);  
	    return b;  
	}  
	//method to return all Books  
	public List<Trains> getTrains(){  
	    List<Trains> list=new ArrayList<Trains>();  
	    list=template.loadAll(Trains.class);  
	    return list;  
	}  
	
	
	}  
	
