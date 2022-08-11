package obiektowe.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextInputOutput {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("output.txt",true);
            //często wykorzystuje się BufferedWriter - dla większej wydajności
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append("abcd");
            bufferedWriter.flush();
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        //zapis do pliku można robić na bardzo wiele różnych sposobów - np. PrintWritter

    }
}
