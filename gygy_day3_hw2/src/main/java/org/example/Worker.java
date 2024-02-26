package org.example;

public class Worker implements IWorkable, IEatable, IPayable{
    @Override
    public void work() {
        System.out.println("Worker works");
    }

    @Override
    public void eat() {
        System.out.println("Worker eats");
    }

    @Override
    public void pay() {
        System.out.println("Worker pays");
    }
}
