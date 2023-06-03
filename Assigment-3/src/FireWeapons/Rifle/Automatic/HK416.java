package FireWeapons.Rifle.Automatic;

import FireWeapons.Rifle.Automatic.Automatic;

public class HK416 extends Automatic {
    public HK416(){}
    public HK416(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic,  serialNumber);
    }
}
