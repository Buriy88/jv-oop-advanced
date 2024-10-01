package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    public static String getRandomColor() {
        int randomIndex = new Random().nextInt(Color.values().length);
        Color color = Color.values()[randomIndex];
        return color.toString();
    }

}
