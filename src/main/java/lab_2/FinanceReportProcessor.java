package lab_2;

import java.util.ArrayList;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 *
 * Класс, в котором реализуйте статические методы, все методы возвращают объект класса FinanceReport:
 * 1) получение платежей всех людей, чья фамилия начинается на указанный символ (символ — входной параметр),
 * 2) получение всех платежей, размер которых меньше заданной величины.
 */
public class FinanceReportProcessor {
    public static FinanceReport getReportBySurname(FinanceReport financeReport, String surname){
        ArrayList<Payment> paymentList = new ArrayList<>();
        for (Payment payment: financeReport.getPayments()){
            if (payment.getName().startsWith(surname.trim())){
                paymentList.add(payment);
            }
        }
        return new FinanceReport(paymentList.toArray(new Payment[0]), financeReport.getName(),
                financeReport.getDay(), financeReport.getMonth(), financeReport.getYear());
    }

    public static FinanceReport getReportByPayment(FinanceReport financeReport, int paymentAmount){
        ArrayList<Payment> paymentList = new ArrayList<>();
        for (Payment payment: financeReport.getPayments()){
            if (payment.getPayment() <= paymentAmount) {
                paymentList.add(payment);
            }
        }
        return new FinanceReport(paymentList.toArray(new Payment[0]), financeReport.getName(),
                financeReport.getDay(), financeReport.getMonth(), financeReport.getYear());
    }
}
