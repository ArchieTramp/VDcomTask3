package VDcom.classes;

import VDcom.interfaces.MathByteInterface;

/**
 * Класс просчитывающий зависимости цифровой части уравнения
 */

public class MathByte implements MathByteInterface {
    @Override
    public double mathByte(double kB) {

        double kilobyte;
        double bit;
        double byter;

        kilobyte = kB;
        byter = kilobyte * 1024;
        bit = byter * 8;

        return bit;


    }
}
