package FireWeapons.Automat;

import FireWeapons.Firearms;

public class Automat extends Firearms {
    public Automat(){}
    public Automat(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic, serialNumber);
    }

}
