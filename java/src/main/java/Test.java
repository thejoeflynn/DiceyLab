import static org.junit.Assert.assertTrue;

public @interface Test {
    
public class DiceTest {
    @Test
    public void testTossAndSumWithOneDie() {
        Dice dice = new Dice(1);
        int result = dice.tossAndSum();
        assertTrue (result >=1 && result <= 6);
    }

    @Test
    public void testTossAndSumWithTwoDice() {
        Dice dice = new Dice(2);
        int result = dice.tossAndSum();
        assertTrue(result >= 2 && result <= 12);
    }

}


}
