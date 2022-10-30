package autoracing.driver;

import autoracing.transport.Transport;

public abstract class Driver <T extends Transport> {

    private final String fullName;
    private final String category;
    private final int drivingExperience;
    private final T car;

    protected Driver(
            String fullName,
            String category,
            int drivingExperience,
            T car
    ) {
        this.fullName = fullName;
        this.category = category;
        this.drivingExperience = drivingExperience;
        this.car = car;
    }

    public void startMovement() {
        System.out.printf("Водитель %s завел машину", this.fullName);
        this.car.startMovement();
    }

    public void stopMovement() {
        System.out.printf("Водитель %s заглушил машину", this.fullName);
        this.car.stopMovement();
    }

    public void refill() {
        System.out.printf("Водитель %s заправляет машину %s %s",
                this.fullName,
                this.car.getBrand(),
                this.car.getModel());
    }

    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public static void printInfo(Driver<?> driver, Transport transport) {
        transport.printType();
    }

    @Override
    public String toString() {
        return fullName + ", стаж водителя: " + drivingExperience + " лет, категория прав: "
                + category;

    }
}
