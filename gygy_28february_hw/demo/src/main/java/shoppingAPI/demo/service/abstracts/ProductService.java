package shoppingAPI.demo.service.abstracts;

import shoppingAPI.demo.entity.Product;

import java.util.List;

public interface ProductService {
    String save(Product product);

    List<Product> findAll();

    String update(Product product);

    String delete(String id);

    Product findById(String id);
}
