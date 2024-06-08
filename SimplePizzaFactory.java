package UzumHomeWork_11;

/**
 * Конкретная реализация фабрики пиццы.
 */
public class SimplePizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        switch (type.toLowerCase()) {
            case "four cheese":
                return new FourCheesePizza();
            case "hawaiian":
                return new HawaiianPizza();
            case "pepperoni":
                return new PepperoniPizza();
            default:
                throw new IllegalArgumentException("Неизвестный тип пиццы: " + type);
        }
    }
}
