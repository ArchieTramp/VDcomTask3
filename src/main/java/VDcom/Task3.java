package VDcom;

import VDcom.classes.MathMoney;
import VDcom.classes.MathVitC;
import VDcom.interfaces.MathMoneyInterface;
import VDcom.interfaces.MathVitCInterface;

/**
 * @author Artur Gilyazov
 * задание 3 для VDcom
 * Дан перевод некоторых величин в формате a V = b W, где a, b – числа; V, W –
 * названия величин (могут быть любые), следом дана последовательность с
 * неизвестным вторым числом в формате a V = ? W, необходимо найти величину,
 * обозначенную в пропорции знаком вопроса. Ввод данных и вывод результата
 * осуществляются через стандартные потоки ввода/вывода.
 * Выходной формат a V = b W. Каждое равенство пишется на отдельной строке.
 * Постарайтесь максимально продемонстрировать свои знания ООP/OOD.
 * Код должен соответствовать критериям коммерческого качества кода.
 */

public class Task3 {


    public static void main(String[] args) {
        String outputMoney = "1 EURO = 0,92 GBP\n1 USD = 73,15 RUB\n1 USD = 0,76 GBP";
        String outputVitC = "0,012 g VitC = 1 apple\n3 apple = 1.2 lime\n1 lemon = 1,5 lime";
        System.out.println(outputMoney+"\n"+outputVitC);
        MathMoney mm = new MathMoney();
        mm.mathMoney();
        MathVitC mvc = new MathVitC();
        mvc.mathVitC();
        }
}
