
 // Using Runnable
class myrunnable implements Runnable {
    String msg;
    int time;

    myrunnable(String msg, int time) {
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

public class Exercise7A2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new myrunnable("Good Morning", 1000));
        Thread t2 = new Thread(new myrunnable("Hello", 2000));
        Thread t3 = new Thread(new myrunnable("Welcome", 3000));

        t1.start();
        t2.start();
        t3.start();
    }
}