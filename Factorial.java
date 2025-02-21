import java.math.BigInteger;
import java.util.Scanner;
class Factorial{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=s.nextInt();

        BigInteger fact=new BigInteger("1");
        while(n>1){
            fact = fact.multiply( new BigInteger(""+n));
            n--;
        }
        System.out.println("Factorial:"+fact);
    }
}