package lab_3.products;

import java.util.Objects;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class PieceProduct extends Product {
    double pieceWeight;

    public PieceProduct(String name, String description, double pieceWeight){
        super(name, description);
        this.pieceWeight = pieceWeight;
    }

    public PieceProduct (PieceProduct other){
        super(other.getName(), other.getDescription());
        this.pieceWeight = other.pieceWeight;
    }

    public double getPieceWeight() {
        return pieceWeight;
    }

    @Override
    public String toString() {
        return "products.PieceProduct{" +
                "pieceWeight=" + pieceWeight +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PieceProduct that = (PieceProduct) o;
        return Double.compare(that.pieceWeight, pieceWeight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieceWeight);
    }
}
