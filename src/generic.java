
import java.util.*;

//part 01
class Data{
    private Object object;

    public Data(Object object){
        this.object=object;
    }
    @Override
    public String toString(){
        //return (String) object; // this  will through an error because an object cannot be typecasted in java.
        return object.toString();
    }
    public Object getObject(){
        return object;
    }

}


//part 02
class Name{
    private String name;
    public Name(String Name){
        this.name = Name;
    }
    @Override
    public String toString(){
        return name;
    }
}


//part 03
class Generics<T>{
    private T data;
    public Generics (T data){
        this.data=data;
    }
    public T getGEN(){
        return data;
    }
}

//part 04
/*
     T - Type
     E - Element
     K - Key
     N - Number
     V - Value
 */
class doublegen<K,V>{
    private K key;
    private V value;
    public doublegen(K key,V value){
        this.key=key;
        this.value=value;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
    @Override
    public String toString(){
        return "{Data{ Key : " +key+" Value : " + value+"} }";
    }
    //Part 06 - Bounded type in generic.
    public <N extends Number,E extends Name> void display(N number,E element){
        System.out.println("Number: " +number + " Element: "+element);
    }
}

//Part 05
class genmethod{
    public <E> void printListData(List<E> list){
        for(E data : list){
            System.out.println(data);
        }
    }
    public <E> void printArrayData(E[] array){
        for(E data : array){
            System.out.println(data);
        }
    }
}
public class generic {
    public static void main(String[] args){
        System.out.println("hello world");
        List<Data> a = new LinkedList<>();
        a.add(new Data("vinay"));
        a.add(new Data(123));
        a.add(new Data(1.00));
        a.add(new Data(false));
        a.add(new Data(new Name("vinay jadaun")));
        System.out.println(a);


        //This will return an object of String type, but the catch is the object is still of object type,
        //So if we try to insert the object into an String data type,(this will through and error).
        //But if we use the object.toString(); method this will convert the actual object to String data type.

        Data x = new Data("hello world");
        //String c = x.getObject();// this will through an error because, we are trying to insert object into the String datatype.
        //String f = x;// this will through an error because, we are trying to insert object into the String datatype.
        System.out.println(x);
        String e = x.toString();// this will not through any error because here the object is converted to the String data type internally.
        System.out.println(e);

        // the thing written below may or may not through an error because internally JVM does so many toString() method call there may sometimes it can interupt the normal flow of application.
        Data y = new Data(new Name("capgemini"));
        System.out.println(y.getObject());



        //Generics official syntax object wise, in standard used <T> which means Type.
        Generics first = new Generics("hello world 1");
        String str1 = first.getGEN().toString();
        System.out.println(first.getGEN());
        System.out.println(str1);

        //Generics used as parameterized object of String. so that no object.toString() method is required.
        Generics<String> second = new Generics<>("hello world 2");
        String str2 = second.getGEN();
        System.out.println(second.getGEN());
        System.out.println(str2);

        //Generics used as paramterized object of Integer. so that no object.toString() method is required.
        Generics<Integer> third = new Generics<>(123);
        int str3 = third.getGEN();
        System.out.println(third.getGEN());
        System.out.println(str3);

        //doublegen is generic class where two generic parameter is used which is key value pair.
        //object.toString() method is used to print the valaues of the actual object by System.out.println();
        doublegen<Integer,String> s = new doublegen<>(0,"ayan haque");
        System.out.println(s);

        //Here is the overview of Generic methods in java, which takes list as input and print all the value of it, despite of the object type.
        List<Integer> lone = new LinkedList<>();
        lone.add(0);
        lone.add(1);
        lone.add(2);
        lone.add(3);
        lone.add(4);
        lone.add(5);
        new genmethod().printListData(lone);

        //This is the Generic method which can print any type of array given to it.
        String[] arr = {"hello","world"};
        new genmethod().printArrayData(arr);

        // Generic bounded type which bound the object to accept some specific bound type of data.
        //s.display("hello wrold","vinay jadaun");//this will through error since we extended the left with Number class.
        s.display(01,new Name("vinay jadaun"));//this will not through not error because it is accepting the right parameter object type.


    }
}
