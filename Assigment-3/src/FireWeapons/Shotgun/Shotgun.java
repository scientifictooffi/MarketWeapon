package FireWeapons.Shotgun;

import FireWeapons.Firearms;

public class Shotgun extends Firearms {
    int barrel;
    public Shotgun(){}
    public Shotgun(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber,int barrel){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic, serialNumber);
        this.barrel=barrel;
    }

    public void setBarrel(int barrel) {
        this.barrel = barrel;
    }

    public int getBarrel() {
        return barrel;
    }
}
