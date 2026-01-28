package core.basesyntax;

public abstract class Figure {
    protected String color;
    abstract double getArea();
    abstract void draw();

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
