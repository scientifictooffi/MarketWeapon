package FireWeapons.Pistol;

import FireWeapons.Pistol.Pistol;

public class FiveSeven extends Pistol {
    public FiveSeven(){}
    public FiveSeven(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic,  serialNumber);
    }
}
