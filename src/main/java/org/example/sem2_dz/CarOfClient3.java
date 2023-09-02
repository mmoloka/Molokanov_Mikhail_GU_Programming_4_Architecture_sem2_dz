package org.example.sem2_dz;

public class CarOfClient3 extends CarBuilder {
    @Override
    public void installEngine() {
        car.setEngine(Engine.V_8_AMG);
    }

    @Override
    public void paintBody() {
        car.setBodyColor(Color.RED);
    }

    @Override
    public void installInterior() {
        car.setInterior(Interior.AMG);
    }

    @Override
    public void installWheels() {
        car.setWheelRadius(20);
    }

    @Override
    public void installMultimedia() {
        car.setMultimedia(Multimedia.HIGH_END_3D);
    }
}
