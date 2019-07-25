package s;

public class Chicken {
    private double cock_price=5;
    private double hen_price=3;

    public Chicken(double cock_price, double hen_price, double chick_price, int cock_num, int hen_num, int chick_num) {
        this.cock_price = cock_price;
        this.hen_price = hen_price;
        this.chick_price = chick_price;
        this.cock_num = cock_num;
        this.hen_num = hen_num;
        this.chick_num = chick_num;
    }
    public Chicken(){}

    private double chick_price=1.0/3.0;

    public double getCock_price() {
        return cock_price;
    }

    public void setCock_price(double cock_price) {
        this.cock_price = cock_price;
    }

    public double getHen_price() {
        return hen_price;
    }

    public void setHen_price(double hen_price) {
        this.hen_price = hen_price;
    }

    public double getChick_price() {
        return chick_price;
    }

    public void setChick_price(double chick_price) {
        this.chick_price = chick_price;
    }

    public int getCock_num() {
        return cock_num;
    }

    public void setCock_num(int cock_num) {
        this.cock_num = cock_num;
    }

    public int getHen_num() {
        return hen_num;
    }

    public void setHen_num(int hen_num) {
        this.hen_num = hen_num;
    }

    public int getChick_num() {
        return chick_num;
    }

    public void setChick_num(int chick_num) {
        this.chick_num = chick_num;
    }

    int cock_num;
    int hen_num;
    int chick_num;
}
