package CarportBerninger;

import CarportBerninger.Materials.*;

public class Carport {

    private Spær spær;


    private boolean fladtTag;
    private boolean withShed;
    private int length;
    private int width;
    private int heigth;
    private int shedWidth;
    private int shedLength;

    //materialise
    private int antalSpær;
    private BearingPostVerCarport bearingPosts; //Vertical
    private Vindskeder vindskeder;
    private Stern sternSidder;
    private Stern sternEnder;

    public Carport(int length, int width, int heigth, int shedWidth, int shedLength, boolean fladtTag, int degrees) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
        this.shedWidth = shedWidth;
        this.shedLength = shedLength;
        this.fladtTag = fladtTag;
        this.withShed = true;

        this.antalSpær = new Spær(length,fladtTag, StaticValues.dictensBetweenSpær).getAntalSpær();
        this.bearingPosts = new BearingPostVerCarport(length, shedLength, heigth);
        this.vindskeder = new Vindskeder(width, degrees);
        this.sternSidder = new Stern(length,shedLength);
        this.sternEnder = new Stern(fladtTag,shedLength);
    }
//
//    public Carport(int length, int width, int heigth, boolean fladtTag) {
//        this.length = length;
//        this.width = width;
//        this.heigth = heigth;
//        this.fladtTag = fladtTag;
//        this.withShed = false;
//
//    }

}
