import java.util.*;
class bracket {
    private char a='{';
    private char b='}';

   synchronized public void brackets() {
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                System.out.print(a);
            } else {
                System.out.print(b);
            }
        }
        System.out.println();
    }
}
public class synchoronizedThread {
    public static void main(String[] ars){
        System.out.println("hello world");

        //This is an example to make the thread synchorized
        //Note:- when we make annonymus object of bracket it will not work
//        System.out.println("This will not come in syncrozed manner");
        for(int i=0;i<5;i++){
        new Thread(new Runnable() {
            @Override
            public void run() {
                new bracket().brackets();
            }
        }).start();
        }
        //but when we create the object outside and share the same instance then its is synchrozed;
        bracket a = new bracket();
//        System.out.println("Now, This will come in synchrozied manenr");
        new Thread(new Runnable() {
            @Override
            public void run(){
                a.brackets();
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run(){
                a.brackets();
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run(){
               a.brackets();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run(){
                a.brackets();
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run(){
                a.brackets();
            }
        }).start();

    }
}
