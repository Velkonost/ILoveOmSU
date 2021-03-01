package lab_1;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class Point3D {
    private double x = 0, y = 0, z = 0;

    public Point3D() {}

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return (Math.abs(point3D.x - x) < 1e-13) && (Math.abs(point3D.y - y) < 1e-13) && (Math.abs(point3D.z - z) < 1e-13);
    }

}