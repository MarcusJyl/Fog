package Matrialeliste.Util;

/**
 * Holadert værdiger der bliver hentet om tag fra databaseen
 */

public class RoofFromDB {

    private int id;
    private int produktId;
    private double pris;
    private String name;

    public RoofFromDB(int id, int produktId, double pris, String name) {
        this.id = id;
        this.produktId = produktId;
        this.pris = pris;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduktId() {
        return produktId;
    }

    public void setProduktId(int produktId) {
        this.produktId = produktId;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RoofFromDB{" +
                "id=" + id +
                ", produktId=" + produktId +
                ", pris=" + pris +
                ", name='" + name + '\'' +
                '}';
    }
}
