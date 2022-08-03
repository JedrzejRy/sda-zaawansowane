package obiektowe.multithreading;

public class ThreadsDemo {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("Pozdrwoienia z osobnego wątku!");
                }
            }
        };

        Thread worker = new Thread(task);
        worker.start(); //start nie run!
        for (int i = 0; i < 10000; i++) {
            System.out.println("POZDROWIENIA Z MAIN");
        }

    }
}
