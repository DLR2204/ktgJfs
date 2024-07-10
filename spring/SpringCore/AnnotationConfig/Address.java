package demo;

import org.springframework.stereotype.Component;

@Component("add")
public class Address {
	
	int hno;
	
	String colony;
	
	int pin;
	
	String state;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", colony=" + colony + ", pin=" + pin + ", state=" + state + "]";
	}

	public Address(int hno, String colony, int pin, String state) {
		super();
		this.hno = hno;
		this.colony = colony;
		this.pin = pin;
		this.state = state;
	}
	

}
