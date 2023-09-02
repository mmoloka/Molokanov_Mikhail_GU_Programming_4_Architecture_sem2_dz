package org.example.sem2_dz;

public class Program {
    public static void main(String[] args) {
        CarConstructor constructor1 = new CarConstructor();
        CarConstructor constructor2 = new CarConstructor();
        CarConstructor constructor3 = new CarConstructor();

        CarBuilder carOfClient1 = new CarOfClient1();
        CarBuilder carOfClient2 = new CarOfClient2();
        CarBuilder carOfClient3 = new CarOfClient3();

        constructor1.setCarBuilder(carOfClient1);
        constructor1.constructCar();
        Car car1 = constructor1.getCar();

        constructor2.setCarBuilder(carOfClient2);
        constructor2.constructCar();
        Car car2 = constructor2.getCar();

        constructor3.setCarBuilder(carOfClient3);
        constructor3.constructCar();
        Car car3 = constructor3.getCar();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
