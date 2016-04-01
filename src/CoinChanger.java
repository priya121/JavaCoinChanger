import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChanger {
    List<Integer> change = new ArrayList<>();
    List<Integer> coins = Arrays.asList(2, 1);

    public List<Integer> convert(int amount) {
        if (amount >= 3) {
            for (Integer coin : coins) {
                change.add(coin);
            }
        } else {
            change.add(amount);
        }
        return change;
    }
}
