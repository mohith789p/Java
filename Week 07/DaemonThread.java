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
