package core.basesyntax;

public class Rectangle extends Figure {
    protected double width;
    protected double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, color: " + color
                + ", width: " + width
                + ", height: " + height
                + ", area: " + getArea());
    }
}