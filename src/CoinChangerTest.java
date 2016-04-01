import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CoinChangerTest {
    CoinChanger coinChanger = new CoinChanger();

    @Test
    public void convertsEmptyToEmpty() {
        List<Integer> change = new ArrayList<>();
        change.add(0);
        assertEquals(change, coinChanger.convert(0));
    }

    @Test
    public void convertsOneTo1p() {
        List<Integer> change = new ArrayList<>();
        change.add(1);
        assertEquals(change, coinChanger.convert(1));
    }

    @Test
    public void convertsTwoTo2p() {
        List<Integer> change = new ArrayList<>();
        change.add(2);
        assertEquals(change, coinChanger.convert(2));
    }

    @Test
    public void convertsThreeTo1p2p() {
        List<Integer> coins = new ArrayList<>();
        coins.add(2);
        coins.add(1);
        assertEquals(coins, coinChanger.convert(3));
    }
}
