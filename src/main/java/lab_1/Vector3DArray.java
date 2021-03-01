package lab_1;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class Vector3DArray {

    private final Vector3D[] array;

    public Vector3DArray(int size) {
        this.array = new Vector3D[size];

        for (int i = 0; i < size; i++)
            array[i] = new Vector3D();
    }

    public int myArrayLength() {
        return array.length;
    }

    public void change(Vector3D vector, int i) {
        array[i] = vector;
    }

    public double maxLength() {
        double max = 0;

        for (Vector3D vector3D : array) {
            if (max < vector3D.lengthCalculation()) {
                max = vector3D.lengthCalculation();
            }
        }

        return max;
    }

    public int search(Vector3D vector) {
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(vector)) return i;
        }

        return -1;
    }

    public Vector3D sumOfVectorsArray() {
        Vector3D vector = new Vector3D();

        for (Vector3D vector3D : array) {
            vector = Vector3DProcessor.sumOfVectors(vector, vector3D);
        }

        return vector;
    }

    public Vector3D linCombination (double[] numbers) {
        Vector3D vector= new Vector3D();

        if (array.length != numbers.length) {
            return new Vector3D();
        } else {
            for (int i = 0 ; i < array.length; i++) {
                vector = Vector3DProcessor.sumOfVectors(vector, Vector3DProcessor.multiplication(array[i], numbers[i]));
            }

            return vector;
        }
    }

    public Point3D[] shiftP (Point3D point3D){
        Point3D[] points = new Point3D[array.length];

        for (int i = 0; i < points.length; i++) {
            points[i] = new Point3D(
                    point3D.getX() + array[i].getX(),
                    point3D.getY() + array[i].getY(),
                    point3D.getZ() + array[i].getZ()
            );
        }

        return points;
    }
}

