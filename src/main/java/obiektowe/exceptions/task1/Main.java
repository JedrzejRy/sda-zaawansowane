package obiektowe.exceptions.task1;

public class Main {
    public static void main(String[] args) {
        FileConnection fileConnection = new FileConnection();
        try {
            fileConnection.connectToFile();
        }catch (FileConnectionException e){
            e.printStackTrace();
            return;
        }
        try {
            System.out.println(fileConnection.downloadFile());
        } catch (FileDbConnectionException e){
            e.printStackTrace();
        }

        fileConnection.disconnect();

    }


}
