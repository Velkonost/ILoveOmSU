package lab_3;

import lab_3.filter.BeginStringFilter;
import lab_3.filter.Filter;
import lab_3.products.*;
import lab_3.service.ProductService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class TestProductService {

    WeightProduct phone;
    CoveredWeightProduct coveredWeightProduct;
    PieceProduct cookies;
    CoveredPieceProduct coveredPieceProduct;

    @Before
    public void setUp(){
        phone = new WeightProduct("Phone", "Communication device");
        coveredWeightProduct = new CoveredWeightProduct(
                phone, new Cover("Phone cover", 0.04), 0.09
        );

        cookies = new PieceProduct("Cookies", "Sweets", 0.001);
        coveredPieceProduct = new CoveredPieceProduct(
                cookies, 20, new Cover("Box", 0.03)
        );
    }

    @Test
    public void testGrossMassAndNetMass(){
        Assert.assertEquals(0.13, coveredWeightProduct.getGrossMass(), 1e-10);
        Assert.assertEquals(0.09, coveredWeightProduct.getNetMass(), 1e-10);
        Assert.assertEquals(0.05, coveredPieceProduct.getGrossMass(), 1e-10);
        Assert.assertEquals(0.02, coveredPieceProduct.getNetMass(), 1e-10);
    }

    @Test
    public void testCountByFilter(){
        Consigment consigment = new Consigment("Phone and Cookies", coveredWeightProduct, coveredPieceProduct);
        Filter filter = new BeginStringFilter("Ph");

        Assert.assertEquals(1, ProductService.countByFilter(filter, consigment));
    }
}