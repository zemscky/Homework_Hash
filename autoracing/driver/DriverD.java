package autoracing.driver;

import autoracing.transport.Bus;

public class DriverD extends Driver<Bus> {
    public DriverD(String fullName, int drivingExperience, Bus bus) {
        super(fullName, "D", drivingExperience, bus);
    }
}
