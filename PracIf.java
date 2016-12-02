package exp;

/**
 * Created by RogueBoy on 01.12.2016.
 */
import java.util.Scanner; //импорт класса

public class PracIf {

    private Scanner satiety = new Scanner(System.in);//Переменная индикатор голода
    private Scanner energy = new Scanner(System.in);//Переменная индикатор енергии

    private int i;
    private int q;






    public String Calcul() { //Метод для преобразования вывода переменной satiety в строку

        System.out.println("Введите число");

        if(satiety.hasNextInt()) {
            i = satiety.nextInt();

            if (i <= 5 || i == 0) {
                String strSa=Integer.toString(i); //изменение типа переменной
                return strSa="Я хочу есть"; //возвращение значения

            } else {
                String strSa=Integer.toString(i); //изменение типа переменной
                return strSa="Я не голоден"; //возвращение значения

            }
        }


        return null;
    }

    public String Calcul2(){  //метод для преобразования вывода переменной energy в строку

        System.out.println("И ещё одно число");

        if(energy.hasNextInt()) {
            q = energy.nextInt();

            if (q <= 5 || q == 0) {
                String strEn=Integer.toString(q); //изменение типа
                return strEn="Я устал, и нужно поспать"; //возвращение значения

            } else {
                String strEn=Integer.toString(q); //изменение типа
                return strEn="Я готов к делам"; //возвращение значения

            }
        }
        return null;
    }


}

