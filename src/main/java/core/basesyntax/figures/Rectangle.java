package core.basesyntax.figures;

import core.basesyntax.enums.Colors;

public class Rectangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public Rectangle(Colors color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) firstLeg * secondLeg;
    }

    @Override
    public String getDetails() {
        return "firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units";
    }

    @Override
    public String getName() {
        return "rectangle";
    }
}
