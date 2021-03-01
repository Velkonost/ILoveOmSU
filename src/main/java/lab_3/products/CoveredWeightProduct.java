package lab_3.products;

import java.util.Objects;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class CoveredWeightProduct extends WeightProduct implements Coverable {
    Cover productCover;
    double weight;

    public CoveredWeightProduct(Product product, Cover productCover, double weight) {
        super(product.getName(), product.getDescription());
        this.productCover = productCover;
        this.weight = weight;
    }

    @Override
    public double getNetMass() {
        return weight;
    }

    @Override
    public double getGrossMass() {
        return weight + productCover.coverWeight;
    }

    public Cover getProductCover() {
        return productCover;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "products.CoveredWeightProduct{" +
                "productCover=" + productCover +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoveredWeightProduct that = (CoveredWeightProduct) o;
        return Double.compare(that.weight, weight) == 0 &&
                Objects.equals(productCover, that.productCover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCover, weight);
    }
}

