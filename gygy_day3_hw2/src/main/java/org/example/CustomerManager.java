package org.example;

public class CustomerManager extends PersonManager {

    private BaseLogger logger;

    BaseDatabaseManager databaseManager;

    private ICustomerDal customerDal;
    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public CustomerManager() {
    }

    public void add() {
        System.out.println("Müşteri Eklendi");
        logger.Log("Log mesajı");
    }

    public void getCustomers() {
        databaseManager.getData();
    }

    public void add2() {
       customerDal.Add();
    }


}
