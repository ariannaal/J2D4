public class Product {

    private String category;
    private Long id;
    private String name;
    private double price;

    public Product(long id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public double sconto() {
        return getPrice() * 0.10;
    }

    public String getCategory() {
        return category;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return " Product " +
                "category= " + category + '\'' +
                ", name= " + name + '\'' +
                ", price= " + price;
    }
}

