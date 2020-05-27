package Matrialeliste.Util;

/**
 * Holder værdiger om beslag og skruer der bliver hentet fra databasen
 */

public class BeslagFromDB extends RoofFromDB {

    private int antal;

    public BeslagFromDB(int id, int produktId, double pris, String name, int antal) {
        super(id, produktId, pris, name);
        this.antal = antal;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }
}
