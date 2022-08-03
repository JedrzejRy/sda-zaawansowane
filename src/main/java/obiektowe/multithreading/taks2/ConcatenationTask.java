package obiektowe.multithreading.taks2;

public class ConcatenationTask implements Runnable{
    private String text;
    private int number;
    private String result = "";
    private boolean running = true;
    private Thread thread;


    public ConcatenationTask(String text, int number) {
        this.text = text;
        this.number = number;
        thread = new Thread(this);
    }

    @Override
    public void run() {
            for (int i = 0; i < number; i++) {
                    if (!running){
                        break;
                    }
                    result += text;
            }
    }

    public void startTask(){
        thread.start();
    }

    public void abort(){
        running = false;
    }

    public void waitUntilEnd(){
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getResult() {
        return result;
    }
}
