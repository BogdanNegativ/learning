public class MyVector {
    private float x, y, z;

    public MyVector() {
        x = y = z = 0;
    }

    public MyVector(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s", x, y, z);
    }

    public float getLength() {
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public float scalarSum(MyVector second) {
        return x * second.getX() + y * getY() + z * second.getZ();
    }

    public MyVector vectorSum(MyVector second) {
        return new MyVector(
                y * second.getZ() - z * second.getY(),
                z * second.getX() - x * second.getZ(),
                x * second.getY() - y * second.getX()
        );
    }

    public float getAngle(MyVector second) {
        return scalarSum(second) / (getLength() * second.getLength());
    }

    public MyVector getSum(MyVector second) {
        return new MyVector(
                x + second.getX(),
                y + second.getY(),
                z + second.getZ()
        );
    }

    public MyVector getDiff(MyVector second) {
        return new MyVector(
                x - second.getX(),
                y - second.getY(),
                z - second.getZ()
        );
    }
}
