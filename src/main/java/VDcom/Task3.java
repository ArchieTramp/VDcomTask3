package VDcom;

import VDcom.classes.MathByte;
import VDcom.classes.MathGir;
import VDcom.classes.MathPir;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

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

        String outputVitC = "1024 byte = 1 kilobyte \n" +
                "\n" +
                "2 bar = 12 ring \n" +
                "\n" +
                "16.8 ring = 2 pyramid \n" +
                "\n" +
                "4 hare = 1 cat \n" +
                "\n" +
                "5 cat = 0.5 giraffe \n" +
                "\n" +
                "1 byte = 8 bit \n" +
                "\n" +
                "15 ring = 2.5 bar\n";

        System.out.println(outputVitC);

        System.out.println("1 pyramid = ? bar\n" +
                "1 giraffe = ? hare\n" +
                "0.5 byte = ? cat\n" +
                "2 kilobyte = ? bit");

        MathGir mvc = new MathGir();
        MathByte mbt = new MathByte();
        MathPir mpr = new MathPir();

// блок try-catch для отлова неверного ввода данных
        try {
            // в задании сказано о вводе данных через стандартные методы, пусть будет через сканер
            Scanner sc2 = new Scanner((System.in));
            System.out.println("How many piramids do you have transfer in bars?");
            double pir = sc2.nextDouble();

            Scanner sc1 = new Scanner((System.in));
            System.out.println("How many giraffes do you have transfer in hares?");
            double gir = sc1.nextDouble();

            Scanner sc3 = new Scanner((System.in));
            System.out.println("How many cats do you have transfer in bytes?");
            double cats = sc3.nextDouble();

            Scanner sc = new Scanner((System.in));
            System.out.println("How many kilobytes do you have transfer in bits?");
            double kB = sc.nextDouble();

//форматирование выходных значения, для более красивого вывода значений
            DecimalFormat df = new DecimalFormat("#.###");

// вывод данных осуществляется сразу с выполнения методов по конвертации дабы не плодить лишние переменные
            System.out.println(pir + " pyramid = " + df.format(mpr.mathPir(pir)) + " bar\n" +
                    gir + " giraffe = " + df.format(mvc.mathGir(gir)) + " hare\n" +
                    "Conversion not possible.\n" + //почему именно так, подробно расписал в readme файле
                    kB + " kilobyte = " + df.format(mbt.mathByte(kB)) + " bit");
        } catch (InputMismatchException e) {

            System.out.println("необходимо ввести цифровые данные");
        }


    }
}
