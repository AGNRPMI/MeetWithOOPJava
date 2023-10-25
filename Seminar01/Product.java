package Seminar01;

import java.util.List;

// реализация опций - просто класса, класса с инкапсуляцией и абстрактного класса


// public class Product{
//     public String name;
//     public double cost;
// }


// public class Product{
//     private String name;
//     private double cost;


//     public Product(String name, double cost) {
//         this.name = name;
//         this.cost = cost;
//     }


//     public String getName() {
//         return name;
//     }


//     public double getCost() {
//         return cost;
//     }


//     public void setName(String name) {
//         this.name = name;
//     }


//     public void setCost(double cost) {
//         this.cost = cost;
//     }
// }

public abstract class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}