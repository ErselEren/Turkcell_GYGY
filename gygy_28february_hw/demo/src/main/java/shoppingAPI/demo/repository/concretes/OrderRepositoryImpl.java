package shoppingAPI.demo.repository.concretes;

import org.springframework.stereotype.Repository;
import shoppingAPI.demo.entity.Order;
import shoppingAPI.demo.repository.abstracts.OrderRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

    private List<Order> orders;

    public OrderRepositoryImpl() {
        orders = new ArrayList<>();
        orders.add(new Order("1", "1", "1", "1","1"));
        orders.add(new Order("2", "2", "2", "2", "2"));

    }

    @Override
    public Order findById(String id) {
        for (Order order : orders) {
            if (order.getID().equals(id)) {
                return order;
            }
        }
        return null;
    }

    @Override
    public String save(Order order) {
       //if order is not exist in the database, then save it
        if(findById(order.getID ()) == null){
            orders.add(order);
            return "Order is saved";
        }
        else {
            return "Order is already exist";
        }
    }

    @Override
    public List<Order> findAll() {
        return orders;
    }

    @Override
    public String update(Order order) {
        for (Order o : orders) {
            if (o.getID().equals(order.getID())) {
                o.setAddressID(order.getAddressID());
                o.setDate(order.getDate());
                o.setState(order.getState());
                o.setUserID(order.getUserID());
                return "Order is updated";
            }
        }
        return "Order is not found";
    }

    @Override
    public String delete(String id) {
        for (Order order : orders) {
            if (order.getID().equals(id)) {
                orders.remove(order);
                return "Order is deleted";
            }
        }
        return "Order is not found";
    }
}
