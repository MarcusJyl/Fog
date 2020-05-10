package CarportBerninger;

import CarportBerninger.Materials.Roof.*;
import CarportBerninger.Materials.Wood.*;
import CarportBerninger.Util.ItemsByNumber;
import CarportBerninger.Util.Wood;

import java.util.ArrayList;

public class Carport {

    private ArrayList<Wood> woods;
    private ArrayList<ItemsByNumber> roof;
    private Spær spær;

    private boolean fladtTag;
    private boolean withShed;
    private int length;
    private int width;
    private int heigth;
    private int shedWidth;
    private int shedLength;

    //materialise
//
//    private int antalSpær;
//    private BearingPostVerCarport bearingPosts; //Vertical
//    private Vindskeder vindskeder;
//    private Stern sternSidder;
//    private Stern sternEnder;
//    private Løsholter løsholterWidth;
//    private Løsholter løsholterHeight;
//    private Rem rem;


//    private BrætPåVindskeder brætPåVindskeder;
//    private BeklædningAfGavle beklædningAfGavle;
//    private BrætTilTagfodslægte brætTilTagfodslægte;
//    private BeklædningAfSkur beklædningAfSkur;
//    private Taglægte taglægte;
//    private Tagsten tagsten;
//    private Rygsten rygsten;
//    private RygstenBeslag rygstenBeslag;


    public Carport(int length, int width, int heigth, int shedWidth, int shedLength, boolean fladtTag, boolean shed, int degrees) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
        this.shedWidth = shedWidth;
        this.shedLength = shedLength;
        this.fladtTag = fladtTag;
        this.withShed = true;

        spær = new Spær(length, fladtTag);

        woods = new ArrayList<>();

        if (shed) {
            woods.add(new Løsholter(shedLength, false)); //løsholterWidth
            woods.add(new Løsholter(shedWidth, true)); //løsholterHeight
            woods.add(new RemSkur(shedWidth, width)); //løsholterHeight
            woods.add(new Rem(length, shedWidth)); //rem hvis tag er fladt
            woods.add(new BeklædningAfSkur(shedLength, shedWidth, heigth)); //beklædningAfSkur
            woods.add(new BearingPostVerShed(shedLength, heigth, width));
            woods.add(new SternSkur(width)); //sternEnder brættet der gør man ikke kan se ind i spærne
            woods.add(new SternCarport(length, shedLength)); //sternSidder brættet der gør man ikke kan se ind i spærne
        } else {
            woods.add(new SternCarport(length)); //sternSidder brættet der gør man ikke kan se ind i spærne
            woods.add(new Rem(length)); //rem hvis tag er fladt
        }
        woods.add(new BearingPostVerCarport(length, shedLength, heigth)); //bearingPosts

        if (fladtTag) {
        } else {
            woods.add(new Vindskeder(width, degrees)); //vindskeder
            woods.add(new BrætPåVindskeder(width, degrees)); //brætPåVindskeder brætet for enden
            woods.add(new BeklædningAfGavle(width, degrees)); //beklædningAfGavle
            woods.add(new Taglægte(width, degrees, length)); //taglægte
            woods.add(new BrætTilTagfodslægte(length)); //brætTilTagfodslægte
        }



        roof = new ArrayList<>();
        roof.add(new Tagsten(new Taglægte(width, degrees, length).getAmount().getAmount(), length));
        roof.add(new Rygsten(length));
        roof.add(new RygstenBeslag(new Rygsten(length).getAmount()));
        roof.add(new ToplægteHolder(length));
        roof.add(new Nakkekrog(new Tagsten(new Taglægte(width, degrees, length).getAmount().getAmount(), length).getAmount()));

//        tagsten = new Tagsten(taglægte.getAmount().getAmount(), length);
//        rygsten = new Rygsten(length);
//        rygstenBeslag = new RygstenBeslag(rygsten.getAmount());


//        this.bearingPosts = new BearingPostVerCarport(length, shedLength, heigth);
//        this.vindskeder = new Vindskeder(width, degrees);
//        this.sternSidder = new Stern(length,shedLength);
//        this.sternEnder = new Stern(fladtTag,shedLength);
//        this.løsholterWidth = new Løsholter(shedLength);
//        this.løsholterHeight = new Løsholter(shedWidth);
//        this.rem = new Rem(length);
//        this.brætPåVindskeder = new BrætPåVindskeder(width, degrees);
//        this.beklædningAfGavle = new BeklædningAfGavle(width, degrees);
//        this.brætTilTagfodslægte = new BrætTilTagfodslægte(length);
//        this.taglægte = new Taglægte(width, degrees, length);


//        this.beklædningAfSkur = new BeklædningAfSkur(shedLength, shedWidth, heigth);
    }
//
//    public Carport(int length, int width, int heigth, boolean fladtTag) {
//        this.length = length;
//        this.width = width;
//        this.heigth = heigth;
//        this.fladtTag = fladtTag;
//        this.withShed = false;
//

    public ArrayList<Wood> getWoods() {
        return woods;
    }

    public ArrayList<ItemsByNumber> getRoof() {
        return roof;
    }

    @Override
    public String toString() {
        return "Carport{" +
                "woods=" + woods +
                ", roof=" + roof +
                ", fladtTag=" + fladtTag +
                ", withShed=" + withShed +
                ", length=" + length +
                ", width=" + width +
                ", heigth=" + heigth +
                ", shedWidth=" + shedWidth +
                ", shedLength=" + shedLength +
                ", spær=" + spær;
    }
//    }

}
