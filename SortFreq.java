import java.util.*;

class SortFreq{
    //input n no. of array from user(of any type) and sort the given array according to frequency of every digit 
    //and make unique output digit also. i.e the element with the lowest freq will come up first in the output and with max will come at last
    // input1: 11112223
    //output1 : 321

    //input2 : 111aa***
    //output2 : a1*

    //input3 : java
    //output3: jva

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : arr){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>(){
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2){
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for(Map.Entry<Character, Integer> entry : list){
            System.out.print(entry.getKey());
        }
    }
    
}