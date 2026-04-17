
public class Simulation {
    private int numberOfDice;
    private int numberOfTosses;
    private Dice dice;
    private Bins bins;

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 10000);
        sim.runSimulation();
        sim.printResults();
    }

    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        this.dice = new Dice(numberOfDice);
        this.bins = new Bins(numberOfDice, numberOfDice * 6);
    }

    public void runSimulation() {
        for (int i = 0; i < numberOfTosses; i++) {
            int result = dice.tossAndSum();
            bins.incrementBin(result);
        }
    }

    public void printResults() {
        System.out.println("***");
        System.out.println("Simulation of " + numberOfDice + " dice tossed for " + numberOfTosses + " times.");
        System.out.println("***");

        for (int i = numberOfDice; i <= numberOfDice * 6; i++) {
            int count = bins.getBin(i);
            double percentage = (double) count / numberOfTosses;
            int stars = (int) (percentage * 100);
            String asterisks = "*".repeat(stars);
            System.out.printf("%2d : %8d: %.2f %s%n", i, count, percentage, asterisks);
        }
    }

}
