# Exercise - 7

> ## a1) Write a JAVA program that creates threads by extending Thread class.First thread display “Good Morning “every 1 sec, the second thread displays “Hello “every 2 seconds and the third display “Welcome” every 3 seconds.

## Code

```java
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
```

## Output

```text
Good Morning
Welcome
Hello
Good Morning
Hello
Good Morning
Welcome
Good Morning
Hello
Good Morning
Good Morning
Welcome
Hello
............
```

> ## a2) Write a JAVA program that creates threads by implementing Runnable. First thread display “Good Morning “every 1 sec, the second thread displays “Hello “every 2 seconds and the third display “Welcome” every 3 seconds.

## Code

```java

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
```

## Output

```text
Good Morning
Hello
Welcome
Good Morning
Hello
Good Morning
Welcome
Good Morning
Hello
Good Morning
Good Morning
Hello
Welcome
............
```

> ## b) Write a program illustrating is Alive and join ().

## Code

```java
class MyThread extends Thread {
    public void run() {
            System.out.println("Therad is starting.");
            for(int i=0;i<5;i++){
                System.out.println("Thread i = "+ i);
            }
            System.out.println("Thread is ending.");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();

        try {
            System.out.println("Starting thread...");
            thread.start();
            System.out.println("Is thread alive before join()? " + thread.isAlive());
            thread.join();
            System.out.println("Is thread alive after join()? " + thread.isAlive());

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread ending.");
    }
}

```

## Output

```text
Starting thread...
Therad is starting.
Is thread alive before join()? true
Thread i = 0
Thread i = 1
Thread i = 2
Thread i = 3
Thread i = 4
Thread is ending.
Is thread alive after join()? false
Main thread ending.
```

> ## c) Write a Program illustrating Daemon Threads.

## Code

```java
class DaemonThread extends Thread {
    public void run() {
        System.out.println(getName() + (isDaemon() ? " (Daemon)" : " (User)") + " starting.");
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(500);
                System.out.println(getName() + " count: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " ending.");
    }

    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.setName("DaemonThread");

        DaemonThread userThread = new DaemonThread();
        userThread.setDaemon(false);
        userThread.setName("UserThread");

        daemonThread.start();
        userThread.start();

        try {
            userThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread ending.");
    }
}

```

## Output

```text
UserThread (User) starting.
DaemonThread (Daemon) starting.
UserThread count: 1
DaemonThread count: 1
UserThread count: 2
DaemonThread count: 2
UserThread count: 3
DaemonThread count: 3
UserThread count: 4
DaemonThread count: 4
UserThread count: 5
UserThread ending.
Main thread ending.
```
