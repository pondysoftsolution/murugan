package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="citizen")
public class Citizen {

	private int pan;
	private String name;
	private double amount;
	private String rangeId;
	
	@Id
	@GeneratedValue
	public int getPan() {
		return pan;
	}

	public void setPan(int pan) {
		this.pan = pan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getRangeId() {
		return rangeId;
	}

	public void setRangeId(String rangeId) {
		this.rangeId = rangeId;
	}

	@Override
	public String toString() {
		return "Citizen [pan=" + pan + ", name=" + name + ", amount=" + amount + ", rangeId=" + rangeId + ", getPan()="
				+ getPan() + ", getName()=" + getName() + ", getAmount()=" + getAmount() + ", getRangeId()="
				+ getRangeId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
