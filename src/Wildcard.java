import java.util.LinkedList;
import java.util.List;

class vehicle{
    private final int id;
    public vehicle(int id){
        this.id=id;
    }
    @Override
    public String toString(){
        return "Id of Vehicle is : "+id;
    }
}
class car extends vehicle{
    private final String model;
    public car(int id,String model){
        super(id);
        this.model=model;

    }
    @Override
    public String toString(){
        return super.toString()+" model is : "+model;
    }
}

public class Wildcard {
    public static void main(String[] args){
        System.out.println("hello world");
        car a = new car(1000000,"TATA CURVV");
        System.out.println(a);
        List<vehicle> li = new LinkedList<>();
        li.add(new vehicle(1));
        li.add(new vehicle(2));
        li.add(new vehicle(3));
        li.add(new vehicle(4));
        li.add(new car(01,"tata punch"));
        Wildcard.printInnerbound(li);
        Wildcard.printupperbound(li);




    }
    //<?> this is called wildcard when we don't knwo what kind of object is coming we use this so that the performance of application maintained or improved.
    //This is known as Uppesbound of the wildcard.
    public static void printupperbound(List<? extends vehicle> l){
        System.out.println("printing upperbound objects");
        for(vehicle a : l){
            System.out.println(a);
        }
    }
    //This is known as the Innerbound of the wildcard.
    public static void printInnerbound(List<? super vehicle> l){
        System.out.println("printing innerbound objects");
        for(Object a : l){
            System.out.println(a);
        }
    }
}
