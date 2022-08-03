package obiektowe.multithreading.task1;

public class Main {
    public static void main(String[] args) {

        ThreadOne threadOne = new ThreadOne();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println(i + ": JESTEM WATKIEM ANONIMOWEJ KLASY!");
                }
            }
        };

        Thread worker = new Thread(runnable);
        Thread worker1 = new Thread(threadOne);

        worker.start();
        worker1.start();
    }
}
