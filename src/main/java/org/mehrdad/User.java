package org.mehrdad;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@NamedQuery(name = "User.finaHame", query = "select lastName from User")
@Table(name="User")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userID;
	
	private String firstName;
	private String lastName;
	
	@Min(18)
	@Max(120)
	private int age;

	@OneToMany(cascade=CascadeType.ALL, mappedBy="user")
//	@JoinTable(name="USER_VEICHLE", joinColumns=@JoinColumn(name="USER_ID"),
//	inverseJoinColumns=@JoinColumn(name="VIECHLE_ID")
//			)
	
	//@ManyToMany(cascade=CascadeType.ALL)
	private List<Veichle> veichle = new ArrayList<Veichle>();
	
	

	public List<Veichle> getVeichle() {
		return veichle;
	}

	public void setVeichle(List<Veichle> veichle) {
		this.veichle = veichle;
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
