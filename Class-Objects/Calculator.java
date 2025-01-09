public class Calculator {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        Add add = new Add();

        System.out.println(add.add(a, b));


    }

}

class Add{

    public int add(int a,int b){
        return a+b;
    }

}
