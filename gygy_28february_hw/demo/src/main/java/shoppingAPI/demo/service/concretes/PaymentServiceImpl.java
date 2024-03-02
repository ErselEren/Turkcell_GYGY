package shoppingAPI.demo.service.concretes;

import org.springframework.stereotype.Service;
import shoppingAPI.demo.entity.Payment;
import shoppingAPI.demo.service.abstracts.PaymentService;
import shoppingAPI.demo.repository.abstracts.PaymentRepository;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService{

    private PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public String save(Payment payment) {
        if(paymentRepository.findById(payment.getId()) == null){
            return paymentRepository.save(payment);
        }
        else {
            return "Payment is already exist";
        }
    }

    @Override
    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public String update(Payment payment) {
        if(paymentRepository.findById(payment.getId()) != null){
            return paymentRepository.update(payment);
        }
        else {
            return "Payment is not exist";
        }
    }

    @Override
    public String delete(String id) {
        if(paymentRepository.findById(id) != null){
            return paymentRepository.delete(id);
        }
        else {
            return "Payment is not exist";
        }
    }

    @Override
    public Payment findById(String id) {
        return paymentRepository.findById(id);
    }
}
