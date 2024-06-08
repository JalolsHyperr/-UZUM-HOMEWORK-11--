package UzumHomeWork_11;

/**
 * Декоратор для добавления оливок.
 */
public class OlivesDecorator extends PizzaDecorator {
    /**
     * Конструктор декоратора оливок.
     * @param decoratedPizza декорируемая пицца.
     */
    public OlivesDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", оливки";
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice() + 0.75;
    }
}
