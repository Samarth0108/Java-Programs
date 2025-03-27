class SingleThread {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        System.out.println(t1);
            // childThreadname - def Pri - parent Thread name
        t1.setName("sec-j"); //changing the name of the child thread
        System.out.println(t1);
    }
}