/**
 * Created by student on 4/29/14.
 */
public class Lab2 {

    public static void main(String[] args) {

        int count = 5;
        System.out.println("For loop with index");
        for(int i = 0; i < count; i++){
            System.out.println("Loop " + i + " times.");
        }

        String[] names = {"John", "Sarah", "Bob", "Jane"};
        System.out.println("Loop over array");
        for (String name: names) {
            System.out.println("Hello " + name);
        }
    }
}
