package NuclearWeapons;

import NuclearWeapons.Atomic;

public class NW_type extends Atomic {
    public NW_type() {
    }

    public NW_type(double weight, double price, int range, String country, int power, String type, String energySource, String serialNumber) {
        super(weight, price, range, country, power, type, energySource,  serialNumber);
    }
}