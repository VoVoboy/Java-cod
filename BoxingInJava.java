package BoxingJava;

/**
 * Created by RogueBoy on 08.12.2016.
 */
public class BoxingInJava {
    public static void main(String args[]){
        Integer iOb = 100; // автоупаковка значения типа int
        int i = iOb; // автораспаковка
        System.out.println(i + " " + iOb); // вывод на экран: 100 100
    }
}
