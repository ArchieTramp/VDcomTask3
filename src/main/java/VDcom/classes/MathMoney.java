package VDcom.classes;

import VDcom.interfaces.MathMoneyInterface;

import java.util.Scanner;

/**
Класс просчета зависимостей валют друг от друга
 */

public class MathMoney implements MathMoneyInterface {


    @Override
    public void mathMoney() {
        try {
            double gbp;
            double usd;
            double rub;
            double euro;
            System.out.println("How many EUROs?");
            Scanner scanner = new Scanner(System.in);
            euro = scanner.nextDouble();
            gbp = euro * 0.92;
            usd = gbp / 0.76;
            rub = usd * 73.15;
            // способ выше удобен тем, что понятнее зависимости, но возможны и подходы ниже, хотя дают меньше информативности
//        rub = 0.92 * 73.15 * euro / 0.76;
//        rub = 88.55 * euro;
            System.out.println(euro + " EURO = " + rub + " RUB");
        } catch (Exception e) {
            System.out.println("Введен неверный тип данных");
        }
    }
}
