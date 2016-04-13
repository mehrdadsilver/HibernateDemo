package org.mehrdad;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value="Bike")
public class TwoWheelVeichle extends Veichle {

	private String WheelHandle;
	
	public String getWheelHandle() {
		return WheelHandle;
	}

	public void setWheelHandle(String wheelHandle) {
		WheelHandle = wheelHandle;
	}

	public TwoWheelVeichle(String model, String manufacture, String cNumber, int irNUmber) {
		super(model, manufacture, cNumber, irNUmber);
		// TODO Auto-generated constructor stub
	}

	

}
