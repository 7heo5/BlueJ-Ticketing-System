import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class TicketAgent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicketAgent extends User
{
    // instance variables - replace the example below with your own
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

    public void viewCustomerOrders(Customer customer) {
        System.out.println("Orders for customer: " + customer.getName());
        for (Order order : orders) {
            if (order.getCustomer().equals(customer)) {
                System.out.println(order);
            }
        }
    }
}
