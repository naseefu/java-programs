public class LogicalOperation {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 7;

        if(a>b && a>c){
            System.out.println("a is largest");
        }
        else if(b>a && b>c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }

    }

}
