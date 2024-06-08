package UzumHomeWork_11;

/**
 * Класс "Пепперони пицца".
 */
public class PepperoniPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Пепперони пицца";
    }

    @Override
    public double getPrice() {
        return 11.00;
    }
}
