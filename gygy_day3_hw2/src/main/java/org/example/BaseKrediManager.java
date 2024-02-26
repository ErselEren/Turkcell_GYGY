package org.example;

public class BaseKrediManager {
    public void Hesapla() {
        System.out.println("Kredi hesaplandı.");
    }

    public double Hesapla(double tutar) {
        return tutar * 1.18;
    }
}
