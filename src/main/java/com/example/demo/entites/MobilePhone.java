package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MobilePhone {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int mobileId;
	private String brandName;
	private String modelName;
	private String color;
	private String batteryPower;
	private String processor;
	private double mobilePhoneCost;
	public Integer getMobileId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getBatteryPower() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setBatteryPower(Object batteryPower2) {
		// TODO Auto-generated method stub
		
	}
	public Object getBrandName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setBrandName(Object brandName2) {
		// TODO Auto-generated method stub
		
	}
	public Object getColor() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setColor(Object color2) {
		// TODO Auto-generated method stub
		
	}
	public Object getMobilePhoneCost() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setMobilePhoneCost(Object mobilePhoneCost2) {
		// TODO Auto-generated method stub
		
	}
	public Object getModelName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setModelName(Object modelName2) {
		// TODO Auto-generated method stub
		
	}
	public Object getProcessor() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setProcessor(Object processor2) {
		// TODO Auto-generated method stub
		
	}
}
