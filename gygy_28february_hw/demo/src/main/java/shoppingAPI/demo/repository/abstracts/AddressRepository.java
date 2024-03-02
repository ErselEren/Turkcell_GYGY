package shoppingAPI.demo.repository.abstracts;

import shoppingAPI.demo.entity.Address;

import java.util.List;

public interface AddressRepository {
    void save(Address address);

    List<Address> findAll();

    String update(Address address);

    String delete(String id);

    Address findById(String id);
}
