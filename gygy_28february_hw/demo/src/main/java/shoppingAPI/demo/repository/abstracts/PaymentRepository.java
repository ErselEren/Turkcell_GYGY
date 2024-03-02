package shoppingAPI.demo.repository.abstracts;

import shoppingAPI.demo.entity.Payment;

import java.util.List;


public interface PaymentRepository {
    String save(Payment payment);

    List<Payment> findAll();

    String update(Payment payment);

    String delete(String id);

    Payment findById(String id);
}
