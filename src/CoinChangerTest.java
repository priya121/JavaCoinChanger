import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinChangerTest {
    CoinChanger coinChanger = new CoinChanger();

    @Test
    public void convertsEmptyToEmpty() {
        coinChanger.convert(0);
        assertEquals(0, coinChanger.convert(0));
    }

    @Test
    public void convertsOneTo1p() {
        coinChanger.convert(1);
        assertEquals(1, coinChanger.convert(1));

    }
}
