class StringBufferDemo{
    public static void main(String args[]){

        String s1="Welcome";
        StringBuffer sb=new StringBuffer("java");
        StringBuffer sb1=new StringBuffer(s1);

        char ch []={'a','m','i','t'};
        //String sb2= new StringBuffer(ch); (will give error)

        System.out.println(sb);
        System.out.println(sb1);
        //System.out.println(sb2);

        System.out.println("===========sb object=======");
        System.out.println("sb="+sb);
        sb.append(" is great.");

        System.out.println("after sb append :"+sb);
        System.out.println("insert method: "+sb.insert(3,"CSE"));
        System.out.println("reverse : "+sb.reverse());


    }
}