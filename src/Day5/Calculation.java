
package Day5;

class Calculator
{
    int num = 5;
    // Instance variable stored inside HEAP (inside object)

    public int add(int n1, int n2)
    {
        System.out.println(num);
        return n1 + n2;
    }
}

public class Calculation {
    public static void main(String[] args) {

        int data = 10;
        // Primitive local variable → stored in STACK

        Calculator obj = new Calculator();
        // obj (reference) → stored in STACK
        // actual Calculator object → stored in HEAP

        Calculator obj1 = new Calculator();
        // obj1 (reference) → stored in STACK
        // second object → separate HEAP object

        int r1 = obj.add(3, 4);
        // r1 → stored in STACK
        // add() method → stack frame created temporarily (during execution only)
        obj.num = 8;

        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}