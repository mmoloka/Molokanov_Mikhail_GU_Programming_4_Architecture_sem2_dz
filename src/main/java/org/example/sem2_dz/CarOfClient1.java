package org.example.sem2_dz;

public class CarOfClient1 extends CarBuilder {
    @Override
    public void installEngine() {
        car.setEngine(Engine.V_6);
    }

    @Override
    public void paintBody() {
        car.setBodyColor(Color.METALLIC);
    }

    @Override
    public void installInterior() {
        car.setInterior(Interior.ARTICO);
    }

    @Override
    public void installWheels() {
        car.setWheelRadius(18);
    }

    @Override
    public void installMultimedia() {
        car.setMultimedia(Multimedia.AUDIO_20_CD);
    }
}
