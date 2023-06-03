package FireWeapons.Pistol;

import FireWeapons.Pistol.Pistol;

public class Glock extends Pistol {
    public Glock(){}
    public Glock(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic, serialNumber);
    }
}
