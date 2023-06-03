package FireWeapons;

import FireWeapons.Firearms;

public class SubmachineGun extends Firearms {
    public SubmachineGun(){}
    public SubmachineGun(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic,  serialNumber);
    }
}
