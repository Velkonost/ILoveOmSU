package lab_1;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class Vector3D {

    private double x = 0, y = 0, z = 0;

    public Vector3D() {}

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D(Point3D startPoint, Point3D endPoint) {
        this.x = startPoint.getX() - endPoint.getX();
        this.y = startPoint.getY() - endPoint.getY();
        this.z = startPoint.getZ() - endPoint.getZ();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double lengthCalculation(){
        double length;
        length = Math.sqrt(x*x+y*y+z*z);
        return length;
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return (Math.abs(vector3D.x - x) < 1e-9) && (Math.abs(vector3D.y - y) < 1e-9) && (Math.abs(vector3D.z - z) < 1e-9);
    }
}