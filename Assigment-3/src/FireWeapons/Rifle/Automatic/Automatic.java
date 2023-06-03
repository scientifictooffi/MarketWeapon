package FireWeapons.Rifle.Automatic;

import FireWeapons.Rifle.Rifle;

public class Automatic extends Rifle {
    public Automatic(){}
    public Automatic(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic,  serialNumber);
    }
}
