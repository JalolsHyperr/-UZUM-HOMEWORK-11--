package UzumHomeWork_11;

/**
 * Абстрактный декоратор для добавления ингредиентов к пицце.
 */
public abstract class PizzaDecorator implements Pizza {
    protected Pizza decoratedPizza;

    /**
     * Конструктор декоратора пиццы.
     * @param decoratedPizza декорируемая пицца.
     */
    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice();
    }
}
