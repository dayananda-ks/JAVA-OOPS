import java.util.Scanner;

public class javaswitch {
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
        javaswitch obj = new javaswitch();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int a = sc.nextInt();
        System.out.print("Enter a second number: ");
        int b = sc.nextInt();
        System.out.print("Enter a opeartion: ");
        String opertion  = sc.next();

        switch (opertion){
            case "+":
                System.out.println("The result of addition is: " + obj.addition(a,b));
                break;
            case "-":
                System.out.println("The result of subtraction is: " + obj.subtraction(a,b));
                break;
                case "*":
                System.out.println("The result of multiplication is: " + obj.multiplication(a,b));
                break;
                case "/":
                System.out.println("The result of division is: " + obj.division(a,b));
                break;
                default:
                System.out.println("Invalid operation");
                break;
        }
    }
}

