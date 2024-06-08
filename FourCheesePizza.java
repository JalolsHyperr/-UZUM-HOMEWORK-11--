package UzumHomeWork_11;



/**
 * Класс пиццы "Четыре сыра".
 */
public class FourCheesePizza implements Pizza {
    @Override
    public String getDescription() {
        return "Пицца Четыре сыра";
    }

    @Override
    public double getPrice() {
        return 12.00;
    }
}
