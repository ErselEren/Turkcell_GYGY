package shoppingAPI.demo.repository.abstracts;

import shoppingAPI.demo.entity.Product;

import java.util.List;

public interface ProductRepository {
    Product findById(String id);

    String save(Product product);

    List<Product> findAll();

    String update(Product product);

    String delete(String id);
}
