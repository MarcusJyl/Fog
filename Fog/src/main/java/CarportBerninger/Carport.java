package CarportBerninger;

public class Carport {

    private boolean fladtTag;
    private boolean withShed;
    private int length;
    private int width;
    private int heigth;
    private int shedWidth;
    private int shedLength;
    private int antalSpær;

    public Carport(int length, int width, int heigth, int shedWidth, int shedLength, boolean fladtTag) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
        this.shedWidth = shedWidth;
        this.shedLength = shedLength;
        this.fladtTag = fladtTag;
        this.withShed = true;

        if (!this.fladtTag){
            antalSpær = (this.length / 70) - 2;
        }
    }

    public Carport(int length, int width, int heigth, boolean fladtTag) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
        this.fladtTag = fladtTag;
        this.withShed = false;

        if (!this.fladtTag){
            antalSpær = (this.length / 70) - 2;
        }
    }

}
