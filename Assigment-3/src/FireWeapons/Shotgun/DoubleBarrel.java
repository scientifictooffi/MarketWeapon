package FireWeapons.Shotgun;

import FireWeapons.Shotgun.Shotgun;

public class DoubleBarrel extends Shotgun {
    public DoubleBarrel(){}
    public DoubleBarrel(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber, int barrel){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic, serialNumber, barrel);
    }
}
