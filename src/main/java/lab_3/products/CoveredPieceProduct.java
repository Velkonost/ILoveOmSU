package lab_3.products;

import java.util.Objects;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class CoveredPieceProduct extends PieceProduct implements Coverable {
    Cover pieceCover;
    int amountOfPieces;

    public CoveredPieceProduct(String name, String description, int amountOfPieces,
                               Cover pieceCover, double pieceWeight) {
        super(name, description, pieceWeight);
        this.amountOfPieces = amountOfPieces;
        this.pieceCover = pieceCover;
    }

    public CoveredPieceProduct(PieceProduct pieceProduct, int amountOfPieces, Cover pieceCover) {
        super(pieceProduct);
        this.amountOfPieces = amountOfPieces;
        this.pieceCover = pieceCover;
    }

    public Cover getPieceCover() {
        return pieceCover;
    }

    public int getAmountOfPieces() {
        return amountOfPieces;
    }

    @Override
    public double getNetMass() {
        return pieceWeight * amountOfPieces;
    }

    @Override
    public double getGrossMass() {
        return getNetMass() + pieceCover.coverWeight;
    }

    @Override
    public String toString() {
        return "products.CoveredPieceProduct{" +
                "pieceCover=" + pieceCover +
                ", amountOfPieces=" + amountOfPieces +
                ", pieceWeight=" + pieceWeight +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CoveredPieceProduct that = (CoveredPieceProduct) o;
        return amountOfPieces == that.amountOfPieces &&
                Objects.equals(pieceCover, that.pieceCover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pieceCover, amountOfPieces);
    }
}
