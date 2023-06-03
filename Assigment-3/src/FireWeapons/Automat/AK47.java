package FireWeapons.Automat;

import FireWeapons.Automat.Automat;

public class AK47 extends Automat {
    public AK47(){}
    public AK47(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic,  serialNumber);
    }
}
