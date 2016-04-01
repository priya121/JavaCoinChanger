import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinChangerTest {
    CoinChanger coinChanger = new CoinChanger();

    @Test
    public void convertsEmptyToEmpty() {
        assertEquals(0, coinChanger.convert(0));
    }

    @Test
    public void convertsOneTo1p() {
        assertEquals(1, coinChanger.convert(1));
    }

    @Test
    public void convertsTwoTo2p() {
        assertEquals(2, coinChanger.convert(2));
    }
}
