package Day6;

import java.util.Arrays; // Standard library for printing array elements

class arrayElm {

    public void withoutArray(int a, int b, int c) {
        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);
    }

    public void withArray(int array[]) {
        System.out.println("Array: " + Arrays.toString(array));
    }
}

public class Array {

    public static void main(String[] args) {

        // Without Array
        int a = 10;
        int b = 20;
        int c = 30;

        // With Array
        int arry[] = {10, 20, 30};

        // Object creation
        arrayElm arr = new arrayElm();
        arr.withoutArray(a, b, c);
        arr.withArray(arry);
    }
}