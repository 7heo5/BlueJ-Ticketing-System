
public class Order
{
    private static int nextOrderNumber = 1;
    private int orderNumber;
    private Show show;
    private Customer customer;
    private int numberOfSeats;

    public Order(Show show, Customer customer, int numberOfSeats) {
        this.show = show;
        this.customer = customer;
        this.numberOfSeats = numberOfSeats;
        this.orderNumber = nextOrderNumber++;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Show getShow() {
        return show;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return "Order Number: " + orderNumber + ", Show: " + show.getName() + ", Customer: " + customer.getName() + ", Number of seats: " + numberOfSeats;
    }
}
