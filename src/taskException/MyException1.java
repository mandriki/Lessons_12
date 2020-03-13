package taskException;
import java.io.*;
import java.lang.*;
public class MyException1  {
    public static void main(String[] args) throws RuntimeException {
        System.out.println("Запуск отлова деления на ноль");
        myExc1();
        System.out.println("Отловили исключение "+  myExc2());
        System.out.println(" \"Stack trace\", деление на ноль");
    }
    static double myExc2() throws RuntimeException {
        int x = 0, y = 0;
        return (double)x / y;
    }
    static void myExc1() throws RuntimeException{
        try {
           myExc2();
        }
        catch (RuntimeException e) {
            e.printStackTrace();
        }
    }


}
