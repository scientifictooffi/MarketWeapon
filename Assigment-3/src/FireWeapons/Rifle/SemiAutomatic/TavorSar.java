package FireWeapons.Rifle.SemiAutomatic;

import FireWeapons.Rifle.SemiAutomatic.SemiAutomatic;

public class TavorSar extends SemiAutomatic {
    public TavorSar(){}
    public TavorSar(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic, serialNumber);
    }
}
