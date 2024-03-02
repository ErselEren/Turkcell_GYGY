package shoppingAPI.demo.service.concretes;

import org.springframework.stereotype.Service;
import shoppingAPI.demo.entity.Address;
import shoppingAPI.demo.repository.abstracts.AddressRepository;
import shoppingAPI.demo.service.abstracts.AddressService;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public String save(Address address) {
        if (addressRepository.findById(address.getId()) == null) {
            addressRepository.save(address);
            return "Address saved";
        }
        return "Address already exists";
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public String update(Address address) {
        return addressRepository.update(address);
    }

    @Override
    public String delete(String id) {
        return addressRepository.delete(id);
    }

    @Override
    public Address findById(String id) {
        return addressRepository.findById(id);
    }
}
