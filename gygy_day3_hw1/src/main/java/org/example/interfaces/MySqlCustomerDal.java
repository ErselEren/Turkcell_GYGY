package org.example.interfaces;

import org.example.interfaces.ICustomerDal;

public class MySqlCustomerDal implements ICustomerDal {
    @Override
    public void Add() {
        System.out.println("MySql eklendi");
    }
}
