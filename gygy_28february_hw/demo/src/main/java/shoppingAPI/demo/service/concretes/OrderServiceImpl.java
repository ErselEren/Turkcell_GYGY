package shoppingAPI.demo.service.concretes;

import org.springframework.stereotype.Service;
import shoppingAPI.demo.entity.Order;
import shoppingAPI.demo.repository.abstracts.OrderRepository;
import shoppingAPI.demo.service.abstracts.OrderService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public String save(Order order) {
        //if order is not exist in the database, then save it
        if(orderRepository.findById(order.getID()) == null){
            return orderRepository.save(order);
        }
        else {
            return "Order is already exist";
        }

    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public String update(Order order) {
        return orderRepository.update(order);
    }

    @Override
    public String delete(String id) {
        return orderRepository.delete(id);
    }

    @Override
    public Order findById(String id) {
        return orderRepository.findById(id);
    }
}
