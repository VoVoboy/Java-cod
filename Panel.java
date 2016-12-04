package exp;

/**
 * Created by RogueBoy on 04.12.2016.
 */
import java.util.Scanner;

public class Panel extends Engine{


    Scanner sayer = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    int q;

    Engine p = new Engine();




    public int Choice() {
        while (true) {
            System.out.println("Введи команду");

            switch ("add") {
                case "add":
                    System.out.println("Process: addElement");
                    System.out.println("add Element -->");
                    if (sc.hasNextInt()) {
                        q = sc.nextInt();
                        p.addElement(q);
                        System.out.println(tr);

                    }
                    break;

                case "delete":
                    System.out.println("Process: deleteElement");
                    p.deleteElement();
                    break;

                case "readTop":
                    System.out.println("Process: readTop");
                    p.readTop();
                    break;

                case "isEmpty":
                    System.out.println("Process: isEmpty");
                    p.isEmpty();
                    break;

                case "isFull":
                    System.out.println("Process: isFull");
                    p.isFull();
                    break;
            }



        }

    }
}
