
import java.util.*;

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
    }
}
