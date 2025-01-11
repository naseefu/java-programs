import java.util.ArrayList;

public class ArrayExample2 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (int j : arr) {
            System.out.println(j);
        }

        System.out.println();

        for(Integer i:list){
            System.out.println(i);
        }

    }

}
