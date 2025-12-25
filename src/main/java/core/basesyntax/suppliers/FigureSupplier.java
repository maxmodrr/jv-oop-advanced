package core.basesyntax.suppliers;

import core.basesyntax.enums.Colors;
import core.basesyntax.enums.Figures;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final Figures[] figures = Figures.values();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figures figureName = figures[random.nextInt(figures.length)];
        Colors randomColor = colorSupplier.getRandomColor();
        Figure figure;
        switch (figureName) {
            case CIRCLE:
                figure = new Circle(randomColor, getRandomNumber());
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(
                        randomColor,
                        getRandomNumber(),
                        getRandomNumber(),
                        getRandomNumber());
                break;
            case RECTANGLE:
                figure = new Rectangle(
                        randomColor,
                        getRandomNumber(),
                        getRandomNumber());
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(
                        randomColor,
                        getRandomNumber(),
                        getRandomNumber());
                break;
            default:
                figure = new Square(randomColor, getRandomNumber());
        }

        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE, 10);
    }

    private int getRandomNumber() {
        return random.nextInt(100);
    }
}
