import java.util.ArrayList;
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String name;
    private String email;
    private String address;
    private String creditCardNumber;
    private String username;
    private String password;
    private ArrayList<Order> orders;

    public Customer(String username, String password, String name, String email, String address, String creditCardNumber) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
    public String getAddress() {
        return address;
    }

    public String getCreditCardDetails() {
        return creditCardNumber;
    }

    public void createAccount(String username, String password, String address, String creditCardNumber) {
        this.username = username;
        this.password = password;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
    }

    public void updateAccount(String name, String email, String username, String password, String address, String creditCardNumber) {
        if (name != null) {
            this.name = name;
        }
        if (email != null) {
            this.email = email;
        }
        if (username != null) {
            this.username = username;
        }
        if (password != null) {
            this.password = password;
        }
        if (address != null) {
            this.address = address;
        }
        if (creditCardNumber != null) {
            this.creditCardNumber = creditCardNumber;
        }
    }
    
    public Order createOrder(Show show, int numberOfSeats) {
        Order order = new Order(show, this, numberOfSeats);
        orders.add(order);
        return order;
    }
    
     public ArrayList<Order> viewOrders() {
        return orders;
    }
    
    public ArrayList<Show> viewShows(ArrayList<Show> shows) {
        return shows;
    }
}
