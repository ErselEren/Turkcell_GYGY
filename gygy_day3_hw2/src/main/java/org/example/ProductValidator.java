package org.example;

public class ProductValidator {
    public boolean isValid(Product product) {
        if(product.getPrice()>0 && !product.getName().isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
