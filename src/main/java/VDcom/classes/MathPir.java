package VDcom.classes;

import VDcom.interfaces.MathPirInterface;

/**
 * Класс просчитывающий зависимости в геометрической части уравнения
 */

public class MathPir implements MathPirInterface {

    @Override
    public double mathPir(double pir) {

        double piramid;
        double bar;
        double ring;

        piramid = pir;
        ring = 16.8 / (piramid * 2);
        bar = (ring * 2) / 12;

        return bar;
    }
}
