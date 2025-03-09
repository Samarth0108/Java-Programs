import java.util.*;

class MapDemo1{
    public static void main(String args[]){
        Map<Character, Integer> m =new HashMap<Character,Integer>();
        m.put('A',1);
        m.put('B',2);
        m.put('C',3);
        System.out.println(m);
        System.out.println("C value :"+m.get('C'));
        System.out.println("D value :"+m.get('D'));
        System.out.println("E default value :"+m.getOrDefault('E', 5)+1);
    }
}