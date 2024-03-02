package shoppingAPI.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shoppingAPI.demo.entity.Product;
import shoppingAPI.demo.service.abstracts.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/product")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/save")
    public String save(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/findAll")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @PutMapping("/update")
    public String update(@RequestBody Product product) {
        return productService.update(product);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        return productService.delete(id);
    }

    @GetMapping("/findById/{id}")
    public Product findById(@PathVariable String id) {
        return productService.findById(id);
    }



}
