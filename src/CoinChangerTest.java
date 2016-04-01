import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CoinChangerTest {
    List<Integer> coins = new ArrayList<>();
    List<Integer> change = new ArrayList<>();
    CoinChanger coinChanger = new CoinChanger();

    @Test
    public void convertsEmptyToEmpty() {
        assertEquals(change, coinChanger.convert(0));
    }

    @Test
    public void convertsOneTo1p() {
        change.add(1);
        assertEquals(change, coinChanger.convert(1));
    }

    @Test
    public void convertsTwoTo2p() {
        change.add(2);
        assertEquals(change, coinChanger.convert(2));
    }

    @Test
    public void convertsThreeTo1p2p() {
        coins.add(2);
        coins.add(1);
        assertEquals(coins, coinChanger.convert(3));
    }

    @Test
    public void convertsFourTo2p2p() {
        coins.add(2);
        coins.add(2);
        assertEquals(coins, coinChanger.convert(4));
    }

    @Test
    public void convertsFiveTo5p() {
        coins.add(5);
        assertEquals(coins, coinChanger.convert(5));
    }

    @Test
    public void converts6To2p2p2p() {
        List<Integer> coins = addCoins(Arrays.asList(5, 1));
        assertEquals(coins, coinChanger.convert(6));
    }
    
    @Test
    public void converts67To50p10p5p2p() {
        List<Integer> coins = addCoins(Arrays.asList(50, 10, 5, 2));
        assertEquals(coins, coinChanger.convert(67));
    }
    
    @Test
    public void convertsOnePoundFiftySeven() {
        List<Integer> coins = addCoins(Arrays.asList(100, 50, 10, 5, 2));
        assertEquals(coins, coinChanger.convert(167));
   }

    @Test
    public void convertsThreeHundredAndNinetyEight() {
        List<Integer> coins = addCoins(Arrays.asList(100, 100, 100, 50, 20, 10, 5, 2, 1));
        assertEquals(coins, coinChanger.convert(388));
    }

    public List<Integer> addCoins(List<Integer> coins) {
        List<Integer> coinsList = new ArrayList<>();
        for (Integer coin : coins) {
            coinsList.add(coin);
        }
        return coinsList;
    }
}
