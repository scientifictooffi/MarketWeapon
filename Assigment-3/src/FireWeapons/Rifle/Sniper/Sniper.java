package FireWeapons.Rifle.Sniper;

import FireWeapons.Rifle.Rifle;

public class Sniper extends Rifle {
    int zoom;
    public Sniper(){}
    public Sniper(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic,int zoom, String serialNumber){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic, serialNumber);
        this.zoom=zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public int getZoom() {
        return zoom;
    }
}
