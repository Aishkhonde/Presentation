package thbs.MyIOCAnnotationDemo;

import org.springframework.stereotype.Component;

@Component("address")
public class Address {
	
	private String doorNo;
	private String street;
	private String state;
	private String pin;
	
	public Address() {
		super();
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", state=" + state + ", pin=" + pin + "]";
	}
	
	


}
