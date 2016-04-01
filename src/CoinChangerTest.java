import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CoinChangerTest {
    List<Integer> coins = new ArrayList<>();
    List<Integer> change = new ArrayList<>();
    CoinChanger coinChanger = new CoinChanger();

    @Test
    public void convertsEmptyToEmpty() {
        change.add(0);
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
    public void convertsFourInto2p2p() {
        coins.add(2);
        coins.add(2);
        assertEquals(coins, coinChanger.convert(4));
    }


}
