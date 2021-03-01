package lab_2;

import lab_2.FinanceReport;
import lab_2.FinanceReportProcessor;
import lab_2.Payment;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class TestFinances {
    Payment payment1 = new Payment("J.J Jonson", 200,  9, 11, 1999);
    Payment payment2 = new Payment("J.J Manson", 100, 3, 1, 1987);
    Payment payment3 = new Payment("J.J Hubert", 200, 2, 5, 1959);

    FinanceReport financeReport = new FinanceReport( new Payment[]{
            payment1,
            payment2,
            payment3
    }, "Julia", 8, 11, 2011);

    @Test
    public void testFinanceReportToString(){
        Assert.assertEquals("Author: Julia, Date 8.11.2011 \n" +
                "\t Payer: J.J Jonson, Date: 9.11.1999, Amount: 2 rub. 0 kop. \n" +
                "\t Payer: J.J Manson, Date: 3.1.1987, Amount: 1 rub. 0 kop. \n" +
                "\t Payer: J.J Hubert, Date: 2.5.1959, Amount: 2 rub. 0 kop. \n", financeReport.toString());
    }

    @Test
    public void testCopyConstructor() {
        FinanceReport financeReport2 = new FinanceReport(financeReport);
        Assert.assertEquals(financeReport2, financeReport);
        financeReport2.getPayments()[0].setPayment(78);
        Assert.assertNotEquals(financeReport2, financeReport);
    }

    @Test
    public void testFinanceReportProcessor(){
        Payment[] expected = new Payment[]{
                payment1,
                payment2,
                payment3
        };

        FinanceReport exp = new FinanceReport(expected, financeReport.getName(), financeReport.getDay(),
                financeReport.getMonth(), financeReport.getYear());
        Assert.assertEquals(exp, FinanceReportProcessor.getReportBySurname(financeReport, "J.J"));
        expected = new Payment[]{
                payment2
        };
        exp = new FinanceReport(expected, financeReport.getName(), financeReport.getDay(),
                financeReport.getMonth(), financeReport.getYear());
        Assert.assertEquals(exp, FinanceReportProcessor.getReportByPayment(financeReport, 160));

    }
}
