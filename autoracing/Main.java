package autoracing;

import autoracing.driver.*;
import autoracing.mechanic.Mechanic;
import autoracing.mechanic.MechanicList;
import autoracing.serviceStation.ServiceStation;
import autoracing.sponsor.Sponsor;
import autoracing.sponsor.SponsorsList;
import autoracing.transport.*;

import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Car audi = new Car(
                "Audi",
                "A8",
                3.0f,
                BodyType.SEDAN);
        audi.addDriver(new DriverB("driver1", 10,audi));
        audi.addSponsor(new Sponsor("sponsor1", 10_000f));
        audi.addMechanic(new Mechanic("mechanic1", "company1"));

        audi.printType();

        Truck kamaz = new Truck(
                "KAMAZ",
                "4911-EXTREME",
                17.2f,
                LoadType.N3);
        kamaz.addDriver(new DriverC ("driver2", 10,kamaz));
        kamaz.addSponsor(new Sponsor ("sponsor2", 15_000f));
        kamaz.addMechanic(new Mechanic("mechanic2", "company2"));

        kamaz.printType();

        Bus peugeot = new Bus(
                "Peugeot",
                "806",
                2.0f,
                CapacityType.ESPECIALLY_SMALL);
        peugeot.addDriver(new DriverD("driver3", 10,peugeot));
        peugeot.addSponsor(new Sponsor("sponsor3", 10_000f));
        peugeot.addMechanic(new Mechanic("mechanic3", "company3"));

        peugeot.printType();

        Sponsor sponsor1 = new Sponsor("sponsor1", 10_000f);
        Sponsor sponsor2 = new Sponsor("sponsor2", 15_000f);
        Sponsor sponsor3 = new Sponsor("sponsor3", 10_000f);

        SponsorsList sponsorsList = new SponsorsList();
        sponsorsList.add(sponsor1);
        sponsorsList.add(sponsor2);
        sponsorsList.add(sponsor3);

        DriverB driverB = new DriverB("Driver A", 5, audi);
        DriverC driverC = new DriverC("Driver B", 7, kamaz);
        DriverD driverD = new DriverD("Driver C", 5, peugeot);

        DriverList driverList = new DriverList();
        driverList.add(driverB);
        driverList.add(driverC);
        driverList.add(driverD);

        Mechanic mechanic1 = new Mechanic("mechanic1", "company1");
        Mechanic mechanic2 = new Mechanic("mechanic2", "company2");
        Mechanic mechanic3 = new Mechanic("mechanic3", "company3");

        MechanicList mechanicList = new MechanicList();
        mechanicList.add(mechanic1);
        mechanicList.add(mechanic2);
        mechanicList.add(mechanic3);


        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(audi);
        serviceStation.addTruck(kamaz);
        serviceStation.service();
        serviceStation.service();

        Set <Transport> transports =Set.of(audi,kamaz,peugeot);
        for (Transport transport:transports) {
            printInfo(transport);
        }

        try {
            audi.passDiagnostics();
        }catch (DiagnosticsException e) {
            System.out.println("Транспортное средство не прошло диагностику: " + e.getMessage());
        }
        try {
            kamaz.passDiagnostics();
        }catch (DiagnosticsException e) {
            System.out.println("Транспортное средство не прошло диагностику: " + e.getMessage());
        }
        try {
            peugeot.passDiagnostics();
        }catch (DiagnosticsException e) {
            System.out.println("Транспортное средство не прошло диагностику: " + e.getMessage());
        }

    }
    public static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю "
                + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Механики: " + transport.getMechanics());
        System.out.println("Спонсоры: " + transport.getSponsors());
        System.out.println();
    }

}
