import java.util.*;
class ListDemo{
    public static void main(String... Sharda){
        ArrayList l = new ArrayList(); //non generic list
        l.add(1);
        l.add("CSE");
        l.add('A');
        System.out.println("Non generic List :"+l);

        List<String> l1=new ArrayList<String>();  //generic list
        l1.add("CSE");
        l1.add("3");
        l1.add("A");
        l1.add("Sam");
        System.out.println("Generic List :"+l1);

        List l3 = new ArrayList(Arrays.asList(1,2,3,4,5));
        System.out.println("Third List :"+l3);

        List l4 = List.of(6,7,8,9,10);
        System.out.println("Fourth List :"+l4);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list :");
        int n = sc.nextInt(); //n=456

        List<Integer> l5 = new ArrayList<Integer>();
        // no to Array List
        int n1 = Integer.parseInt(""+new StringBuffer(""+n).reverse());   // to reverse the number obtained in the list in its originla order
        while(n1>=1){
            l5.add(n1%10);
            n1=n1/10;
        }
        System.out.println("Fifth List :"+l5);

        System.out.println("Enter any String :");
        String input = sc.next();

        // convert string to array list
        List<String> l6 = new ArrayList<String>();
        for(int i=0;i<input.length();i++){
            l6.add(""+input.charAt(i));
        }
        System.out.println("Sixth List :"+l6);

        // convert string to upper case like w-W, e-E, l-L, c-C, o-O, m-M, e-E

        Iterator i = l6.iterator();
        System.out.println("Output:");
        while(i.hasNext()){
            String s = (String)i.next();
            String input1 = null;
            System.out.println(input1+": "+input1.toUpperCase());
        }

        int a[]={1,2,3,4,5};
        for(int x:a){
            System.out.println(x);
        }

        for(int x:l5){
            System.out.println(x);
        }
        Arrays.sort(a);
        System.out.println("Sorted Array :");
        for(int x:a){
            System.out.println(x);
        }
    }
}