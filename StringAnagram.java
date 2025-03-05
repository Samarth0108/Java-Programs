import java.util.Arrays;

public class StringAnagram{
    public static boolean strAnag(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        return Arrays.equals(charArr1, charArr2);
    }
    public static void main(String[] args) {
        String str1 = "welcome";
        String str2 = "emoclec";
        if (strAnag(str1, str2)) {
            System.out.println("They are Anagrams !!");
        } else {
            System.out.println("They are not Anagrams !!");
        }
    }
}