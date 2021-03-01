package lab_3.service;

import lab_3.filter.Filter;
import lab_3.products.Consigment;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class ProductService {
    public static int countByFilter(Filter filter, Consigment consigment){
        int count = 0;
        for (int i = 0; i < consigment.getCoverables().length; i++) {
            if (filter.apply(consigment.getCoverables()[i].getName())) {
                count++;
            }
        }
        return count;
    }
}
