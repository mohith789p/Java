// Using Thread class
class myThread extends Thread {
    String msg;
    int time;

    myThread(String msg, int time) {
        this.msg = msg;
        this.time = time;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(msg);
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class Exercise7A1 {
    public static void main(String[] args) {
        myThread t1 = new myThread("Good Morning", 1000);
        myThread t2 = new myThread("Hello", 2000);
        myThread t3 = new myThread("Welcome", 3000);

        t1.start();
        t2.start();
        t3.start();
    }
}