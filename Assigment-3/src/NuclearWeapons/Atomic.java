package NuclearWeapons;

import NuclearWeapons.Nuclear;

public class Atomic extends Nuclear {
    public String energySource;//Uran235, Uran238, Uran234
    public Atomic(){}
    public Atomic(double weight, double price, int range, String country, int power, String type, String energySource, String serialNumber){
        super(weight, price, range, country, power, type,  serialNumber);
        this.energySource =energySource;
    }

    public void setEnergySource(String energySource) {
        this.energySource = energySource;
    }

    public String getEnergySource() {
        return energySource;
    }
}
