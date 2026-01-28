package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    double firstLeg, secondLeg, height;

    public IsoscelesTrapezoid(String color, double firstLeg, double secondLeg, double height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (firstLeg + secondLeg) * height;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles trapezoid, color: " + color + ", firstLeg: " + firstLeg + ", secondLeg: " + secondLeg + ", height: " + height + "area: " + getArea() + "");
    }
}
