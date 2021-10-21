package thbs.MyIOCAnnotationsStudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	private String id;
	private String name;
	private Chair chair;
	private Address address;
	
	@Autowired
	public Student(Chair chair, Address address) {
		super();
		this.chair = chair;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Chair getChair() {
		return chair;
	}

	public void setChair(Chair chair) {
		this.chair = chair;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", chair=" + chair + ", address=" + address + "]";
	}
	
	
	
	

}
