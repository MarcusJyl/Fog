package CarportBerninger.Util;

public class WoodReturn {

    private double length;
    private int amount;

    public WoodReturn(double length, int amount) {
        this.length = length;
        this.amount = amount;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
