package shoppingAPI.demo.service.abstracts;

import shoppingAPI.demo.entity.Order;

import java.util.List;

public interface OrderService {
    String save(Order order);

    List<Order> findAll();

    String update(Order order);

    String delete(String id);

    Order findById(String id);
}
