package lab_1;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class Vector3DProcessor {

    public static Vector3D sumOfVectors(Vector3D firstVector, Vector3D secondVector){
        Vector3D resultVector = new Vector3D();

        resultVector.setX(firstVector.getX() + secondVector.getX());
        resultVector.setY(firstVector.getY() + secondVector.getY());
        resultVector.setZ(firstVector.getZ() + secondVector.getZ());

        return resultVector;
    }

    public static Vector3D multiplication(Vector3D Vector, double number) {
        Vector.setX(Vector.getX() * number);
        Vector.setY(Vector.getY() * number);
        Vector.setZ(Vector.getZ() * number);

        return Vector;
    }

    public static Vector3D differenceOfVectors(Vector3D firstVector, Vector3D secondVector) {
        Vector3D resultVector = new Vector3D();

        resultVector.setX(firstVector.getX() - secondVector.getX());
        resultVector.setY(firstVector.getY() - secondVector.getY());
        resultVector.setZ(firstVector.getZ() - secondVector.getZ());

        return resultVector;
    }

    public static double scalarMultiplication(Vector3D firstVector, Vector3D secondVector) {
        Vector3D resultVector = new Vector3D();

        double result;
        resultVector.setX(firstVector.getX() * secondVector.getX());
        resultVector.setY(firstVector.getY() * secondVector.getY());
        resultVector.setZ(firstVector.getZ() * secondVector.getZ());

        result = resultVector.getX() + resultVector.getY() + resultVector.getZ();

        return result;
    }

    public static Vector3D vectorMultiplication(Vector3D a, Vector3D b) {
        Vector3D resultVector = new Vector3D();

        resultVector.setX(a.getY()*b.getZ() - a.getZ() * b.getY());
        resultVector.setY(a.getX()*b.getZ() - a.getZ() * b.getX());
        resultVector.setZ(a.getX()*b.getY() - a.getY() * b.getX());

        return resultVector;
    }

    static void checkVectors(Vector3D a, Vector3D b) {
        Vector3D resultVector = Vector3DProcessor.vectorMultiplication(a,b);

        if (resultVector.getX() == 0 && resultVector.getY() == 0 && resultVector.getZ() == 0)
            System.out.println("Они коллинеарны");
        else System.out.println("Они неколлинеарны");
    }
}
