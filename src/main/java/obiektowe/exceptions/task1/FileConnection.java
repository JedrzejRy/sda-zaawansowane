package obiektowe.exceptions.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FileConnection {
    private boolean connected;
    File file;

    public void connectToFile() throws FileConnectionException {
        Random random = new Random();
        int chance = random.nextInt(4);
        if (chance==3){
            throw new FileConnectionException();
        }
        this.file = new File("src/main/java/obiektowe/exceptions/task1/File.txt");
        connected  = true;
    }

    public List<String> downloadFile() throws FileDbConnectionException{
        List<String> fileContents = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                fileContents.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new FileDbConnectionException();
        }

        return fileContents;
    }

    public void disconnect(){
        connected = false;
    }



}
