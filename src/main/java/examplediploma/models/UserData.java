package examplediploma.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class UserData {
	
	private int id;
	private String name;
	private String lastName;
	private String email;
	private Date dob;
	private List<TourData> tours;
	private String password;
	private String role;
	private BigDecimal money;
	
	public UserData(int id, String name, String lastName, String email) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
	}

	public UserData() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<TourData> getTours() {
		return tours;
	}
	public void setTours(List<TourData> tours) {
		this.tours = tours;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", lastName=" + lastName + ", dob=" + dob + ", tours=" + tours + "]";
	}
	
	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public BigDecimal getMoney() {
		return this.money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	

}
