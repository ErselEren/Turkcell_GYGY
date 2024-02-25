package org.example;


import org.example.interfaces.CustomerManager;
import org.example.interfaces.MySqlCustomerDal;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}