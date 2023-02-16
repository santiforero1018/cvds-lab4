package hangman.model;


import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest {
    @Test
    public void testOriginalScoreWithCorrectCountCalculate80points(){
        GameScore Os = new OriginalScore();
        int result = Os.calculateScore(26, 12);
        Assert.assertEquals(0, result);

    }

    @Test
    public void testBonusScore(){
        GameScore Bs = new BonusScore();
        int result = Bs.calculateScore(1, 3);
        Assert.assertEquals(0, result); 
    }

    @Test
    public void testPowerScore(){
        GameScore Ps = new PowerScore();
        int result = Ps.calculateScore(4, 0);
        Assert.assertEquals(500, result);
    }
}
