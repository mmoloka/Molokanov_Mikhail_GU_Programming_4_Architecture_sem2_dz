package org.example.sem2_dz;

public class CarConstructor {
    private CarBuilder builder;

    public void setCarBuilder(CarBuilder carBuilder) {
        builder = carBuilder;
    }

    public Car getCar() {
        return builder.getCar();
    }

    public void constructCar() {
        builder.buildNewCar();
        builder.installEngine();
        builder.paintBody();
        builder.installInterior();
        builder.installWheels();
        builder.installMultimedia();
    }

}
