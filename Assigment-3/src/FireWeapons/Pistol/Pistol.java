package FireWeapons.Pistol;

import FireWeapons.Firearms;

public class Pistol extends Firearms {
    public Pistol(){}
    public Pistol(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic,  serialNumber);
    }
}
