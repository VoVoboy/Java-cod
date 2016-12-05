package exp;

/**
 * Created by RogueBoy on 05.12.2016.
 */

import java.util.Scanner;

public class Eng {
    Scanner sc = new Scanner(System.in);

    String q;

    boolean w;

    public String Writer() {


        System.out.println("Write is a text");



        do {
                if (sc.hasNextLine()) {

                    q = sc.nextLine();


                if (q != "exit") {
                    System.out.println("Your text: - >>" + q);
                    w = true;
                    q = "";

                } else if (q == "exit") {
                    System.out.println("Programm is down, command --> " + q);
                    w = false;
                }


                } else {
                    w = false;
                }
        }while (w == true);

        return null;
    }

}
