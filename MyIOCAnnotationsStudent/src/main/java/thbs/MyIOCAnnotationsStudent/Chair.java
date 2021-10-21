package thbs.MyIOCAnnotationsStudent;

import org.springframework.stereotype.Component;

@Component("chair")
public class Chair {
	private String colour;
	private String type;
	
	public Chair() {
		super();
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Chair [colour=" + colour + ", type=" + type + "]";
	}
	
	
	

}
