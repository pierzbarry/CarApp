package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	// create arraylist of class Car named list
		ArrayList<Car> list = new ArrayList<>();
		Scanner key = new Scanner(System.in);

		// boolean for do-while loop
		boolean yes = true;

		// initialize new car
		Car car = new Car();

		//【☆】★【☆】★【☆】★【☆】★【☆】
		System.out.println("|▓▓▓【☆】▓▓▓| Car Simulator |▓▓▓【☆】▓▓▓|");

		do {
			System.out.print("ミ☆ Enter desired car name: ");
			car.setName(key.nextLine());
			System.out.println();

			System.out.print("ミ★ Enter a color for your new " + car.getName() + ": ");
			car.setColor(key.nextLine());
			System.out.println();

			if (car.getColor().matches("(?i)yellow|blue|green|purple")) {
				System.out.println("ミ☆ You chose " + car.getColor() + "? ... gross.");
			} else {
				System.out.println("ミ☆ You chose " + car.getColor() + "? What a lovely color!");
			}

			System.out.print("ミ★ Now enter the speed you want your car to start off at: ");
			car.setSpeed(key.nextInt());
			System.out.println();

			list.add(car);

			for (Car c : list) {
				c.start();
				c.accelerate();
				c.newSpeed();
				c.crash();
				c.paint();
				System.out.println();
			}

			System.out.println("ミ☆ What an exciting experience!!!!! omg !!!");
			System.out.println("ミ★ Do you want to attempt another simulation? (Y/N)");

			// eats up the "enter" so that the if statement doesn't count it as part of the answer

			key.nextLine();
			if (key.next().equalsIgnoreCase("n") || key.next().equalsIgnoreCase("No")) {
				yes = false;
			}

		// 	while/if yes = true; then repeat, otherwise terminate!
		} while (yes);
    } // closing main method
} // closing main class
