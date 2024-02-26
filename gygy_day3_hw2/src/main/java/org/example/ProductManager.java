package org.example;

public class ProductManager {
    public void Add(Product product) {
        ProductValidator productValidator = new ProductValidator();
        if (productValidator.isValid(product)) {
            System.out.println("Product added: " + product.getName());
        } else {
            System.out.println("Product is not valid");
        }

    }

    public void Add2(int id,String name){}
}
