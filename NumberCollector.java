import java.util.ArrayList;
import java.util.Scanner;

public class NumberCollector {
    ArrayList<Long> numbers = new ArrayList<>();
    Scanner input = new Scanner(System.in);

   
    // Method to collect 8 long numbers from the user
    public void collectLong() {

        System.out.println("Enter the amount of numbers you want to enter:");
        int count=input.nextInt();

        System.out.println("Enter  numbers:");
        for (int i = 0; i < count; i++) {
            long number = input.nextLong();
            numbers.add(number);
        }
    }

    // Method to get the collected numbers
    public ArrayList<Long> getNumbers() {
        return numbers;
    }
}
