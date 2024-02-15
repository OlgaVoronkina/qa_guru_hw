package jv;

public class Lesson6HW {
    public static void main(String[] args) {
        //диапазоны типов данных
        byte varBite = 100; //   -128 - 127
        short varShort = 2500; // -32768 - 32767
        int varInt = 2147483640; // -2147483648 - 2147483647
        long varLong = 9223372036854775800L; // –9 223 372 036 854 775 808 - 9 223 372 036 854 775 807
        float varFloat = 1.5F; //-3.4E+38 - 3.4E+38
        double varDouble = 1.23; // -1.7E+308 - 1.7E+308
        char varChar = 'O'; //одиночный символ
        String varString = "Olya";

        //поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
        System.out.println(additionInt(100, 25));
        System.out.println(additionInt(2147483647, 1)); //переполнение
        System.out.println(subtractionShort((short)30000, (short)6000));
        System.out.println(multiplicationByte((byte)10, (byte)5));
        System.out.println(multiplicationByte((byte)64, (byte)3)); //выход за границы диапазона
        System.out.println(divisionLong(9223372036854775807L, 2));
        System.out.println(remainderDivisionInt(15, 4));


        if(varString!=null && varInt>100000){
            System.out.println("Case1 - All conditions executed");
            }
        else {
            System.out.println("Case1 - Condition AND didn't execute");
            }

        if(varString!=null && varInt>100000){
        System.out.println("Case2 - All conditions executed");
            }
        else {
        System.out.println("Case2 - Condition AND didn't execute");
            }

        if(varString==null || varInt<100000){
        System.out.println("Case2 - At least one condition executed");
            }
        else {
        System.out.println("Case3 - Condition OR didn't execute");
            }


        practiceSwitchCase("multiplication1", 10, 8);



        //попробовать вычисления комбинаций типов данных (int и double)
        System.out.println(additionNumberDouble(5, 5.6));
        System.out.println(additionNumberInt(5, 5.6));
        System.out.println(additionNumberIntToDouble(5, 8));
        System.out.println(additionNumberDoubleToInt(5.2, 5.6));
}


    public static int additionInt(int x, int y) {
        return x + y;
    }
    public static short subtractionShort(short x, short y) {
        return (short) (x - y);
    }
    public static byte multiplicationByte(byte x, byte y) {
        return (byte) (x * y);
    }
    public static long divisionLong(long x, long y) {
        return x / y;
    }
    public static int remainderDivisionInt(int x, int y) {
        return x % y;
    }


    public static double additionNumberDouble(int x, double y) {
        return x + y;
    }
    public static int additionNumberInt(int x, double y) {
        return (int) (x + y);
    }
    public static double additionNumberIntToDouble(int x, int y) {
        return (x + y);
    }
    public static int additionNumberDoubleToInt(double x, double y) {
        return (int) (x + y);
    }


    public static void practiceSwitchCase(String action, int x, int y) {
        switch (action) {
            case ("addition"):
                System.out.println("Result = " + (x + y));
                break;
            case ("subtraction"):
                System.out.println("Result = " + (x - y));
                break;
            case ("multiplication"):
                System.out.println("Result = " + (x * y));
                break;
            case ("division"):
                System.out.println("Result = " + (x / y));
                break;
            default:
                System.out.println("Something went wrong");
        }
    }

}
