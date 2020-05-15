package CarportBerninger;

import CarportBerninger.Materials.Roof.*;
import CarportBerninger.Materials.SkruerOgBeslag.*;
import CarportBerninger.Materials.Wood.*;
import CarportBerninger.Util.ItemsByNumber;
import CarportBerninger.Util.Wood;
import DBAccess.MaterialsListFunc;

import java.util.ArrayList;

public class Carport {

    private ArrayList<Wood> woods;
    private ArrayList<ItemsByNumber> roof;
    private ArrayList<ItemsByNumber> beslag;
    private Spær spær;

    private boolean fladtTag;
    private boolean withShed;
    private int length;
    private int width;
    private int heigth;
    private int shedWidth;
    private int shedLength;




    public Carport(int length, int width, int heigth, int shedWidth, int shedLength, boolean fladtTag, boolean shed, int degrees) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
        this.shedWidth = shedWidth;
        this.shedLength = shedLength;
        this.fladtTag = fladtTag;
        this.withShed = true;

        SternSkur sternSkur = new SternSkur(width);
        SternCarport sternCarport;
        Vindskeder vindskeder = new Vindskeder(width, degrees);
        BrætPåVindskeder brætPåVindskeder = new BrætPåVindskeder(width, degrees);
        Toplægte toplægte = new Toplægte(length);
        Taglægte taglægte = new Taglægte(width, degrees, length);
        BearingPostVerShed bearingPostVerShed;
        BearingPostVerCarport bearingPostVerCarport;
        Bræddebolt bræddebolt;
        BeklædningAfSkur beklædningAfSkur;
        BeklædningAfGavle beklædningAfGavle;
        Skruer4_5x070 skruer4_5x070;


        woods = new ArrayList<>();
        beslag = new ArrayList<>();

        if (shed) {
            bearingPostVerShed = new BearingPostVerShed(shedLength, heigth, width);
            bearingPostVerCarport = new BearingPostVerCarport(length, shedLength, heigth);
            bræddebolt = new Bræddebolt(bearingPostVerCarport, bearingPostVerShed);
            beklædningAfSkur = new BeklædningAfSkur(shedLength, shedWidth, heigth);
            skruer4_5x070 = new Skruer4_5x070(beklædningAfSkur);
            woods.add(new Løsholter(shedLength, false)); //løsholterWidth
            woods.add(new Løsholter(shedWidth, true)); //løsholterHeight
            woods.add(new RemSkur(shedWidth, width)); //løsholterHeight
            woods.add(new Rem(length, shedWidth)); //rem hvis tag er fladt
            woods.add(beklædningAfSkur); //beklædningAfSkur
            woods.add(bearingPostVerShed);
            woods.add(bearingPostVerCarport); //bearingPosts
            woods.add(sternSkur); //sternEnder brættet der gør man ikke kan se ind i spærne
            woods.add(sternCarport = new SternCarport(length, shedLength)); //sternSidder brættet der gør man ikke kan se ind i spærne
            beslag.add(bræddebolt);
            beslag.add(new Firkantskiver(bræddebolt));
            beslag.add(skruer4_5x070);
            beslag.add(new Skruer4_5x50(skruer4_5x070));

        } else {
            bearingPostVerCarport = new BearingPostVerCarport(length, heigth);
            bræddebolt = new Bræddebolt(bearingPostVerCarport);

            woods.add(sternCarport = new SternCarport(length)); //sternSidder brættet der gør man ikke kan se ind i spærne
            woods.add(new Rem(length)); //rem hvis tag er fladt
            woods.add(new BearingPostVerCarport(length, heigth)); //bearingPosts
            beslag.add(bræddebolt);
            beslag.add(new Firkantskiver(bræddebolt));
        }


        if (fladtTag) {
        } else {
            beklædningAfGavle = new BeklædningAfGavle(width, degrees);
            spær = new Spær(length, fladtTag);
            Universalbeslag190mmHøjre universalbeslag190mmHøjre = new Universalbeslag190mmHøjre(spær);
            woods.add(vindskeder); //vindskeder
            woods.add(brætPåVindskeder); //brætPåVindskeder brætet for enden
            woods.add(beklædningAfGavle); //beklædningAfGavle
            woods.add(taglægte); //taglægte
            woods.add(toplægte);
            woods.add(new BrætTilTagfodslægte(length)); //brætTilTagfodslægte
            beslag.add(new Skruer4_5x50(beklædningAfGavle));
            beslag.add(universalbeslag190mmHøjre);
            beslag.add(new Universalbeslag190mmVenstre(spær));
        }


        roof = new ArrayList<>();
        roof.add(new Tagsten(taglægte.getAmount().getAmount(), length));
        roof.add(new Rygsten(length));
        roof.add(new RygstenBeslag(new Rygsten(length).getAmount()));
        roof.add(new ToplægteHolder(length));
        roof.add(new Nakkekrog(new Tagsten(taglægte.getAmount().getAmount(), length).getAmount()));

        beslag.add(new Stalddørsgreb());
        beslag.add(new THængsel());
        beslag.add(new Skruer4_5x60(sternSkur, sternCarport, vindskeder, brætPåVindskeder));

        beslag.add(new Beslagskruer5x40(toplægte, spær.getAmount()));
        beslag.add(new Skruer5x100(taglægte));

//        for (ItemsByNumber item : beslag){
//            for (Integer i : item.getVareNr())
//            System.out.println(MaterialsListFunc.getBeslagFromDB(i));
//        }

    }

    public ArrayList<Wood> getWoods() {
        return woods;
    }

    public ArrayList<ItemsByNumber> getRoof() {
        return roof;
    }

    public ArrayList<ItemsByNumber> getBeslag() {
        return beslag;
    }

    public boolean isFladtTag() {
        return fladtTag;
    }

    public boolean isWithShed() {
        return withShed;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }

    public int getShedWidth() {
        return shedWidth;
    }

    public int getShedLength() {
        return shedLength;
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
