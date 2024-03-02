package shoppingAPI.demo.service.abstracts;

import org.springframework.stereotype.Service;
import shoppingAPI.demo.entity.Payment;

import java.util.List;


public interface PaymentService {
    String save(Payment payment);

    List<Payment> findAll();

    String update(Payment payment);

    String delete(String id);

    Payment findById(String id);
}
