package org.example.sem2_dz;

public class Car {
    private Engine engine = Engine.R_4;
    private Color bodyColor = Color.WHITE;
    private Interior interior = Interior.BASIC;
    private int wheelRadius = 16;
    private Multimedia multimedia = Multimedia.AUDIO_20_USB;

    public Car() {
    }

    public Car(Engine engine, Color bodyColor, Interior interior, int wheelRadius, Multimedia multimedia) {
        this.engine = engine;
        this.bodyColor = bodyColor;
        this.interior = interior;
        this.wheelRadius = wheelRadius;
        this.multimedia = multimedia;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Color getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(Color bodyColor) {
        this.bodyColor = bodyColor;
    }

    public Interior getInterior() {
        return interior;
    }

    public void setInterior(Interior interior) {
        this.interior = interior;
    }

    public int getWheelRadius() {
        return wheelRadius;
    }

    public void setWheelRadius(int wheelRadius) {
        this.wheelRadius = wheelRadius;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", bodyColor=" + bodyColor +
                ", interior=" + interior +
                ", wheelRadius=" + wheelRadius +
                ", multimedia=" + multimedia +
                '}';
    }
}
