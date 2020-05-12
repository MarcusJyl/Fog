package CarportBerninger.Util;

public class WoodFromDB {
    int id;
    int produktId;
    int længde;
    int bredde;
    int dypde;
    int meterpris;
    String name;

    public WoodFromDB(int id, int produktId, int længde, int bredde, int dypde, int meterpris, String name) {
        this.id = id;
        this.produktId = produktId;
        this.længde = længde;
        this.bredde = bredde;
        this.dypde = dypde;
        this.meterpris = meterpris;
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

    public int getLængde() {
        return længde;
    }

    public void setLængde(int længde) {
        this.længde = længde;
    }

    public int getBredde() {
        return bredde;
    }

    public void setBredde(int bredde) {
        this.bredde = bredde;
    }

    public int getDypde() {
        return dypde;
    }

    public void setDypde(int dypde) {
        this.dypde = dypde;
    }

    public int getMeterpris() {
        return meterpris;
    }

    public void setMeterpris(int meterpris) {
        this.meterpris = meterpris;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
