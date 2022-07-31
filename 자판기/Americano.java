public class Americano extends Beverage {
    public Americano(String beverageName, Hot_Or_Iced hot_ice) {
        super(beverageName, hot_ice);
    }

    public int cost() {
        if (getHot_Iced() == Hot_Or_Iced.ICED)
            return cost = 1700;
        return cost = 1200;
    }
}
