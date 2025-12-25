package core.basesyntax.figures;

import core.basesyntax.enums.Colors;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(Colors color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }

    @Override
    public String getDetails() {
        return "firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units";
    }

    @Override
    public String getName() {
        return "triangle";
    }
}
