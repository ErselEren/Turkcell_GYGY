package shoppingAPI.demo.repository.abstracts;

import shoppingAPI.demo.entity.Order;

import java.util.List;

public interface OrderRepository {
    Order findById(String id);

    String save(Order order);

    List<Order> findAll();

    String update(Order order);

    String delete(String id);
}
