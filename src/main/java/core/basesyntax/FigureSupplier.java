package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int type = random.nextInt(5);
        switch (type) {
            case 0:
                return new Circle(color, rndDouble(1.0, 100.0));
            case 1:
                return new Square(color, rndDouble(1.0, 100.0));
            case 2:
                return new Rectangle(color, rndDouble(1.0, 100.0), rndDouble(1.0, 100.0));
            case 3:
                return new RightTriangle(color, rndDouble(1.0, 100.0), rndDouble(1.0, 100.0));
            case 4:
                return new IsoscelesTrapezoid(
                        color,
                        rndDouble(1.0, 100.0),
                        rndDouble(1.0, 100.0),
                        rndDouble(1.0, 100.0)
                );
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