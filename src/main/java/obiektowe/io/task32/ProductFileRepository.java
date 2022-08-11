package obiektowe.io.task32;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductFileRepository {
    private static final String PATH = "src/main/java/obiektowe/io/products.csv";


    public void ProductListWriter(List<Product> products){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH));
            oos.writeObject(products);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product> readProducts() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH));
            List<Product> products1= (List<Product>) ois.readObject();
            ois.close();
            return products1;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }


}
