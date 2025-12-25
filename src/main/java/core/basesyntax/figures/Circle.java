package core.basesyntax.figures;

import core.basesyntax.enums.Colors;

public class Circle extends Figure {
    private final int radius;

    public Circle(Colors color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getDetails() {
        return "radius: " + radius + " units";
    }

    @Override
    public String getName() {
        return "circle";
    }
}
