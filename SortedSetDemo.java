
import java.util.*;

class SortedSetDemo{
    public static void main(String[] args) {
        SortedSet set = new TreeSet();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        System.out.println("Sorted  list is:"+set);

        SortedSet set1 = new TreeSet();
        String input="java";
        for(char c:input.toCharArray()){
            set1.add(c);
        }
        System.out.println("Sorted  list is:"+set1);
    }
}