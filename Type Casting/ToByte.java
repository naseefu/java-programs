public class ToByte {

    public static void main(String[] args) {

        int a = 257;

        byte b = (byte) a; // modulo operation => 257%256 = 1;

        byte b1 = 20;
        byte b2 = 10;

        int i1 = b1*b2; // type promotion

        System.out.println(b);
        System.out.println(i1);

    }

}
