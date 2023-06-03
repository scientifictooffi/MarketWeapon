package NuclearWeapons;
import Store.weaponStore;
public class Nuclear extends weaponStore {
    public int power;// в тоннах
    public String type;//высотный, воздушный, наземный, надводный, подземный, подводный
    public Nuclear(){}
    public Nuclear(double weight, double price, int range, String country,int power, String type, String serialNumber){
        super(weight, price, range, country,  serialNumber);
        this.type = type;
        this.power = power;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }
}