package shoppingAPI.demo.controller;

import org.springframework.web.bind.annotation.*;
import shoppingAPI.demo.entity.Address;
import shoppingAPI.demo.service.abstracts.AddressService;

import java.util.List;


@RestController
@RequestMapping("/api/address")
public class AddressController {

    private AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/save")
    public String save(@RequestBody Address address) {
        return addressService.save(address);
    }

    @GetMapping("/findAll")
    public List<Address> findAll() {
        return addressService.findAll();
    }

    @PutMapping("/update")
    public String update(@RequestBody Address address) {
        return addressService.update(address);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        return addressService.delete(id);
    }

    @GetMapping("/findById/{id}")
    public Address findById(@PathVariable String id) {
        return addressService.findById(id);
    }






}
