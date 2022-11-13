package autoracing.transport;

import autoracing.BodyType;
import autoracing.driver.Driver;
import autoracing.driver.DriverB;
import autoracing.mechanic.Mechanic;
import autoracing.sponsor.Sponsor;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Car  extends Transport implements Competing {
    private BodyType bodyType;

    public Car(
            String brand,
            String model,
            float engineVolume,
            BodyType bodyType
    ) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void startMovement() {
        System.out.printf("Машина %s %s начала движение",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void stopMovement() {
        System.out.printf("Машина  %s %s остановилась",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public boolean passDiagnostics() {
        if (ThreadLocalRandom.current().nextBoolean()) {
            throw new  DiagnosticsException(
                    "Машина " + getBrand() + " " + getModel() + " не прошла диагностику");
        }
        return false;
    }
    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " починена");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по типу кузова нет");
        } else {
            System.out.printf("У машины %s %s тип кузова - %s\n", this.getBrand(),this.getModel(),this.bodyType);
        }
    }

    @Override
    public void pitStop() {
        System.out.printf("Машина %s %s совершила пит-стоп",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 400);
    }
}
