package CarportBerninger;

public class Spær {

    private int antalSpær;

    public Spær(int length, boolean fladRoof, int distanceBetween ) {
        if (!fladRoof) {
            antalSpær= (length / distanceBetween) - 2;
        } else {
            antalSpær= 0;
        }

    }

   public int getAntalSpær(){
        return antalSpær;
   }
}
