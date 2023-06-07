package core.basesyntax;

import java.util.Random;

public class Application {
    private static final Random RANDOM = new Random();
    private static final int FIGURES_COUNT = 20;
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        int randomNumber = RANDOM.nextInt(FIGURES_COUNT);
        int halfOfRandomNumber = randomNumber / 2;
        for (int i = 0; i < randomNumber; i++) {
            Figure figure;
            if (i < halfOfRandomNumber) {
                figure = figureSupplier.getRandomFigure();
            } else {
                figure = figureSupplier.getDefaultFigure();
            }
            figure.draw();

        }
    }
}
