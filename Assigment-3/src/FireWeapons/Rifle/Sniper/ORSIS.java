package FireWeapons.Rifle.Sniper;

import FireWeapons.Rifle.Sniper.Sniper;

public class ORSIS extends Sniper {
    public ORSIS(){}
    public ORSIS(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic,int zoom, String serialNumber){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic, zoom,  serialNumber);
    }
}
