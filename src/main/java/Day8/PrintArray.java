package Day8;

public class PrintArray {
    public static void toPrint(Integer[] inputArray) {
        for(int integer : inputArray) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void toPrint(Double[] inputArray) {
        for(double doubleVal : inputArray) {
            System.out.print(doubleVal + " ");
        }
        System.out.println();
    }

    public static void toPrint(Character[] inputArray) {
        for(char character : inputArray) {
            System.out.print(character + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {100, 99, 98, 97, 96};
        Double[] doubleArray = {3.14, 23.14, 0.412, 2.718, 1.618};
        Character[] charArray = {'D', 'H', 'R', 'U', 'V'};

        PrintArray.toPrint(intArray);
        PrintArray.toPrint(doubleArray);
        PrintArray.toPrint(charArray);
    }
}
