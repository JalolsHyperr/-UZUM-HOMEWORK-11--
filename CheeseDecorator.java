package UzumHomeWork_11;

/**
 * Декоратор для добавления сыра.
 */
public class CheeseDecorator extends PizzaDecorator {
    /**
     * Конструктор декоратора сыра.
     * @param decoratedPizza декорируемая пицца.
     */
    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", дополнительный сыр";
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice() + 1.50;
    }
}
