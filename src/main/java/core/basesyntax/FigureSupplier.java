package core.basesyntax;



import java.util.Random;

/**
 * Створює випадкові фігури або дефолтну фігуру.
 *
 * Звернення: цей клас використовує конструктори конкретних фігур:
 * Circle(String color, double radius)
 * Square(String color, double side)
 * Rectangle(String color, double width, double height)
 * RightTriangle(String color, double firstLeg, double secondLeg)
 * IsoscelesTrapezoid(String color, double base1, double base2, double height)
 *
 * Переконайтесь, що у ваших класах саме такі сигнатури конструкторів.
 */
public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    /**
     * Повертає випадкову фігуру з випадковим кольором і випадковими розмірами.
     */
    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int type = random.nextInt(5); // 0..4
        switch (type) {
            case 0:
                return new Circle(color, rndDouble(1.0, 100.0));
            case 1:
                return new Square(color, rndDouble(1.0, 100.0));
            case 2:
                return new Rectangle(color, rndDouble(1.0, 100.0));
            case 3:
                return new RightTriangle(color, rndDouble(1.0, 100.0), rndDouble(1.0, 100.0));
            case 4:
                // бази та висота для трапеції
                return new IsoscelesTrapezoid(color, rndDouble(1.0, 100.0), rndDouble(1.0, 100.0), rndDouble(1.0, 100.0));
            default:
                return getDefaultFigure();
        }
    }

    /**
     * Завжди повертає біле коло з радіусом 10.
     */
    public Figure getDefaultFigure() {
        return new Circle("white", 10.0);
    }

    private double rndDouble(double min, double max) {
        return min + random.nextDouble() * (max - min);
    }
}