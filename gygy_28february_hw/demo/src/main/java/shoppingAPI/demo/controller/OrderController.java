package shoppingAPI.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shoppingAPI.demo.entity.Order;
import shoppingAPI.demo.service.abstracts.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/order")

public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/save")
    public String save(@RequestBody Order order) {
        return orderService.save(order);
    }

    @GetMapping("/findAll")
    public List<Order> findAll() {
        return orderService.findAll();
    }

    @PutMapping("/update")
    public String update(@RequestBody Order order) {
        return orderService.update(order);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        return orderService.delete(id);
    }

    @GetMapping("/findById/{id}")
    public Order findById(@PathVariable String id) {
        return orderService.findById(id);
    }




}
