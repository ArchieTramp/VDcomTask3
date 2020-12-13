package VDcom.classes;

import VDcom.interfaces.MathVitCInterface;

import java.util.Scanner;

/**
 * Класс просчитывающий количества витамина С в зависимости от фруктов
 */

public class MathVitC implements MathVitCInterface {

    @Override
    public void mathVitC() {
        double vitC;
        double apple;
        double lime;
        double lemon;

        System.out.println("How many lemon's?");
        Scanner scanner = new Scanner(System.in);
        lemon = scanner.nextDouble();
        lime = lemon * 1.5;
        apple = lime * 3 / 1.2;
        vitC = apple * 0.012;
        System.out.println(lemon + " lemon = " + vitC + " g vitamin C");
    }
}
