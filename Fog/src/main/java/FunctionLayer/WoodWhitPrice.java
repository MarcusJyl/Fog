package FunctionLayer;

public class WoodWhitPrice {

    private int id;
    private String træType;
    private int bredde;
    private int lægde;
    private int højde;
    private double meterPris;
    private int produktnummer;

    public int getId() {
        return id;
    }

    public String getTræType() {
        return træType;
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

    public WoodWhitPrice(int id, String træType, int bredde, int lægde, int højde, double meterPris, int produktnummer) {
        this.id = id;
        this.træType = træType;
        this.bredde = bredde;
        this.lægde = lægde;
        this.højde = højde;
        this.meterPris = meterPris;
        this.produktnummer = produktnummer;
    }
}
