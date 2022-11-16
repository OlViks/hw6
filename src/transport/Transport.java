package transport;

import driver.Driver;
import driver.DriverD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final float volumeEngine;
    private List<Driver<?>> drivers = new ArrayList<>();
    private List<Mechanic<?>> mechanics = new ArrayList<>();
    private List<Sponsor> sponsors = new ArrayList<>();

    public Transport(String brand,
                     String model,
                     float volumeEngine) {

        this.brand = brand;
        this.model = model;
        this.volumeEngine = volumeEngine;
    }


    public abstract void startMovement();

    public abstract void stopMovement();

    public abstract void printInformation();

    public abstract boolean service();

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public float getVolumeEngine() {
        return volumeEngine;

    }

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public abstract void repair();

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }
}
