package exp;

/**
 * Created by RogueBoy on 09.12.2016.
 */
//Создать второй поток исполнения
public class NewThread implements Runnable{
    String name;

    Thread t;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start();
    }
    public void run(){
        try {
            for(int i = 5; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завршен.");
    }
}
class MultiThreadDemo {
    public static void main(String args[]){
        new NewThread("Один");
        new NewThread("Два");
        new NewThread("Три");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершён.");
    }
}