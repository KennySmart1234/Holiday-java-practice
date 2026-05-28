import java.util.Scanner;

public class TaskFive{

    public static void main(String... args){
    Scanner inputCollector = new Scanner(System.in);
    
        int count = 1;
        int total = 0;
    while (count <= 5){
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
        
        count++;
        total = total + number;
        
        }
        
        System.out.print(total);
    }
    



}
