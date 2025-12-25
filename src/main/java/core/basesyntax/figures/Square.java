package core.basesyntax.figures;

import core.basesyntax.enums.Colors;

public class Square extends Figure {
    private final int side;

    public Square(Colors color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getDetails() {
        return "side: " + side + " units";
    }

    @Override
    public String getName() {
        return "square";
    }
}
