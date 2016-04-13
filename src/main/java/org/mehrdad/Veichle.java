package org.mehrdad;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="Veichle")
@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name="Veichle_Type",
//discriminatorType=DiscriminatorType.STRING
//		)
public class Veichle {


	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long veichleID;
	
	private String model;
	private String manufacture;
	
	@ManyToOne
	//@JoinColumn(name="USER_ID")
	//@ManyToMany(mappedBy="veichle")
	private User user ;//= new ArrayList<>();
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Veichle(String model, String manufacture, String cNumber, int irNUmber) {
		super();
		this.model = model;
		this.manufacture = manufacture;
		this.cNumber = cNumber;
		this.irNUmber = irNUmber;
	}

	public long getVeichleID() {
		return veichleID;
	}

	public void setVeichleID(long veichleID) {
		this.veichleID = veichleID;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getcNumber() {
		return cNumber;
	}

	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}

	public int getIrNUmber() {
		return irNUmber;
	}

	public void setIrNUmber(int irNUmber) {
		this.irNUmber = irNUmber;
	}

	private String cNumber;
	
	@Min(1)
	@Max(99)
	private int irNUmber;
	
}
