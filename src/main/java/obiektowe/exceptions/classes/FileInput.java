package obiektowe.exceptions.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInput {

    public List<String> readBoosk(){
        List<String> booksList = new ArrayList<>();
        File file = new File("src\\main\\java\\obiektowe\\exceptions\\ksiazki.txt");
        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String book = scanner.nextLine();
                booksList.add(book);
            }
        }catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku!");
            e.printStackTrace();
        }

        return booksList;
    }

    public static void main(String[] args) {
        FileInput input = new FileInput();
        System.out.println(input.readBoosk());
    }
}
