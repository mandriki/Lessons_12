package taskException;
import java.lang.*;
public class MyException2 {
    public static void main(String args[]) {
        int i = 1;
        try {
            myException(i);
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
    static void myException(int i) throws Exception {
        if (i == 1)
            throw new Exception("Ошибка i равно " +i);
        else
            System.out.println("Число = "+ i);
    }


}
