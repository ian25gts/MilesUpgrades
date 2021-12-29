public class BonusMilesService {
    public int calculate (int price) {
        int priceBonus = 20;
        int amountBonus = 1;
        int cost = price / priceBonus * amountBonus;
        return cost;
    }
}
