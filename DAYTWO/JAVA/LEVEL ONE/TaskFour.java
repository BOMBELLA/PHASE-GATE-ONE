import java.util.Scanner;

public class TaskFour{

       public static void main(String[] args){

       Scanner userInput = new Scanner(System.in);

       System.out.println(" Tell me a number:    ");
       
       int number = userInput.nextInt();

       int product = number * number;


       System.out.println(product);



}
}
