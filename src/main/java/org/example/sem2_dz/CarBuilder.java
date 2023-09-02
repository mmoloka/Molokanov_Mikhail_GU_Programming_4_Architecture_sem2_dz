package org.example.sem2_dz;

public abstract class CarBuilder {
    protected Car car;

    public Car getCar() {
        return car;
    }

    public void buildNewCar() {
        car = new Car();
    }

    public abstract void installEngine();

    public abstract void paintBody();

    public abstract void installInterior();

    public abstract void installWheels();

    public abstract void installMultimedia();
}
