// Multithreading by extends the Thread class.
/* 
 * i 1 to 10  ..project
 * j 1 to 10  ..listening songs
 * k 1 to 10  ..playing games
 */
class FirstTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Project =" + i);
        }
        System.out.println("Exit from first.");
    }
}
class SecondTask implements Runnable {
    public void run() {
        for (int j = 1; j <= 10; j++) {
            System.out.println("Listening songs =" + j);
        }
        System.out.println("Exit from second.");
    }
}
class ThirdTask implements Runnable {
    public void run() {
        for (int k = 1; k <= 10; k++) {
            System.out.println("Playing games =" + k);
        }
        System.out.println("Exit from third.");
    }
}

class ThreadDemo1{
    public static void main(String[] args) {
        FirstTask f = new FirstTask();  //born state
        SecondTask s = new SecondTask();  
        ThirdTask t = new ThirdTask();
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();

        // f.start();
        // s.start();
        // t.start();
        //Thread.sleep(10);
        System.out.println("I am the last statement.");
    }
}