package com.company;

public class Vehicle {
    private String name;
    private String color;
    private int speed;

    public Vehicle() {
    }

    public void start() {
        System.out.println("The " + color + " " + name + "'s engine has been started.");
    }

    public void accelerate() {
        System.out.println("The " + color + " " + name + " sped off into the sunset at " + speed + " mph!");
    }

    public void newSpeed() {
        speed = 90;
        System.out.println("The " + color + " " + name + "'s speed has reached " + speed + "!");
    }

    public void crash() {
        speed = 0;
        System.out.println("Oh no! The " + name + " crashed into a wall!" + " Now it's speed is " + speed);
    }

    public void paint() {
        System.out.print("The " + color + name + " decided to get repainted!");
        color = "black";
        System.out.println(" Now it's a sick " + color + " " + name + "!");
    }

    public Vehicle(String name, String color, int speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
