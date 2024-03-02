package shoppingAPI.demo.service.abstracts;

import shoppingAPI.demo.entity.Address;

import java.util.List;

public interface AddressService {
    String save(Address address);

    List<Address> findAll();

    String update(Address address);

    String delete(String id);

    Address findById(String id);


}
