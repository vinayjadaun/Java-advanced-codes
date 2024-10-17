import java.util.*;
class Dataa extends Thread{
    private int threadno;
    public Dataa(int threado){
        this.threadno=threadno;
    }
    synchronized public void run() {
        try{
            for(int i=0;i<10;i++){
                sleep(500);
                System.out.println("This thread no: - "+threadno+" iterration is : - "+i);
            }
        }catch(Exception e){
            System.out.println(e.fillInStackTrace());
        }

    }
}

class Dataaa implements Runnable{
    private int threadNo;
    synchronized public void run(){
        for(int i=0;i<10;i++){
            System.out.println("TheadNo: "+threadNo+" iteration: "+i);
        }
    }
}
public class threadworking {
    public static void main(String[] args){
        //Thread creation by extending the Thread class.
        System.out.println("hello world");
        Dataa a = new Dataa(1);
        Dataa b = new Dataa(2);
        long curr = System.currentTimeMillis();
        //without calling threads;
        a.run();
        b.run();

        //with calling threads;
        a.start();
        b.start();
        long after = System.currentTimeMillis();
        System.out.println("Total time taken: - "+(after-curr));




        //Thread creation by runnable interface which much optimized to used at the place of extending the thread class.
        Thread a2 = new Thread(new Dataaa());
        Thread b2 = new Thread(new Dataaa());
        a2.start();
        b2.start();


        //Anonymus Thread creation in java.
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("hello world "+i);
                }
            }
        }).start();
    }
}
