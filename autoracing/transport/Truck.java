package autoracing.transport;

import autoracing.LoadType;
import autoracing.driver.Driver;
import autoracing.driver.DriverC;
import autoracing.mechanic.Mechanic;
import autoracing.sponsor.Sponsor;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing{

    private LoadType loadType;

    public Truck(
            String brand,
            String model,
            float engineVolume,
            LoadType loadType
    ) {
        super(brand, model, engineVolume);
        this.loadType = loadType;
    }

    public LoadType getLoadType() {
        return loadType;
    }

    public void setLoadType(LoadType loadType) {
        this.loadType = loadType;
    }

    @Override
    public void startMovement() {
        System.out.printf("Грузовая машина %s %s начала движение",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void stopMovement() {
        System.out.printf("Грузовая машина %s %s остановилась",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public boolean passDiagnostics() {
        if (ThreadLocalRandom.current().nextBoolean()) {
            throw new  DiagnosticsException(
                    "Грузовая машина " + getBrand() + " " + getModel() + " не прошел диагностику");
        }
        return false;
    }

    @Override
    public void pitStop() {
        System.out.printf("Грузовая машина %s %s совершила пит-стоп",
                this.getBrand(),
                this.getModel());
    }

    public void printType() {
        if (loadType == null) {
            System.out.println("Данных по грузоподъемности нет");
        } else {
            String from = loadType.getLoadFrom() == null ? "" : "от " + loadType.getLoadFrom();
            String to = loadType.getLoadTo() == null ? "" : "до " + loadType.getLoadTo();
            System.out.printf("У грузовой машины %s %s грузоподъемность от %s до %s\n",
                    this.getBrand(),this.getModel(),this.loadType.getLoadFrom(),this.loadType.getLoadTo());
        }
    }

    @Override
    public void repair() {
        System.out.println("Грузовая машина " + getBrand() + " " + getModel() + " починена");
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 250);
    }
}
