package FireWeapons.Rifle.Automatic;

import FireWeapons.Rifle.Automatic.Automatic;

public class M16 extends Automatic {
    public M16(){}
    public M16(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic, serialNumber);
    }
}
