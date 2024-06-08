package UzumHomeWork_11;

/**
 * Кастомная пицца с выбором теста.
 */
public class CustomPizza implements Pizza {
    private Pizza basePizza;
    private String dough;

    /**
     * Конструктор кастомной пиццы.
     * @param basePizza базовая пицца.
     * @param dough тип теста.
     */
    public CustomPizza(Pizza basePizza, String dough) {
        this.basePizza = basePizza;
        this.dough = dough;
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " с " + dough + " тестом";
    }

    @Override
    public double getPrice() {
        return basePizza.getPrice() + (dough.equals("толстое") ? 2.00 : 0);
    }
}
