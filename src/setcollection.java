import java.util.*;
// Set Collection useage with the generic object functioanlity;

//This is the Double Generic class with key,value pair;
class Dgen<K,V>{
    private K key;
    private V value;
    public Dgen(K key,V value){
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
        return "Key : "+key+" Value : "+value;
    }
}
public class setcollection {
    public static void main(String[] args){


        System.out.println("hello worlod");
        Set<Integer> a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(1);
        System.out.println(a);

        // we are using this comparator Interface so that the object can be compaable on a certain paramerter like in this case we used getKey();
        Comparator<Dgen<Integer,String>> comparater = new Comparator<Dgen<Integer,String>>(){
            @Override
            public int compare(Dgen<Integer,String> obj1,Dgen<Integer,String> obj2){
                if(obj1.getKey()<obj2.getKey()){
                    return -1;
                }else if(obj1.getKey()>obj2.getKey()){
                    return 1;
                }else{
                    return 0;
                }
            }
        };

        // HashSet---
        Set<Dgen<Integer,String>> b = new HashSet<>();
        b.add(new Dgen<>(1,"vinay"));
        b.add(new Dgen<>(2,"jadaun"));
        System.out.println(b);

        // LinkedHashSet---
        Set<Dgen<Integer,String>> c = new LinkedHashSet<>();
        c.add(new Dgen<>(1,"vinay"));
        c.add(new Dgen<>(2,"jadaun"));
        System.out.println(c);

        // TreeSet---
        //TreeSet automatically sort the elements on the basis of value but here it cannot be possible to compare this two object so we are passing the new comparator in this .
        Set<Dgen<Integer,String>> d = new TreeSet<>(comparater);
        d.add(new Dgen(1,"vinay"));
        d.add(new Dgen(2,"jadaun"));
        System.out.println(d);
    }
}
