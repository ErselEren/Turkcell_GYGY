package org.example;

public class Main {
    public static void main(String[] args) {

        // Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 3, "Siyah", "12345");
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getName());


        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        employeeManager.BestEmployee();

        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.Hesapla();

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new AskerKrediManager());

        EmailLogger logger = new EmailLogger();
        logger.Log("Log mesajı");

        BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
        for (BaseLogger baseLogger : loggers) {
            baseLogger.Log("Log mesajı");
        }

        CustomerManager customerManager1 = new CustomerManager(new DatabaseLogger());
        customerManager1.add();

        OgretmenKrediManager ogretmenKrediManager1 = new OgretmenKrediManager();
        System.out.println(ogretmenKrediManager1.Hesapla(1000));

        BaseKrediManager[] krediManagers = new BaseKrediManager[] {new OgretmenKrediManager(), new AskerKrediManager(), new OgrenciKrediManager()};
        for (BaseKrediManager baseKrediManager : krediManagers) {
            System.out.println(baseKrediManager.Hesapla(1000));
        }

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        GameCalculator gameCalculator = new WomanGameCalculator();
        gameCalculator.hesapla();
        gameCalculator.gameOver();

        CustomerManager customerManager2 = new CustomerManager();
        customerManager2.databaseManager = new SqlServerDatabaseManager();
        customerManager2.getCustomers();

        CustomerManager customerManager3 = new CustomerManager(new OracleCustomerDal());
        customerManager3.add2();

        ProductManager productManager1 = new ProductManager();
        Product product1 = new Product();
        product1.setName("Laptop");

    }
}