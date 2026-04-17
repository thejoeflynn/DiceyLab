
public class Test {

    public static void main(String args []) {
        Dice dice1 = new Dice(1);
        int result1 = dice1.tossAndSum();
        if (result1 >= 1 && result1 <= 6) {
            System.out.println("It works " + result1);
        }
    
        Dice dice2 = new Dice(2);
        int result2 = dice2.tossAndSum();
        if (result2 >= 2 && result1 <= 12) {
            System.out.println("It works " + result1);
        }

    }


}

