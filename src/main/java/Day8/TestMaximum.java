package Day8;

public class TestMaximum<T extends Comparable<T>>{
    T x, y, z;
    public TestMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T testMaximum(){
        return testMaximum(this.x,this.y,this.z);
    }

    public static <T extends Comparable<T>> T testMaximum(T... values) {
        T max = values[0];
        for (T value : values) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }
    public static <T> void printMax(T max) {
        System.out.println("Maximum Value: " + max);
    }
    public static void main(String[] args) {
        System.out.println("Maximum of 3, 4, 5 is: " + new TestMaximum(3, 4, 5).testMaximum());
        System.out.println("Maximum of 3.14, 2.78, 1.68 is: " + new TestMaximum(3.14f, 2.78f, 1.68f).testMaximum());
        System.out.println("Maximum of Add, Arc, Art is: " + new TestMaximum("Add", "Arc", "Art").testMaximum());
    }
}
