package obiektowe.multithreading.taks2;

public class Main {
    public static void main(String[] args) {
        ConcatenationTask concatenationTask = new ConcatenationTask("D",500000);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    concatenationTask.abort();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        concatenationTask.startTask();
        concatenationTask.waitUntilEnd();
        System.out.println(concatenationTask.getResult());

    }
}
