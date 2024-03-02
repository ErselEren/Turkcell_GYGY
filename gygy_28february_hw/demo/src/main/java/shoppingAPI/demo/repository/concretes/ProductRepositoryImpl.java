package shoppingAPI.demo.repository.concretes;

import org.springframework.stereotype.Repository;
import shoppingAPI.demo.entity.Product;
import shoppingAPI.demo.repository.abstracts.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private List<Product> products;

    public ProductRepositoryImpl() {
        this.products = new ArrayList<>();
        products.add(new Product("1", "Iphone 12","DummyDescription1", 10000,10));
        products.add(new Product("1", "Iphone 11","DummyDescription2", 8000,24));
        products.add(new Product("1", "Iphone 10","DummyDescription3", 6000,7));
    }


    @Override
    public Product findById(String id) {
        return products.stream().filter(product -> product.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public String save(Product product) {
        products.add(product);
        return "Product is saved successfully";
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public String update(Product product) {
        //find the product by id and update it
        for (Product p : products) {
            if (p.getId().equals(product.getId())) {
                p.setName(product.getName());
                p.setDescription(product.getDescription());
                p.setUnitPrice(product.getUnitPrice());
                p.setStockQuantity(product.getStockQuantity());
                return "Product is updated successfully";
            }
        }
        return "Product is not exist";
    }

    @Override
    public String delete(String id) {
        //find the product by id and delete it
        for (Product p : products) {
            if (p.getId().equals(id)) {
                products.remove(p);
                return "Product is deleted successfully";
            }
        }
        return "Product is not exist";
    }
}
