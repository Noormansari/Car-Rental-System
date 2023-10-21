package com.Car_Rental_System;

public class Main {

	public static void main(String[] args) {

		Car_Rental_System c = new Car_Rental_System();

		Car car1 = new Car("COO1", "Toyota", "Camry", 60.0);
		Car car2 = new Car("COO2", "Honda", "Accord", 70.0);
		Car car3 = new Car("COO3", "Mahindra", "Thar", 150.0);

		c.addCar(car1);
		c.addCar(car2);
		c.addCar(car3);

		c.menu();
	}

}
