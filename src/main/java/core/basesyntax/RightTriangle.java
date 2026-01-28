package core.basesyntax;

public class RightTriangle extends Figure{
    double firstLeg, secondLeg;

    public RightTriangle(String color, double v, double rndDouble) {
        super(color);
    }

    @Override
    double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    void draw() {
        System.out.println("Right triangle, color: " + color + ", firstLeg: " + firstLeg + ", secondLeg: " + secondLeg + "area: " + getArea() + "");
    }
}
