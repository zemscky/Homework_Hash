package autoracing.transport;


import autoracing.driver.Driver;
import autoracing.mechanic.Mechanic;
import autoracing.sponsor.Sponsor;

import java.util.HashSet;
import java.util.Set;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final float engineVolume;

    private final Driver driver;
    private final Set<Mechanic> mechanics;
    private final Set<Sponsor> sponsors;

    public Transport(
            String brand,
            String model,
            float engineVolume,
            Driver driver) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.driver = driver;
        mechanics = new HashSet<>();
        sponsors = new HashSet<>();
    }


    public abstract void startMovement();

    public abstract void stopMovement();

    public abstract boolean passDiagnostics();
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public abstract void printType();

    public abstract void repair();

    public void printPersonInfo() {
        System.out.println("Водитель: " +driver.getFullName());
        for (Sponsor sponsor : sponsors) {
            System.out.println(sponsor);
        }
        for (Mechanic mechanic : mechanics) {
            System.out.println(mechanic);
        }
    }

}
