class Array2{
    public static void main(String args[]){
        int a[][]= new int[3][3];
        System.out.println("Enter the elements:");
        for(int i=-0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]= new java.util.Scanner(System.in).nextInt();
            }
            System.out.println("Given 2d array is:");
        }
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
