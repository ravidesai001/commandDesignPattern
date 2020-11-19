import java.util.ArrayList;
import java.util.Stack;
import java.util.List;

public class Broker {
    
    private List<Order> orderHistory = new Stack<Order>();
    
    private List<Order> orders = new ArrayList<Order>();

    public void takeOrder(Order order){
        orders.add(order);
        orderHistory.add(order);
    }

    public void placeOrders(){
        for(Order order : orders){
            order.execute();
        }
        // all orders have been placed.
        orders.clear();
    }

}