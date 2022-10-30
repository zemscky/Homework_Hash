package autoracing;

import autoracing.driver.DriverB;
import autoracing.driver.DriverC;
import autoracing.driver.DriverD;
import autoracing.transport.*;


public class Main {
    public static void main(String[] args) {

        Car audi = new Car(
                "Audi",
                "A8",
                3.0f,
                BodyType.SEDAN,
                new DriverB(
                        "Driver A",
                        5,
                        new Car())
                );

        audi.printType();


        DriverB driverB = new DriverB(
                "Driver A",
                5,
                audi);
        System.out.println(driverB);

        Truck kamaz = new Truck(
                "KAMAZ",
                "4911-EXTREME",
                17.2f,
                LoadType.N3);

        kamaz.printType();



        DriverC driverC = new DriverC(
                "Driver B",
                7,
                kamaz);
        System.out.println(driverC);

        Bus peugeot = new Bus(
                "Peugeot",
                "806",
                2.0f,
                CapacityType.ESPECIALLY_SMALL);

        peugeot.printType();



        DriverD driverD = new DriverD(
                "Driver C",
                5,
                peugeot);
        System.out.println(driverD);


    }
    public static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю "
                + transport.getBrand() + " " + transport.getModel());

    }

}
