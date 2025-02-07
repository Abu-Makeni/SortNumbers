import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an instance of NumberCollector and collect numbers
        NumberCollector collector = new NumberCollector();
        collector.collectLong();

        Scanner input=new Scanner(System.in);

        // Get the collected numbers
        ArrayList<Long> numbers = collector.getNumbers();

        // Create an instance of NumberProcessor
        NumberProcessor processor = new NumberProcessor();
        NumberProcessorDescending processorDescending=new NumberProcessorDescending();
        EvenOrOdd evenOrOdd=new EvenOrOdd();
        DisplayNumbers display=new DisplayNumbers();

        System.out.println("Choose \'A\' for ascending , \'D\'for descending ,\'E\' for even or \'O\' for odd:");
        char choices=input.next().charAt(0);

        switch (choices) {
            case 'A':
         
            // Sort the numbers
            processor.sortNumbersAscending(numbers);
                break;
                
            case 'D':
            
            // Sort the numbers
            processorDescending.sortNumbersDescending(numbers);
                break;

            case 'E':

            evenOrOdd.EvenNumber(numbers);
                break;

            case 'O':

            evenOrOdd.OddNumber(numbers);
                break;

        
            default:

            System.out.println("Invalid input");
                break;
        }
     
        
            // Display the sorted numbers
            display.displayNumbers(numbers);

        

        
    }
}
