package autoracing.transport;


import autoracing.driver.Driver;
import autoracing.mechanic.Mechanic;
import autoracing.sponsor.Sponsor;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final float engineVolume;

    private final Set<Driver> drivers = new HashSet<>();
    private final Set<Mechanic> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();

    public Transport(
            String brand,
            String model,
            float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }
    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Set.of(drivers));
    }
    public void addMechanic(Mechanic... mechanics) {
        this.mechanics.addAll(Set.of(mechanics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Set.of(sponsors));
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

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }


}
