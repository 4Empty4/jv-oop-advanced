package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int type = random.nextInt(FIGURE_COUNT);
        switch (type) {
            case 0: {
                double radius = rndDouble(1.0, 100.0);
                return new Circle(color, radius);
            }
            case 1: {
                double side = rndDouble(1.0, 100.0);
                return new Square(color, side);
            }
            case 2: {
                double width = rndDouble(1.0, 100.0);
                double height = rndDouble(1.0, 100.0);
                return new Rectangle(color, width, height);
            }
            case 3: {
                double firstLeg = rndDouble(1.0, 100.0);
                double secondLeg = rndDouble(1.0, 100.0);
                return new RightTriangle(color, firstLeg, secondLeg);
            }
            case 4: {
                double base1 = rndDouble(1.0, 100.0);
                double base2 = rndDouble(1.0, 100.0);
                double height = rndDouble(1.0, 100.0);
                return new IsoscelesTrapezoid(color, base1, base2, height);
            }
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10.0);
    }

    private double rndDouble(double min, double max) {
        return min + random.nextDouble() * (max - min);
    }
}
