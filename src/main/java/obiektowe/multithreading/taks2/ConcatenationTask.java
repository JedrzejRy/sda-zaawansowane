package obiektowe.multithreading.taks2;

public class ConcatenationTask implements Runnable{
    private String text;
    private int number;
    private String result = "";
    private boolean running = true;


    public ConcatenationTask(String text, int number) {
        this.text = text;
        this.number = number;
    }

    @Override
    public void run() {
            for (int i = 0; i < number; i++) {
                try {
                    if (!running){
                        break;
                    }
                    Thread.sleep(500);
                    result += text;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        System.out.println(result);
    }

    public void startTask(){
        for (int i = 0; i < number; i++) {
                if (!running){
                    break;
                }
                result += text;
        }
        System.out.println(result);
    }

    public void abort(){
        running = false;
    }
}
