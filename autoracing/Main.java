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

        audi.printType();

        Truck kamaz = new Truck(
                "KAMAZ",
                "4911-EXTREME",
                17.2f,
                LoadType.N3);

        kamaz.printType();

        Bus peugeot = new Bus(
                "Peugeot",
                "806",
                2.0f,
                CapacityType.ESPECIALLY_SMALL);

        peugeot.printType();


        Sponsor xbet = new Sponsor("1XBET", 50_000);
        Sponsor ligastavok = new Sponsor("Лига ставок", 100_000);

        SponsorsList sponsorsList = new SponsorsList();
        sponsorsList.add(xbet);
        sponsorsList.add(ligastavok);

        Mechanic ivanov = new Mechanic(
                "Иванов И.И.",
                "Форсаж");
        Mechanic petrov = new Mechanic(
                "Петров А.А.",
                "Молния");
        Mechanic orlov = new Mechanic(
                "Орлов И.А.",
                "Орел");

        MechanicList mechanicList = new MechanicList();
        mechanicList.add(ivanov);
        mechanicList.add(petrov);
        mechanicList.add(orlov);

        DriverB driverB = new DriverB("Driver A", 5, audi);
        DriverC driverC = new DriverC("Driver B", 7, kamaz);
        DriverD driverD = new DriverD("Driver C", 5, peugeot);

        DriverList driverList = new DriverList();
        driverList.add(driverB);
        driverList.add(driverC);
        driverList.add(driverD);

        audi.addDriver(driverB);
        kamaz.addDriver(driverC);
        peugeot.addDriver(driverD);

        audi.addMechanic(ivanov);
        kamaz.addMechanic(petrov);
        peugeot.addMechanic(orlov);

        audi.addSponsor(xbet);
        kamaz.addSponsor(xbet, ligastavok);
        peugeot.addSponsor(ligastavok);

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
