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
