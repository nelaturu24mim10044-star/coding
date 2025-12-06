import java.util.*;

public class ProductFilter {
    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        products.put("Bag", 500);
        products.put("Pen", 20);
        products.put("Bottle", 150);

        for (String product : products.keySet()) {
            if (products.get(product) > 100) {
                System.out.println(product + " : " + products.get(product));
            }
        }
    }
}

OUTPUT:
Bottle : 150
Bag : 500
