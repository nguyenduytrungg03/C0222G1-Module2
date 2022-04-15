package _11_java_collection_framework.exercise.use_arraylist_linkedlist_in_jck.arraylist;

public class Product  {

    private String name;
    private int price;
    private int id ;

    public Product(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product: " +
                "name= " + name +
                ", price= " + price +
                ", id= " + id ;
    }
}
