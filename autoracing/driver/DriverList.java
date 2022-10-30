package autoracing.driver;
import product.Product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DriverList {
    private final Set<Driver> drivers = new HashSet<>();

    public void addDrive(Driver driver){
        if (driver == null){
            return;
        }
        if(this.drivers.contains(drivers)) {
            throw new IllegalArgumentException();
        }else {
            this.drivers.add(driver);
        }
    }

    public void removeDriver(String fullName) {
        Iterator<Driver> driverIterator = this.drivers.iterator();
        while (driverIterator.hasNext()){
            if (driverIterator.next().getFullName().equals(fullName)) {
                driverIterator.remove();
                break;
            }
        }
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
