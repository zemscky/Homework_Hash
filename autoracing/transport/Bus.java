package autoracing.transport;

import autoracing.CapacityType;
import autoracing.driver.DriverD;
import autoracing.mechanic.Mechanic;
import autoracing.sponsor.Sponsor;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing{

    private CapacityType capacityType;
    public Bus(
            String brand,
            String model,
            float engineVolume,
            CapacityType capacityType,
            DriverD driverD,
            Set<Mechanic> mechanics,
            Set<Sponsor> sponsors
    ) {
        super(brand, model, engineVolume, driverD);
        this.capacityType = capacityType;
    }

    public CapacityType getCapacityType() {
        return capacityType;
    }

    public void setCapacityType(CapacityType capacityType) {
        this.capacityType = capacityType;
    }

    @Override
    public void startMovement() {
        System.out.printf("Автобус %s %s начал движение",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void stopMovement() {
        System.out.printf("Автобус %s %s остановился",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println(
                "Автобус " + getBrand() + " " + getModel() + " в диагностике не нуждается");
        return false;
    }

    @Override
    public void pitStop() {
        System.out.printf("Автобус %s %s совершил пит-стоп",
                this.getBrand(),
                this.getModel());
    }

    public void printType() {
        if (capacityType == null) {
            System.out.println("Данных по грузоподъемности нет");
        } else {
            System.out.printf("У автобуса %s %s вместимость от %s до %s мест\n",
                    this.getBrand(),this.getModel(),this.capacityType.getCapacityFrom(),this.capacityType.getCapacityTo());
        }
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " починен");
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 150);
    }


}
