package FireWeapons.Rifle.SemiAutomatic;

import FireWeapons.Rifle.Rifle;

public class SemiAutomatic extends Rifle {
    public SemiAutomatic(){}
    public SemiAutomatic(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic,  serialNumber);
    }
}
