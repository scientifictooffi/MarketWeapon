package FireWeapons.Shotgun;

import FireWeapons.Shotgun.SingleBarrel;

public class M30_Luftwaffe extends SingleBarrel {
    public M30_Luftwaffe(){}
    public M30_Luftwaffe(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber,int barrel){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic, serialNumber, barrel);
    }
}
