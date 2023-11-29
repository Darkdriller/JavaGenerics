package Day8;

public class TestMaximum<T extends Comparable<T>>{
//    public static Integer testMaximum(Integer x, Integer y, Integer z) {
//        Integer max = x;
//        if (y.compareTo(max) > 0) {
//            max = y;
//        }
//        if (z.compareTo(max) > 0) {
//            max = z;
//        }
//        return max;
//    }
//    public static Float testMaximum(Float x, Float y, Float z) {
//        Float max = x;
//        if (y.compareTo(max) > 0) {
//            max = y;
//        }
//        if (z.compareTo(max) > 0) {
//            max = z;
//        }
//        return max;
//    }
//
//    public static String testMaximum(String x, String y, String z) {
//        String max = x;
//        if (y.compareTo(max) > 0) {
//            max = y;
//        }
//        if (z.compareTo(max) > 0) {
//            max = z;
//        }
//        return max;
//    }
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
