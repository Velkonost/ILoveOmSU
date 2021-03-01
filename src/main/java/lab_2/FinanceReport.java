package lab_2;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 *
 * Класс, содержащий массив платежей, ФИО составителя отчета,
 * дату создания отчета.
 * Методы: получение количества платежей, доступ к i-му платежу (на чтение и запись).
 */
public class FinanceReport {
    private Payment[] payments;
    private String name;
    int day;
    int month;
    int year;

    public FinanceReport(Payment[] payments, String name, int day, int month, int year) {
        this.payments = payments;
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Конструктор копирования (после создания копии массива при изменении
    // данных в объектах исходного массива копия не изменяется).
    public FinanceReport(FinanceReport other) {
        this.name = other.name;
        this.day = other.day;
        this.month = other.month;
        this.year = other.year;
        this.payments = new Payment[other.payments.length];
        for (int i = 0; i < other.payments.length; i++) {
            this.payments[i] = new Payment(other.payments[i].getName(), other.payments[i].getPayment(),
                    other.payments[i].getDay(), other.payments[i].getMonth(), other.payments[i].getYear());
        }
    }

    public Payment[] getPayments() {
        return payments;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getAmount(){
        return payments.length;
    }

    public Payment getPaymentAt(int index){
        return payments[index];
    }

    public void setPaymentAt(Payment payment, int index){
        payments[index] = payment;
    }

    // Преобразование отчета в набор строк формата:
    // [Автор: ФИО составителя, дата: дата.создания, Платежи: [
    // Плательщик: ФИО, дата: день.месяц.год сумма: *** руб. ** коп.\n,
    // Плательщик: ФИО, дата: день.месяц.год сумма: *** руб. ** коп.\n,… ]]
    @Override
    public String toString() {
        String template = "\t Payer: %s, Date: %d.%d.%d, Amount: %d rub. %d kop. \n" ;
        StringBuilder start = new StringBuilder(String.format("Author: %s, Date %d.%d.%d \n", name, day, month, year));
        for(Payment p: payments){
            start.append(String.format(template, p.getName(), p.getDay(), p.getMonth(), p.getYear(),
                    p.getPayment()/100, p.getPayment()%100));
        }
        return start.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        FinanceReport that = (FinanceReport) object;
        return day == that.day &&
                month == that.month &&
                year == that.year &&
                Arrays.equals(payments, that.payments) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, day, month, year);
        result = 31 * result + Arrays.hashCode(payments);
        return result;
    }
}
