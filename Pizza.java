package UzumHomeWork_11;

/**
 * Интерфейс для всех типов пиццы.
 */
public interface Pizza {
    /**
     * Возвращает описание пиццы.
     * @return описание пиццы.
     */
    String getDescription();

    /**
     * Возвращает цену пиццы.
     * @return цена пиццы.
     */
    double getPrice();
}
