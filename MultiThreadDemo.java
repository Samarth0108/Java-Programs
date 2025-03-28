class MyNewThread implements Runnable    //child thread
{
    Thread t;
    String name;
    MyNewThread(String name)
    {
        this.name=name;
        t=new Thread(this,name);
        //t=new Thread(this);
        System.out.println("Thread :"+t);
        t.start();
    }
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(name+": "+i);
            try{
                Thread.sleep(200);
            }
            catch(Exception e){}
        }
        System.out.println("Exit from Child.");
    }
}

class MultiThreadDemo {    //main thread
    public static void main(String[] args) {
        new MyNewThread("One");
        new MyNewThread("Two");
        new MyNewThread("Three");
    }
}