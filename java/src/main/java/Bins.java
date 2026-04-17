
public class Bins {
    private int min;
    private int max;
    private int[] bins;

    public Bins(int min, int max) {
        this.min = min;
        this.max = max;
        this.bins = new int[max - min +1];
    }

    public int getBin(int number) {
        return bins[number-min];
    }

    public void incrementBin(int number) {
        bins[number - min]++;
    }

    




}
