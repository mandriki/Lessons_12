package taskException;
import java.io.*;
import java.lang.Exception;
public class MyException  {
    public static void main(String[] args) throws Exception {
        System.out.println("Запуск отлова деления на ноль");
        myException1();
        System.out.println("Отловили исключение "+  myException2());
        System.out.println(" \"Stack trace\", деление на ноль");
//      int x = 5, y = 0;
//      System.out.println( (double)x / y);
    }
    static double myException2() throws Exception {
      int x = 5, y = 3;
      return (double)x / y;
         }
     static void myException1() throws Exception{
        try {
            myException2();
        }
        catch (Exception err) {
            err.printStackTrace();


        }
    }


}
