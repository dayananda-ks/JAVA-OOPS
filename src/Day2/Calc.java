package Day2;

class Cal {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

class AdvClac extends Cal {
    public int multiply(int a, int b) {
        return a * b;
    }
    public int Div(int a, int b) {
        return a /b;
    }
}
public class Calc {
    public static void main(String[] args){
        AdvClac obj = new AdvClac();
        int a1 = obj.add(1,2);
        int a2 =  obj.subtract(1,2);
        int a3 =  obj.multiply(1,2);
        int a4 =  obj.Div(1,2);
        System.out.println(a1);
    }
}
