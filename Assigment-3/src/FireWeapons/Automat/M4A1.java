package FireWeapons.Automat;

import FireWeapons.Automat.Automat;

public class M4A1 extends Automat {
    public M4A1(){}
    public M4A1(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic,  serialNumber);
    }
}
