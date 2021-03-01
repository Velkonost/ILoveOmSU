package lab_3.products;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class Consigment {
    Coverable[] coverables;
    String description;

    public Consigment(String description, Coverable...coverables){
        this.description = description;
        this.coverables = coverables;
    }

    public double getMass(){
        double mass = 0;
        for (Coverable coverable : coverables) {
            mass += coverable.getGrossMass();
        }
        return mass;
    }

    public Coverable[] getCoverables() {
        return coverables;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consigment that = (Consigment) o;
        return Arrays.equals(coverables, that.coverables) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(description);
        result = 31 * result + Arrays.hashCode(coverables);
        return result;
    }

    @Override
    public String toString() {
        return "products.Consigment{" +
                "coverables=" + Arrays.toString(coverables) +
                ", description='" + description + '\'' +
                '}';
    }
}
