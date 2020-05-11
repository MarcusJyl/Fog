package FunctionLayer;

public class WoodWhitPrice {

    private int id;
    private String name;
    private int bredde;
    private int lægde;
    private int højde;
    private double meterPris;
    private int produktnummer;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBredde() {
        return bredde;
    }

    public int getLægde() {
        return lægde;
    }

    public int getHøjde() {
        return højde;
    }

    public double getMeterPris() {
        return meterPris;
    }

    public int getProduktnummer() {
        return produktnummer;
    }

    public WoodWhitPrice(int id, int bredde, int lægde, int højde, double meterPris, int produktnummer, String name) {
        this.id = id;
        this.name = name;
        this.bredde = bredde;
        this.lægde = lægde;
        this.højde = højde;
        this.meterPris = meterPris;
        this.produktnummer = produktnummer;
    }
}
