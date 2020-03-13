package taskException;
import java.lang.*;
public class FiftyPercentException {
    public static void main(String[] args) throws Exception {
        try{
            Percent();
        }
        catch (Exception e) {
            System.out.println("i = 0, ошибка: " + e);
        }
        finally {
            System.out.println("i не может иметь значение = 0");
        }
    }
    public static void Percent() throws Exception{
            int i = (int) (Math.random() * 2);
            if (i == 0){throw new NullPointerException();}
           }
}
