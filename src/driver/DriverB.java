package driver;
import transport.Car;

public class DriverB extends Driver<Car> {
    public DriverB(String fullName, String driverLicence , Car car) {
        super(fullName, driverLicence, "B", car);
    }
}
