package CarportBerninger;

public class Carport {

    private Spær spær;


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

        this.antalSpær = new Spær(length,fladtTag, StaticValues.dictensBetweenSpær).getAntalSpær();
    }

    public Carport(int length, int width, int heigth, boolean fladtTag) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
        this.fladtTag = fladtTag;
        this.withShed = false;

    }

}
