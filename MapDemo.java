import java.util.*;

class MapDemo{
    public static void main(String args[]){
        System.out.print("Enter any string : ");
        String input = new Scanner(System.in).next();
        System.out.println("Given string : "+input);

        Map m = new HashMap(); //non generic
        m.put("Amit",1001);
        m.put("Sumit",1002);
        m.put("Anil",1003);
        System.out.println("First Map:"+m);

        Map<Character, Integer> m1 = new HashMap<Character, Integer>(); // generic
        for(char ch: input.toCharArray()){
            m1.put(ch,m1.getOrDefault(ch,0)+1);
        }
        System.out.println("Second map:"+m1);

        //now the output should be:-
        //key : j and value : 1
        //key : a and value : 2
        //key : v and value : 1
        for(Map.Entry<Character, Integer> entry : m1.entrySet()){
            System.out.println("key : "+entry.getKey()+" and value : "+entry.getValue());
        }
        
        //by applying iterator on map
        Iterator<Map.Entry<Character, Integer>> itr = m1.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Character, Integer> entry = itr.next();
            System.out.println("key : "+entry.getKey()+" and value : "+entry.getValue());
        }
    }
}