import java.time.LocalDate;
import java.util.List;

public class Order {

    private long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    public Order(LocalDate orderDate, long id, String status, LocalDate deliveryDate, List<Product> products, Customer customer) {
        this.orderDate = orderDate;
        this.id = id;
        this.status = status;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }


    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Order " +

                status + '\'' +
                ", order's date= " + orderDate +
                ", delivery date= " + deliveryDate +
                products +
                "customer= " + customer
                ;
    }
}

