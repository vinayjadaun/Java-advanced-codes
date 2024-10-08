import java.sql.SQLOutput;
import java.util.*;
 class Intclass{
    public int value;
    public Intclass(int val){
        this.value=val;
    }
    public void setvalue(int val){
        this.value=val;
    }
    public int getvalue(){
        return value;
    }

}


public class boxingandunboxing {
    public static void main(String[] args){
        System.out.println("hello world");
        //deprecated in java 9 and can be possibly removed in future so don't use it.
        Integer a = new Integer(12);
        // use this instead
        Integer b = Integer.valueOf(12);
        System.out.println(b);
        System.out.println(a);

        //Boxing:= Boxing mean converting primitive data types to its corresponding wrapper classess.

        //Unboxing:= Unboxing mean converting wrapper classes object to its corresponding primitive data types.


        //Auto boxing and unboxing
        ArrayList<Integer> e = new ArrayList<>();
        e.add(12); //boxing(auto)
        e.add(54); //boxing(auto)
        System.out.println(e.get(0)); //unboxing(auto)
        System.out.println(e.get(1)); //unboxing(auto)

        //Manual Boxing and Unboxing
        ArrayList<Intclass> d = new ArrayList<>();
        d.add(new Intclass(12)); //boxing
        d.add(new Intclass(456)); //boxing
        System.out.println(d.get(0).getvalue()); //unboxing
        System.out.println(d.get(1).getvalue()); //unboxing


        //How Compiler compile and does the auto boxing and unboxing inside view.
        ArrayList<Double> f = new ArrayList<>();
        




    }
}
