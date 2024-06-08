package UzumHomeWork_11;

/**
 * Абстрактная фабрика для создания пиццы.
 */
public abstract class PizzaFactory {
    /**
     * Создает пиццу указанного типа.
     * @param type тип пиццы.
     * @return созданная пицца.
     */
    public abstract Pizza createPizza(String type);

    /**
     * Заказывает пиццу указанного типа.
     * @param type тип пиццы.
     * @return заказанная пицца.
     */
    public Pizza orderPizza(String type) {
        try {
            Pizza pizza = createPizza(type);
            return pizza;
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
            return null;
        }
    }
}
