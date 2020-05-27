package FunctionLayer;

/**
 * Klassen holder information om træ så det kan sendes vider sammen
 */

public class WoodWhitPrice {

    private int id;
    private String name;
    private double bredde;
    private double lægde;
    private double højde;
    private double meterPris;
    private int produktnummer;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBredde() {
        return bredde;
    }

    public double getLægde() {
        return lægde;
    }

    public double getHøjde() {
        return højde;
    }

    public double getMeterPris() {
        return meterPris;
    }

    public int getProduktnummer() {
        return produktnummer;
    }

    public WoodWhitPrice(int id, double bredde, double lægde, double højde, double meterPris, int produktnummer, String name) {
        this.id = id;
        this.name = name;
        this.bredde = bredde;
        this.lægde = lægde;
        this.højde = højde;
        this.meterPris = meterPris;
        this.produktnummer = produktnummer;
    }
    public WoodWhitPrice(int id, double bredde, double lægde, double højde, double meterPris) {
        this.id = id;
        this.bredde = bredde;
        this.lægde = lægde;
        this.højde = højde;
        this.meterPris = meterPris;
    }
}
