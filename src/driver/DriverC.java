package driver;

import transport.Truck;

public class DriverC extends Driver<Truck>{
    public DriverC(String fullName, String driverLicence, Truck car) {
        super(fullName, driverLicence, "C", car);
    }
}
