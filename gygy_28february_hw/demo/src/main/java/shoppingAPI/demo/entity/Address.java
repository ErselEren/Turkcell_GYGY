package shoppingAPI.demo.entity;

public class Address {

    private String id;
    private String Name;
    private String AddressDescription;
    private String City;
    private String District;
    private String Country;
    private String PostalCode;
    private String PhoneNumber;

    public Address() {
    }

    public Address(String id, String Name, String AddressDescription, String City, String District, String Country, String PostalCode, String PhoneNumber) {
        this.id = id;
        this.Name = Name;
        this.AddressDescription = AddressDescription;
        this.City = City;
        this.District = District;
        this.Country = Country;
        this.PostalCode = PostalCode;
        this.PhoneNumber = PhoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddressDescription() {
        return AddressDescription;
    }

    public void setAddressDescription(String addressDescription) {
        AddressDescription = addressDescription;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
