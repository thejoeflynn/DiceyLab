
import java.util.Random;

public class Dice {

    private int numberOfDice;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int tossAndSum() {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < numberOfDice; i++) {
            sum += random.nextInt(6) + 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        Dice dice = new Dice(5); // for yatzee
        Dice dice1 = new Dice(2); // for craps

        Integer toss = dice.tossAndSum();
        Integer toss1 = dice1.tossAndSum();

        System.out.println("Toss and sum of 5 dice: " + toss);
        System.out.println("Toss and sum of 2 dice: " + toss1);
    }
    
    
}