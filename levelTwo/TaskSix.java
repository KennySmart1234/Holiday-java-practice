import java.util.Scanner;

public class TaskSix{

    public static void main(String... args){
    Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter your password: ");
        int userPassword = inputCollector.nextInt();
        int storedPassword = 12345;

    while (userPassword != storedPassword){
        System.out.print("Enter your password: ");
        userPassword = inputCollector.nextInt();
        
        
        }
        
    }
    



}
