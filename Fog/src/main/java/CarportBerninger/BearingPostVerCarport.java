package CarportBerninger;

public class BearingPostVerCarport {

    private final double distance = StaticValues.bærendeStolpeMinAfstand;

    private int numberOfPosts;
    private int heigth;

    public BearingPostVerCarport(int length, int shedLength, int heigth) {
        this.heigth = heigth + 90;
        int acualLength = length - shedLength;

        numberOfPosts = (int)((acualLength-(acualLength % distance)) / distance) * 2;
    }

    public int getNumberOfPosts(){
        return numberOfPosts;
    }
    public int getHeigth() {
        return heigth;
    }
}
