import java.util.Scanner;

public class SwitchCases {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        switch (x){
            case 1:
                System.out.println("1");
                break;
                case 2:
                    System.out.println("2");
                    break;
                    case 3:
                        System.out.println("3");
                        break;
                        default:
                            System.out.println("default");
                            break;
        }

    }

}
