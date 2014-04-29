import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by student on 4/29/14.
 */
public class Lab3 {

    public static void main(String[] args) {
        sayHello("John", "Sarah", "Bob", "Jane");
    }

    /*private static void sayHello(String... names){
        for(String name: names) {
            System.out.println("Hello " + name);
        }
      }
     */

    private static void sayHello(String... names){
        for(String name: names) {
            try {
                System.out.println(getGreeting() + " " + name);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static String getGreeting() throws Exception{
        Date now = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(now);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        if(hour < 12) {
            return "Good Morning";
        } else if(hour < 24) {
            return "Good Afternoon";
        } else {
            throw new Exception("More than 24 hours in a day!");
        }
    }
}
