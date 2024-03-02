package shoppingAPI.demo.repository.concretes;

import shoppingAPI.demo.entity.Payment;
import shoppingAPI.demo.repository.abstracts.PaymentRepository;

import java.util.ArrayList;
import java.util.List;


public class PaymentRepositoryImpl implements PaymentRepository{

    private List<Payment> paymentList;

    public PaymentRepositoryImpl() {
        this.paymentList = new ArrayList<>();

        paymentList.add(new Payment("1", "Credit Card", "2021-01-01", 1000));
        paymentList.add(new Payment("2", "Cash", "2021-01-02", 2000));
        paymentList.add(new Payment("3", "Credit Card", "2021-01-03", 3000));
    }

    @Override
    public String save(Payment payment) {
        paymentList.add(payment);
        return "Payment is saved";
    }

    @Override
    public List<Payment> findAll() {
        return paymentList;
    }

    @Override
    public String update(Payment payment) {
        return null;
    }

    @Override
    public String delete(String id) {
        return null;
    }

    @Override
    public Payment findById(String id) {
        return null;
    }
}
