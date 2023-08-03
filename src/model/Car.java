package model;

import javax.xml.stream.events.StartDocument;
import java.util.Objects;

public class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String startEngine() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "the car is accelerating.";
    }

    public String brake() {
        System.out.println("Class Name: " +  getClass().getSimpleName());
        return "the car is braking.";
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n");
        builder.append("Cylinders: " + cylinders + "\n");
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return ((Car) o).cylinders == this.cylinders && ((Car) o).name.equals(this.name);
        //Car car = (Car) o;
        //return cylinders == car.cylinders && Objects.equals(name, car.name);
    }
}
