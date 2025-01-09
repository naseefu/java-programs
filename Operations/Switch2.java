public class Switch2 {

    public static void main(String[] args) {

        String day = "Sunday";
        String result = "";

        result = switch (day){

            case "Saturday","Sunday":yield "8am";
            case "Monday","Tuesday":yield "7am";
            default:yield "6am";

        };
        System.out.println(result);

    }

}
