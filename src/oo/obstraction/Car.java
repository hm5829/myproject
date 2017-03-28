package oo.obstraction;

public class Car {
	int id;
	String brand;
	String name;
	int cc;
	String type;
	int status;
	float milage;
	
	public Car(String brand, String name, int cc){
		this.brand = brand;
		this.name = name;
		this.cc = cc;
	}
	public void setMilage(int m){
		milage = milage + m;
	}
	public float addMilage(int m){
		milage = milage + m;
		return milage;
	}
}
