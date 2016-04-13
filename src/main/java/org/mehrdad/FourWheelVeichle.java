package org.mehrdad;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("Car")
public class FourWheelVeichle extends Veichle {

	private String SteeringWheel;
	
	public String getSteeringWheel() {
		return SteeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		SteeringWheel = steeringWheel;
	}

	public FourWheelVeichle(String model, String manufacture, String cNumber, int irNUmber) {
		super(model, manufacture, cNumber, irNUmber);
		// TODO Auto-generated constructor stub
	}

	
	
}
