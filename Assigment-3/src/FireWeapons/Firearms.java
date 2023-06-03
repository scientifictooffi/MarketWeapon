package FireWeapons;
import Store.weaponStore;
public class Firearms extends weaponStore {
    public double trunkLength;//длина ствола
    public int magazine;//емкость магазина
    public double caliber;
    public boolean isAutamatic;

    public Firearms(){}
    public Firearms(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic, String serialNumber){
        super(weight, price, range, country, serialNumber);
        this.trunkLength= trunkLength;
        this.magazine=magazine;
        this.caliber=caliber;
        this.isAutamatic =isAutamatic;

    }
    public void setIsAutamatic(boolean isAutamatic) {
        this.isAutamatic = isAutamatic;
    }

    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }

    public void setMagazine(int magazine) {
        this.magazine = magazine;
    }

    public void setTrunkLength(double trunkLength) {
        this.trunkLength = trunkLength;
    }

    public double getCaliber() {
        return caliber;
    }

    public double getTrunkLength() {
        return trunkLength;
    }

    public int getMagazine() {
        return magazine;
    }
    public boolean getIsAutamatic() {
        return isAutamatic;
    }
}
