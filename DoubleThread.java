class NewThread implements Runnable{  //child thread
    Thread t;
    NewThread(){
        t=new Thread(this);
        t.start();
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Child Thread:"+i);
        }
    }
}   

class DoubleThread{
    public static void main(String args[]){       //main thread
        new NewThread();
        for(int i=1;i<=10;i++){
            System.out.println("Parent Thread:"+i);
        }
    }
}