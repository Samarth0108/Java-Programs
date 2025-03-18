// Multithreading by extends the Thread class.
/* 
 * i 1 to 10  ..project
 * j 1 to 10  ..listening songs
 * k 1 to 10  ..playing games
 */
class First extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Project =" + i);
        }
        System.out.println("Exit from first.");
    }
}

class Second extends Thread {
    public void run() {
        for (int j = 1; j <= 10; j++) {
            System.out.println("Listening songs =" + j);
        }
        System.out.println("Exit from second.");
    }
}

class Third extends Thread {
    public void run() {
        for (int k = 1; k <= 10; k++) {
            System.out.println("Playing games =" + k);
        }
        System.out.println("Exit from third.");
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        First f = new First(); // born state
        Second s = new Second();
        Third t = new Third();
        f.start();
        s.start();
        t.start();


        System.out.println("Iam the last statemnt");
    }
}