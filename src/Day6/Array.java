package Day6;

import com.sun.security.auth.NTSidUserPrincipal;

import java.util.Arrays; // It is the Standard java libarary used for printing of All Elements in array. Without Using Standard library we print one by one by using index or key value.

class arrayElm {
<<<<<<< HEAD
=======

>>>>>>> 44546f3 (With and Without Array...)
    public void withoutArray(int a, int b, int c) {
        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);
    }
    public void withArray(int array []) {
        System.out.print("Array : " + Arrays.toString(array));
    }
}

public class Array {

    public static void main(String[] args) {
<<<<<<< HEAD
        // Without Array
=======
        //without Array
>>>>>>> 44546f3 (With and Without Array...)
        int a = 10;
        int b = 20;
        int c = 30;
        // Array
        int arry [] = {10,20,30};
<<<<<<< HEAD
        // Object creation for each type
        arrayElm arr = new arrayElm();
        arr.withoutArray(a, b, c);
        arr.withArray(arry);
=======
        //object creation for each type
        arrayElm arr = new arrayElm();
        arr.withoutArray(a, b, c);
        arr.withArray(arry);



>>>>>>> 44546f3 (With and Without Array...)
    }
}

