package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
		ArrayList<Car> list = new ArrayList<>();
		list.add(new Car("porche", "blue", 70));
		list.add(new Car("Jeep", "orange", 30));
		list.add(new Car("Toyota Camri", "brown", 100));

		for (Car c : list) {
			c.start();
			c.accelerate();
			c.newSpeed();
			c.crash();
			c.paint();
			System.out.println();
		}
    }
}
