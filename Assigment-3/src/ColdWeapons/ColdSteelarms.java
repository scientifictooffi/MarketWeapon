package ColdWeapons;
import Store.weaponStore;
public class ColdSteelarms extends weaponStore {
    public double bladeLength;
    public String metal;
    public ColdSteelarms(){}
    public ColdSteelarms(double weight, double price, int range, String country, double bladeLength, String meta, String serialNumber){
        super(weight, price, range, country, serialNumber);
        this.bladeLength= bladeLength;
        this.metal =metal;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public String getMetal() {
        return metal;
    }
}
