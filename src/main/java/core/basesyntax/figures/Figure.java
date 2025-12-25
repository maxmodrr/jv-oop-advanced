package core.basesyntax.figures;

import core.basesyntax.enums.Colors;
import core.basesyntax.interfaces.AreaCalculable;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements AreaCalculable, Drawable {
    private Colors color;

    protected Figure(Colors color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + getName()
                + ", area: "
                + getArea()
                + " sq. units, "
                + getDetails()
                + ", color: "
                + color);
    }

    public abstract String getName();

    public abstract String getDetails();

    public Colors getColor() {
        return color;
    }
}
