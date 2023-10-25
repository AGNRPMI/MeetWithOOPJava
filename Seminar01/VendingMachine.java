package Seminar01;

import java.util.ArrayList;
import java.util.List;

//реализация двух опций - просто класса, инкапсуляции и интерфейса

// public class VendingMachine {

//     List<Product> products = new ArrayList<>();

//     public void initProduct (List<Product> products){
//         this.products= products;
//     }

//     public Product getProduct(String name){
//         for (Product item: products){
//             if (item.name.equals(name)) return item;
//         }
//         return null;
//     }    
// }

public class VendingMachine {
    private List<Product> products = new ArrayList<>();

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product item : products) {
            if (item.getName().equals(name))
                return item;
        }
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
// public interface VendingMachine {

// Product getProduct(String name);

// Product getProduct(String name, double volume);
// }