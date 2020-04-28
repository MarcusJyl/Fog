package CarportBerninger;

public class Vindskeder {
    private double length;

    public Vindskeder(int width, int degrees) {
        double radians = Math.toRadians(180 - 90 - degrees);
        double widthHalf = width / 2;
        length = Math.round((Math.sin(radians)*widthHalf)*100);
        length /= 100;
        length *= 4;
    }

    public double getLength() {
        return length;
    }
}
