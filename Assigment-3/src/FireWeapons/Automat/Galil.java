package FireWeapons.Automat;

import FireWeapons.Automat.Automat;

public class Galil extends Automat {
    public Galil(){}
    public Galil(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic,  serialNumber);
    }
}
