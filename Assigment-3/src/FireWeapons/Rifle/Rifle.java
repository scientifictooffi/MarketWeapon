package FireWeapons.Rifle;

import FireWeapons.Firearms;

public class Rifle extends Firearms {
    public Rifle(){}
    public Rifle(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic,  serialNumber);
    }

}
