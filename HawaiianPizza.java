package UzumHomeWork_11;

/**
 * Класс "Гавайская пицца".
 */
public class HawaiianPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Гавайская пицца";
    }

    @Override
    public double getPrice() {
        return 10.00;
    }
}
