import java.util.Scanner;

public class TaskNine{

    public static void main(String... args){
    Scanner inputCollector = new Scanner(System.in);

        int largest = 0;
        int count = 1;
    while (count <= 5){
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
        
        if(number > largest)
            largest = number;
        
        count++;
        
        
        }
        System.out.print(largest);    
    }
    



}
