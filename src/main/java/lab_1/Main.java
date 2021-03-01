package lab_1;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class Main {

    public static void main(String[] args) throws Exception  {
//        Basics.startAll();
        Basics.selectQuestion();

//        Arrays.startAll();
        Arrays.selectQuestion();

        startPoint3DQuestion();
        startVector3DQuestion();
        startVector3DProcessor();
        startVector3DArray();

        return;
    }

    private static void startPoint3DQuestion() {
        Point3D point1 = new Point3D();
        System.out.println(point1.toString());

        Point3D point = new Point3D(10,10,10);
        System.out.println(point.toString());

        point.setX(5);
        point.setY(5);
        point.setZ(5);

        System.out.println("Точка с изменёнными значениями");
        System.out.println(point.toString());

        System.out.println(point.getX());
        System.out.println(point.getY());
        System.out.println(point.getZ());

        System.out.print(point.toString() + " " + point1.toString());
        System.out.println("\nСравнение двух данных точек");

        if (point.equals(point1)) System.out.println("Они равны");
        else System.out.println("Они не равны");

        System.out.print(point.toString() + " " + point.toString());
        System.out.println("\nСравнение точки с самой собой");

        if (point.equals(point1)) System.out.println("Они равны");
        else System.out.println("Они не равны");
    }

    private static void startVector3DQuestion() {
        Vector3D vector = new Vector3D();
        System.out.println("Конструктор без параметров");
        System.out.println(vector.toString());

        Vector3D vector1 = new Vector3D(3,6,9);
        System.out.println("Конструктор с параметрами");
        System.out.println(vector1.toString());

        System.out.println("Конструктор по координатам точки");

        Point3D point1 = new Point3D();
        Point3D point = new Point3D(10,10,10);

        Vector3D vector2 = new Vector3D(point1, point);
        System.out.println(vector2.toString());

        double length = vector2.lengthCalculation();
        System.out.println("Длина последнего вектора равна");
        System.out.println(length);

        System.out.print(vector1.toString() + " " + vector2.toString());
        System.out.println("\nСравнение двух данных векторов");

        if (vector1.equals(vector2)) System.out.println("Они равны");
        else System.out.println("Они не равны");
    }

    private static void startVector3DProcessor() {
        Vector3D vector1 = new Vector3D(3,6,9);

        Point3D point1 = new Point3D();
        Point3D point = new Point3D(10,10,10);
        Vector3D vector2 = new Vector3D(point1, point);

        System.out.println(Vector3DProcessor.sumOfVectors(vector1, vector2));
        System.out.println(Vector3DProcessor.differenceOfVectors(vector1, vector2));
        System.out.println(Vector3DProcessor.scalarMultiplication(vector1,vector2));
        System.out.println(Vector3DProcessor.vectorMultiplication(vector1,vector2));

        Vector3DProcessor.checkVectors(vector1,vector2);
    }

    private static void startVector3DArray() {
        Vector3D vector1 = new Vector3D(3,6,9);

        Point3D point1 = new Point3D();
        Point3D point = new Point3D(10,10,10);
        Vector3D vector2 = new Vector3D(point1, point);

        int size = 5;
        Vector3DArray array = new Vector3DArray(size);
        System.out.println("Размер данного массива = " + array.myArrayLength());

        array.change(vector1,2);
        array.change(vector2,3);

        System.out.println(array.maxLength());

        System.out.println("Результат первого вхождения vector1 = " + array.search(vector1));

        Vector3D vector3 = array.sumOfVectorsArray();
        System.out.println("Сумма всех векторов в массиве = " + vector3);

        double[] numbers = new double[size];
        for (int i = 0; i < 5; i++) numbers[i] = Math.random() % 10;

        Vector3D vector4 = array.linCombination(numbers);
        System.out.println("Линейная комбинация векторов = " + vector4);

        Point3D[] points;
        points = array.shiftP(point);

        for (Point3D point3D : points) System.out.println(point3D);
    }
}
