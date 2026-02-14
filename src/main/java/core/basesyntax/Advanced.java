package core.basesyntax;

public class Advanced {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        int n = 6;
        Drawable[] figures = new Drawable[n];

        for (int i = 0; i < n / 2; i++) {
            figures[i] = (Drawable) supplier.getRandomFigure();
        }

        for (int i = n / 2; i < n; i++) {
            figures[i] = (Drawable) supplier.getDefaultFigure();
        }

        for (Drawable f : figures) {
            if (f != null) {
                f.draw();
            }
        }
    }
}
