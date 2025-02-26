package mypackage;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string:"); 
        String input = sc.nextLine(); 
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int sum = DifferenceSum(word);
            result.append(sum);
        }

        System.out.println(result.toString()); 
    }

    public static int DifferenceSum(String word) {
        int sum = 0;
        int length = word.length();

        for (int i = 0; i < (length + 1) / 2; i++) {
            char firstChar = word.charAt(i);
            char lastChar = word.charAt(length - 1 - i);

            if (i == length - 1 - i) {
                sum += Value(firstChar);
            } else {
                sum += Math.abs(Value(firstChar) - Value(lastChar));
            }
        }

        return sum;
    }

    private static int Value(char c) {
        return c - 'A' + 1;
    }
}