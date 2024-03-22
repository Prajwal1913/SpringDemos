package com.voya.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
Integer vehicleId;
String model;
String brand;
double price;
Engine engine;



public Engine getEngine() {
	return engine;
}

@Autowired
public void setEngine(Engine engine) {
	this.engine = engine;
}


public Integer getVehicleId() {
	return vehicleId;
}
@Value("${vehicle.vehicleId}")
public void setVehicleId(Integer vehicleId) {
	this.vehicleId = vehicleId;
}
public String getModel() {
	return model;
}
@Value("${vehicle.model}")
public void setModel(String model) {
	this.model = model;
}
public String getBrand() {
	return brand;
}
@Value("${vehicle.brand}")
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
@Value("${vehicle.price}")
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Vehicle [vehicleId=" + vehicleId + ", model=" + model + ", brand=" + brand + ", price=" + price
			+ ", engine=" + engine + "]";
}

}
