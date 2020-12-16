package VDcom.classes;

import VDcom.interfaces.MathVitCInterface;

import java.util.Scanner;

/**
 * Класс просчитывающий количество витамина С в зависимости от фруктов
 */

public class MathVitC implements MathVitCInterface {

    @Override
    public void mathVitC() {
        try {
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
        } catch (Exception e) {
            System.out.println("Введен неверный тип данных");
        }
    }

}
