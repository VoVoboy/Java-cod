package AutoBoxingJava;

/**
 * Created by RogueBoy on 08.12.2016.
 */
public class AutoBoxUn {
    public static void main(String args[]){

        Integer iOb = 100; //создание обьекта с типом int, и присваиваем ем значение 100
        Double dOb = 98.6; // создание обьекта с типом double, и присваиваем ему значение 98.6

        dOb = dOb + iOb; // сложение разных по типу обьектов
        System.out.println("dOb after expression: " + dOb); //вывод результата на экран
    }
}
