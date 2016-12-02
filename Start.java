package exp;

/**
 * Created by RogueBoy on 01.12.2016.
 */
public class Start extends PracIf{ //наследование класса Start от PracIf

    public static void main(String args[]) {

        System.out.println("Hi man, it's program  - future java");
        PracIf cl = new PracIf(); //создание обьекта


        System.out.println(cl.Calcul()); //вывод вызова метода Calcul
        System.out.println(cl.Calcul2()); //вывод вызова меотода Calcul2


    }
}
