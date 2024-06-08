package UzumHomeWork_11;

/**
 * Строитель для создания кастомной пиццы.
 */
public class PizzaBuilder {
    private Pizza pizza;
    private String dough;

    /**
     * Конструктор строителя пиццы.
     * @param pizza базовая пицца.
     */
    public PizzaBuilder(Pizza pizza) {
        this.pizza = pizza;
    }

    /**
     * Устанавливает тип теста для пиццы.
     * @param dough тип теста.
     * @return текущий объект строителя.
     */
    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    /**
     * Создает кастомную пиццу.
     * @return созданная кастомная пицца.
     */
    public CustomPizza build() {
        return new CustomPizza(pizza, dough);
    }
}
