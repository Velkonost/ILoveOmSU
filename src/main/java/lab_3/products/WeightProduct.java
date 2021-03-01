package lab_3.products;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class WeightProduct extends Product {
    public WeightProduct(String name, String description)  {
        super(name, description);
    }

    @Override
    public String toString() {
        return "products.WeightProduct{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
