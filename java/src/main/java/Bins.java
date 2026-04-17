
public class Bins {
Bins results = new Bins(2, 12); // for bins from 2..12
Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
results.incrementBin(10); // should increment bin # 10

}
