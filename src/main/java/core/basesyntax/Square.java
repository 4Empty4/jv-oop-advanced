package core.basesyntax;

public class Square extends Rectangle{
    double width, height;

    public Square(String color, double width) {
        super(color, width);
        this.width = width;
        this.height = height;
    }
    @Override
    double getArea() {
        return width * height;
    }
    @Override
    void draw() {
        System.out.println("Square, color: " + color + ", width: " + width + ", height: " + height + "area: " + getArea() + "");
    }


}
