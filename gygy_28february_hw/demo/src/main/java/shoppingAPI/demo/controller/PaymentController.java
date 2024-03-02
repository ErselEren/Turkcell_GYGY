package shoppingAPI.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shoppingAPI.demo.entity.Payment;
import shoppingAPI.demo.service.abstracts.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/save")
    public String save(@RequestBody Payment payment) {
        return paymentService.save(payment);
    }

    @GetMapping("/findAll")
    public List<Payment> findAll() {
        return paymentService.findAll();
    }

    @PutMapping("/update")
    public String update(@RequestBody Payment payment) {
        return paymentService.update(payment);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        return paymentService.delete(id);
    }

    @GetMapping("/findById/{id}")
    public Payment findById(@PathVariable String id) {
        return paymentService.findById(id);
    }


}
