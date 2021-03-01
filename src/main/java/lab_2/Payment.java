package lab_2;

import java.util.Objects;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 *
 * Класс с полями: ФИО человека (одна строка), дата платежа — число, месяц и год (целые числа),
 * сумма платежа (целое число — сумма в копейках).
 */
public class Payment {
    private String name;
    private int payment;
    int day;
    int month;
    int year;

    public Payment(String name, int payment, int day, int month, int year) {
        this.name = name;
        this.payment = payment;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Payment payment1 = (Payment) object;
        return payment == payment1.payment &&
                day == payment1.day &&
                month == payment1.month &&
                year == payment1.year &&
                Objects.equals(name, payment1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, payment, day, month, year);
    }
}

