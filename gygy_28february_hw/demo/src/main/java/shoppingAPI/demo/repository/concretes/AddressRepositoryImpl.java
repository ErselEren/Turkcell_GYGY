package shoppingAPI.demo.repository.concretes;

import org.springframework.stereotype.Repository;
import shoppingAPI.demo.entity.Address;
import shoppingAPI.demo.repository.abstracts.AddressRepository;

import java.util.List;

@Repository
public class AddressRepositoryImpl implements AddressRepository {

    private List<Address> addresses;

    //fill addresses String Name, String AddressDescription, String City, String District, String Country, String PostalCode, String PhoneNumber)
    public AddressRepositoryImpl() {
        addresses = List.of(
                new Address("1", "Home", "Home Address", "Istanbul", "Kadikoy", "Turkey", "34700", "1234567890"),
                new Address("2", "Work", "Work Address", "Istanbul", "Kadikoy", "Turkey", "34700", "1234567890")
        );
    }


    @Override
    public void save(Address address) {
        addresses.add(address);
    }

    @Override
    public List<Address> findAll() {
        return addresses;
    }

    @Override
    public String update(Address address) {
        for (Address a : addresses) {
            if (a.getId().equals(address.getId())) {
                a.setName(address.getName());
                a.setAddressDescription(address.getAddressDescription());
                a.setCity(address.getCity());
                a.setDistrict(address.getDistrict());
                a.setCountry(address.getCountry());
                a.setPostalCode(address.getPostalCode());
                a.setPhoneNumber(address.getPhoneNumber());
                return "Address updated";
            }
        }
        return "Address not found";
    }

    @Override
    public String delete(String id) {
        for (Address a : addresses) {
            if (a.getId().equals(id)) {
                addresses.remove(a);
                return "Address deleted";
            }
        }
        return "Address not found";
    }

    @Override
    public Address findById(String id) {
        for (Address a : addresses) {
            if (a.getId().equals(id)) {
                return a;
            }
        }
        return null;
    }
}
