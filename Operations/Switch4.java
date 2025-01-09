public class Switch4 {

    public static void main(String[] args) {

        String day = "Sunday";
        String result = "";

        result = switch (day){

            case "Saturday","Sunday"-> "8am";
            case "Monday","Tuesday"-> "7am";
            default-> "6am";

        };
        System.out.println(result);

    }

}
