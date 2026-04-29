package Day1;

public class Reuse {
    public int addition(int num1,int num2){
        return num1+num2;
    }
    public int subtraction(int num1,int num2){
        return num1-num2;
    }
    public int multiplication(int num1,int num2){
        return num1*num2;
    }
    public int division(int num1,int num2){
        if (num2 != 0) {
            return num1 / num2;
        } else {
        }
        System.out.println("Error: Division by zero is not allowed.");
        return 0;
    }
    public static void  main(String[] args) {
        Reuse obj = new Reuse();
        System.out.println("The result of addition is: " + obj.addition(10,5));
        System.out.println("The result of subtraction is: " + obj.subtraction(10,5));
        System.out.println("The result of multiplication is: " + obj.multiplication(10,5));
        System.out.println("The result of division is: " + obj.division(10,5));
    }
}
