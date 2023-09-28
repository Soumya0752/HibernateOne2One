package com.example1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="addresses")
public class Address 
{
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name="address_id")
     private int id;
	 @Column(name="street")
     private String street;
     
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address(int id, String street, User user) {
		super();
		this.id = id;
		this.street = street;
		this.user = user;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	} 
     
}
