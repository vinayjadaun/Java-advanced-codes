import java.util.*;
class code implements Comparable<code>{
    private int a;
    private int b;

    public code(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int geta(){
        return a;
    }
    public int getb(){
        return b;
    }

    @Override
    public String toString(){
        return "value of A is : "+a+" value of B : "+b;
    }

    @Override
    public int compareTo(code o) {
        if(this.a>o.geta())return 1;
        else return -1;
    }
}
public class maptry {
    public static void main(String[] args){
        System.out.println("hello world");
        Map<Integer,String> m = new HashMap<>();
        m.put(1,"vinay");
        m.put(2,"ayan");
        m.put(3,"saurabh");
        m.put(4,"vivek");
        m.put(5,"vishnu");
        System.out.println(m);

        //Iteration through Keyset();
        for(Integer key:m.keySet()){
            System.out.println("Key: "+key+" value: "+m.get(key));
        }

        //Iteration through entryset();
        for(Map.Entry<Integer,String> entry : m.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }

        //Iteration through Iterator();
        Iterator<Map.Entry<Integer,String>> s = m.entrySet().iterator();
        while(s.hasNext()){
            Map.Entry<Integer,String> temp = s.next();
            System.out.println(temp.getKey()+ " "+temp.getValue());
        }

        //comparator for sorting map;
        Comparator<Map.Entry<Integer,Integer>> u = (o1, o2) -> {
            if(o1.getValue()>o2.getValue()){
                return 1;
            }else if(o1.getValue()<o2.getValue()){
                return -1;
            }
            return 0;
        };
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,9);
        map.put(2,3);
        map.put(5,7);
        map.put(7,4);
        System.out.println(map);

        List<Map.Entry<Integer,Integer>> l = new ArrayList<>(map.entrySet());

        l.sort(u);
        System.out.println(l);


        //Sorting are going to be explixitly done by implementing the comparable interface by itself on the class.
        Map<code,Integer> m2 = new TreeMap();
        m2.put(new code(1,2),1);
        m2.put(new code(3,4),5);
        m2.put(new code(1,7),3);
        System.out.println(m2);




    }
}
