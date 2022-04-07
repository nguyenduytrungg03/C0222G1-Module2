package _06_inheritance_java.exercise.point2d_point3d;

public class Point3d extends  Point2d {
    private float z = 0.0f;

    public Point3d() {
    }

    public Point3d(float z) {
        this.z = z;
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        setZ(z);
    }
    public float[] getXYZ(){
        float[] arr2 = new float[3];
        return arr2;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                super.toString()+
                "z=" + z +
                '}';
    }
}
