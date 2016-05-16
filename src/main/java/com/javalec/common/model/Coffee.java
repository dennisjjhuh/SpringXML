package com.javalec.common.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="coffee")
public class Coffee {
	
	private String name;
	private int quantity;
	
	public Coffee() {
	}
	
	public Coffee(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	@XmlElement
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
