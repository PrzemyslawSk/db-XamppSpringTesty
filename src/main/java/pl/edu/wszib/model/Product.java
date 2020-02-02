package pl.edu.wszib.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tproduct")
public class Product {
    @javax.persistence.Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String  category;
    private double price;
    private double quantity;   //quantity -> all product.
    private int ALARM;


    public Product(){

    }

    public Product(int id, String name, String category, double price, double quantity, int ALARM) {
        Id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.ALARM = ALARM;
    }




    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getALARM() {
        return ALARM;
    }

    public void setALARM(int ALARM) {
        this.ALARM = ALARM;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + Id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", ALARM=" + ALARM +
                '}';
    }
}