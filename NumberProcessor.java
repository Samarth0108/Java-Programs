import java.util.Scanner;
public class NumberProcessor {
    static int a; 
    int b;      
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    private int countPrime() {
        int count = 0;
        for (int i = a + 1; i < b; i++) { 
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    private int countNonPrime(final int thirdNum) { 
        int count = 0;
        for (int i = b + 1; i < thirdNum; i++) { 
            if (!isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        NumberProcessor obj = new NumberProcessor();
        System.out.print("Enter the static number: ");
        a = s.nextInt();
        System.out.print("Enter the non-static number: ");
        obj.b = s.nextInt();
        System.out.print("Enter the final number: ");
        final int thirdNum = s.nextInt();
        int primeCount = obj.countPrime();
        int nonPrimeCount = obj.countNonPrime(thirdNum);
        System.out.println("Prime numbers: " + primeCount);
        System.out.println("Non-prime numbers: " + nonPrimeCount);
        System.out.println("Final output: " + (primeCount + nonPrimeCount));

    }
}