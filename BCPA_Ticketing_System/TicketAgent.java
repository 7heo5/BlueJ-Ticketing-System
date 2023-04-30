import java.util.List;
import java.util.ArrayList;

public class TicketAgent extends User
{
    private String agentId;
    private List<Order> orders;

    public TicketAgent(String username, String password, String agentId) {
        super(username, password);
        this.agentId = agentId;
        orders = new ArrayList<>();
    }

    public String getAgentId() {
        return agentId;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void viewCustomerOrders(Customer customer, Order ticket, Show show) {
        System.out.println("Order Number: " + ticket.getOrderNumber());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Email: " + customer.getEmail());
        System.out.println("Show name: " + show.getName());
        System.out.println("Number of Seats: " + ticket.getNumberOfSeats());
        for (Order order : orders) {
            if (order.getCustomer().equals(customer)) {
                System.out.println(order);
            }
        }
    }
}
