import java.util.Scanner;

public class TaskTen{

    public static void main(String... args){
    Scanner inputCollector = new Scanner(System.in);

        int smallest = 0;
        int count = 1;
    while (count <= 5){
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
        
        if(number < smallest)
            smallest = number;
        
        count++;
        
        
        }
        System.out.print(smallest);    
    }
    



}
