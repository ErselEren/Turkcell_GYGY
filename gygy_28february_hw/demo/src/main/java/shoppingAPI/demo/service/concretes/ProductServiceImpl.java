package shoppingAPI.demo.service.concretes;

import org.springframework.stereotype.Service;
import shoppingAPI.demo.entity.Product;
import shoppingAPI.demo.service.abstracts.ProductService;
import shoppingAPI.demo.repository.abstracts.ProductRepository;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public String save(Product product) {
        //if product is not exist in the database, then save it
        if(productRepository.findById(product.getId()) == null){
            return productRepository.save(product);
        }
        else {
            return "Product is already exist";
        }
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public String update(Product product) {
        //if product is exist in the database, then update it
        if(productRepository.findById(product.getId()) != null){
            return productRepository.update(product);
        }
        else {
            return "Product is not exist";
        }
    }

    @Override
    public String delete(String id) {
        //if product is exist in the database, then delete it
        if(productRepository.findById(id) != null){
            return productRepository.delete(id);
        }
        else {
            return "Product is not exist";
        }
    }

    @Override
    public Product findById(String id) {
        return productRepository.findById(id);
    }
}
