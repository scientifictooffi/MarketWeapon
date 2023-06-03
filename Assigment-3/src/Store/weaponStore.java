package Store;

public class weaponStore {
    public double weight;
    public double price;
    public  int range;
    public String country;
    public String serialNumber;
    public weaponStore(){}
    public weaponStore(double weight, double price, int range, String country, String serialNumber){
        this.weight = weight;
        this.price = price;
        this.range = range;
        this.country = country;
        this.serialNumber=serialNumber;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getRange() {
        return range;
    }

    public String getCountry() {
        return country;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}