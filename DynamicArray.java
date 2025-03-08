import java.util.*;
class DynamicArray{
    public static void main(String args[]){
        System.out.println("=============Output============");
        List l=new ArrayList();
        System.out.println("Enter the number of elements:");
        int n = new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            l.add(new Scanner(System.in).next());
        }
        System.out.println("=======Add more=======");
        System.out.println("1.Add");
        System.out.println("2.Exit");
        while (true) {
            System.out.println("Enter your choice:");
            int ch = new Scanner(System.in).nextInt();
            if (ch != 1 && ch != 2) {
                System.out.println("Wrong choice");
                System.out.println("Please select the right choice");
            } else {
                if (ch == 2) {
                    break;
                } else {
                    System.out.println("Enter the element:");
                    int e = new Scanner(System.in).nextInt();
                    l.add(e);
                }
            }
        }
        System.out.println("After adding more :"+l);
    }
}