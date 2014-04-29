/**
 * Created by student on 4/29/14.
 */
public class Lab1 {

    public static void main(String[] args) {
        String name = "Easter Bunny";
        int hour_of_day = 18;
        String greeting = null;
        if(hour_of_day < 12) {
            greeting = "Good Morning";
        } else {
            greeting = "Good Afternoon";
        }
        System.out.println(greeting + " " + name + ". How are you today?");
    }

}
