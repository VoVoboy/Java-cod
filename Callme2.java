package Step;

/**
 * Created by RogueBoy on 11.12.2016.
 */
public class Callme2 {
    synchronized void call(String msg){
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}
class Caller implements Runnable {
    String msg;
    Callme2 target;
    Thread t;

    public Caller(Callme2 targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run(){
        target.call(msg);
    }
}
class Synh {
    public static void main(String args[]){
        Callme2 target = new Callme2();
        Caller ob1 = new Caller(target, "Добро пожаловать");
        Caller ob2 = new Caller(target, "в синхронизированный");
        Caller ob3 = new Caller(target, "мир!");

        //ожидать завершения потока исполнения
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch(InterruptedException e){
            System.out.println("Прервано");
        }
    }
}