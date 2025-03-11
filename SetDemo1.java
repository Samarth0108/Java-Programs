import java.util.*;

class SetDemo1{
    // print the frequency of every character among the given input string
    public static void main(String[] args){
        String str = "122333";
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}