package autoracing.driver;

import autoracing.transport.Truck;

public class DriverC extends Driver<Truck> {
    public DriverC(String fullName, int drivingExperience, Truck truck) {
        super(fullName, "C", drivingExperience, truck);
    }
}
