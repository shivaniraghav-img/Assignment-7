package com.example.Hibernatedemo;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Agent {

	@Id
	private int id;
	
	private String name;
	private String city;
	private int commission_amount;
	
	
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Agent(int id, String name, String city, int commission_amount) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.commission_amount = commission_amount;
	}

	@Override
	public String toString() {
		return "Agent [id=" + id + ", name=" + name + ", city=" + city + ", commission_amount=" + commission_amount
				+ "]";
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCommission_amount() {
		return commission_amount;
	}
	public void setCommission_amount(int commission_amount) {
		this.commission_amount = commission_amount;
	}
}
