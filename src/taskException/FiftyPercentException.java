package taskException;
import java.lang.*;
public class FiftyPercentException {
    public static void main(String[] args) throws Exception {
        try{
            Percent(1,10);
            //throw new NullPointerException();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Все четные цифры ошибка");
        }
    }
    public static int Percent(int i, int n) throws Exception{
        for( i = i ; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
            } else
                 {
                    System.out.println(i);
//                    throw new NullPointerException();
                }
        }
        return i;
    }
}
