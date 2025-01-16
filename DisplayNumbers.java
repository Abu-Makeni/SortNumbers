import java.util.ArrayList;

public class DisplayNumbers {
    // Method to display the numbers
    public void displayNumbers(ArrayList<Long> numbers) {
        System.out.println("Here are the sorted numbers:");
        for (Long number : numbers) {
            System.out.println(number);
        }
    }
}