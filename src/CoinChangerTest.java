import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinChangerTest {

    @Test
    public void convertsEmptyToEmpty() {
        CoinChanger coinChanger = new CoinChanger();
        coinChanger.convert(0);
        assertEquals(0, coinChanger.convert(0));
    }
}
