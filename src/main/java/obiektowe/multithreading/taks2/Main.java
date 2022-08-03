package obiektowe.multithreading.taks2;

public class Main {
    public static void main(String[] args) {
        ConcatenationTask concatenationTask = new ConcatenationTask("D",10);
        Thread thread = new Thread(concatenationTask);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    concatenationTask.abort();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();
        thread1.start();

    }
}
