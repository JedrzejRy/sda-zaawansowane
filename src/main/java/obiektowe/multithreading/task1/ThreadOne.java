package obiektowe.multithreading.task1;

public class ThreadOne implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i + ": JESTEM WATKIEM Z KLASY");
        }
    }
}
