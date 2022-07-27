package pl.uhu87.OOP.Cart;

public class Product {

    private static int nextId = 1;
    private int id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.price = price;
        setPrice(price);

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0.01) {
            this.price = price;
        } else {throw new PriceTooLow("price too low");

        }
        ;
    }
}
