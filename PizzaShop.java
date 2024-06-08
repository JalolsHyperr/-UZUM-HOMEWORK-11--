package UzumHomeWork_11;

/**
 * Демонстрация работы пиццерии.
 */
public class PizzaShop {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new SimplePizzaFactory();

        // Создание пиццы с использованием фабричного метода
        Pizza pizza = pizzaFactory.orderPizza("pepperoni");
        if (pizza != null) {
            System.out.println("Заказано: " + pizza.getDescription() + " | Цена: $" + pizza.getPrice());

            // Кастомизация пиццы с использованием паттерна строитель
            PizzaBuilder builder = new PizzaBuilder(pizza);
            CustomPizza customPizza = builder.setDough("толстое").build();
            System.out.println("Кастомизация: " + customPizza.getDescription() + " | Цена: $" + customPizza.getPrice());

            // Добавление ингредиентов с использованием паттерна декоратор
            Pizza decoratedPizza = new CheeseDecorator(new OlivesDecorator(customPizza));
            System.out.println("С добавками: " + decoratedPizza.getDescription() + " | Цена: $" + decoratedPizza.getPrice());
        } else {
            System.out.println("Не удалось создать пиццу.");
        }
    }
}
