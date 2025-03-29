/* 
 * n=5
 * *
 * **
 * ***
 * ****
 * *****
 */
 public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            try {
                Thread.sleep(300); // Adding delay for visual effect
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Thread.sleep(200);
            System.out.println();
        }
    }
}