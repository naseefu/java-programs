public class ArrayExample1 {

    public static void main(String[] args) {

        int[] arr = new int[5]; // this is java-style array declaration

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
