import java.util.*;

class SetDemo{
    // by using list set remove duplicate elements from list
    // eg : n = 112233, output = 123
    public static void main(String args[]){
        List<Integer>list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);    
        list.add(3);
        Set<Integer>set = new HashSet<Integer>(list);
    }
}