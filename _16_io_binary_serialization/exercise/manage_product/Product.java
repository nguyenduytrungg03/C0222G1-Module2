package _16_io_binary_serialization.exercise.manage_product;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String producer ;
    private int price;
    private  String descriptions;

    public Product() {
    }

    public Product(int id, String name, String producer, int price, String descriptions) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.descriptions = descriptions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public String toString() {
        return "Product: " +
                "id= " + id +
                ", name= " + name + '\'' +
                ", producer= " + producer + '\'' +
                ", price= " + price +
                ", descriptions= " + descriptions ;
    }
}
