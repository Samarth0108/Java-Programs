import java.util.Scanner;
class Sum2{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a[]=new int[5];
        int sum=0;
        System.out.println("Enter the elements:");
        for(int i=0;i<5;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Given elements are:");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
        System.out.println("Sum is:"+sum);
    }
}