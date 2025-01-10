class Calculators{

    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, int b){
        return a+b; // double + int => double
    }

}

public class OverrideProgram {

    public static void main(String[] args) {

        Calculators obj = new Calculators();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));
        System.out.println(obj.add(5.4,2));
        System.out.println(obj.add(5.4,2));

    }

}
