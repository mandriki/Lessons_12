package taskException;
/**Объявите переменную со значением null. Вызовите метод у этой переменной.
        Отловите возникшее исключение.*/
import java.lang.Exception;
public class Main {

    public static void main(String[] args) throws Exception {
        String a = null;
        try {
            if (a.equals("null")) {
                System.out.println("a = \"null\"");
            } else {
                System.out.println("a не равно null");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException, a = null ");
        }
        /**Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.*/
        int[] mas = new int[3];
        try {
            mas[4] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException, выход за пределы массива, масссив длинна " + mas.length);
        }
        //Integer primer =new  Integer(null);
       try {
           Integer primer =new  Integer(null);
            System.out.println("Правильное число");
        } catch (NumberFormatException e) {
             System.out.println("NumberFormatException, Обвал - число null");
             e.printStackTrace();
             System.out.println(e);
        }
    }

}

/**1.
        2.
        3.	Создать собственный класс-исключение - наследник класса Exception.
        Создать метод, выбрасывающий это исключение.
        Вызвать этот метод и отловить исключение. Вывести stacktrace в консоль.
        4.	Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException.
        Добавить вконструктор своего класса возможность указания сообщения.
        5.	Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное, указав в качестве причины отловленное.
        6.	Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
        Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
        7.	Написать метод, который в 50% случаев бросает исключение.
        Вызвать этот метод в конструкции try-catch-finally. Протестировать работу блока finally.*/
