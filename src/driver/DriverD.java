package driver;

import transport.Bus;

public class DriverD extends Driver<Bus>{

    public DriverD(String fullName, String driverLicence, Bus car) {
        super(fullName, driverLicence, "D", car);
    }
}
