class String_1{
    public static void main(String args[]){
        String s1="java";
        String s2= new String("java");
        System.out.println("s1="+s1);
        System.out.println("s2= "+s2);

        System.out.println(s1==s1);
        System.out.println(s1.equals(s2));

        System.out.println("Uppercase : "+s1.toUpperCase());
        System.out.println("Replace :"+s1.replace('j','z'));
    }
}