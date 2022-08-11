package obiektowe.io.task32;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List<Product> products = new ArrayList<>();
        //for (int i = 0; i < 5; i++) {
        //     products.add(new Product());
        // }

        ProductFileRepository productFileRepository = new ProductFileRepository();
        //productFileRepository.ProductListWriter(products);

        System.out.println(productFileRepository.readProducts());

    }

}
