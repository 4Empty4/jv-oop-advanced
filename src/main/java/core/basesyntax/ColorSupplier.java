package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {
            "white", "black", "red", "green", "blue",
            "yellow", "pink", "orange", "gray", "brown"
    };

    private final Random random = new Random();

    /**
     * Повертає випадковий колір як String.
     */
    public String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
