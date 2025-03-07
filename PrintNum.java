import java.util.*;

public class PrintNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Object> dataList = new ArrayList<>();
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine();                      // newline
        
        System.out.println("Enter " + n + " elements (any type):");
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            dataList.add(input);
        }
        
        System.out.println("\nStored Data:");
        for (Object data : dataList) {
            System.out.println(data);
        }
        
        scanner.close();
    }
}