package Day2;

class Cal {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

public class Calculation {
    public static void main(String[] args){
        Cal obj = new Cal();
        int a1 = obj.add(1,2);
        int a2 =  obj.subtract(3,2);
        System.out.println(a1);
        System.out.println(a2);
    }
}
