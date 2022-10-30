package autoracing.driver;

import java.util.HashSet;
import java.util.Set;

public class DriverList {
    private final Set<Driver> drivers = new HashSet<>();

    public void add(Driver driver) {
        this.drivers.add(driver);
    }

    public Driver findByName(String name, String category, int drivingExperience) {
        for (Driver driver : drivers) {
            if (driver.getFullName() == name
                    && driver.getCategory() == category
                    && driver.getDrivingExperience() == drivingExperience
                    ){
                return driver;
            }
        }
        return null;
    }
}
