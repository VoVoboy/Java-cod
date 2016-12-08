package BoxingJava;

/**
 * Created by RogueBoy on 08.12.2016.
 */
public class AuBoxingJava {
    // Принимает параметр типа Integer и возвращает
    // значение типа int

    static int m(Integer v){
        return v;
    }
    public static void main(String args[]){
        Integer iOb = m(100);
        System.out.println(iOb);
    }

}
