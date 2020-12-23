package VDcom.classes;

import VDcom.interfaces.MathGirInterface;

/**
 * Класс просчитывающий зависимости животной части уравнения
 */

public class MathGir implements MathGirInterface {

    @Override
    public double mathGir(double gir) {

        double hare;
        double cat;
        double giraffe;


        giraffe = gir;
        cat = 5 / (0.5 * giraffe);
        hare = (cat) * 4;

        return hare;

    }

}
