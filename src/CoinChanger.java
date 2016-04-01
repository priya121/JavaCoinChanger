import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChanger {
    List<Integer> change = new ArrayList<>();
    List<Integer> coins = Arrays.asList(2, 1);

    public List<Integer> convert(int amount) {
        for (Integer coin : coins) {
            while (amount >= coin) {
                change.add(coin);
                amount -= coin;
            }
        }
        return change;
    }
}
