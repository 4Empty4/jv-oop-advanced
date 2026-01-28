package core.basesyntax;

public class Rectangle extends Figure{

    double width, height;

    public Rectangle(String color, double width) {
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
        System.out.println("Rectangle, color: " + color + ", width: " + width + ", height: " + height + "area: " + getArea() + "");
    }
}
