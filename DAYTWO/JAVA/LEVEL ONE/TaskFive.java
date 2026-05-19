import java.util.Scanner;

       public class TaskFive{
       
       public static void main(String[] args){

       Scanner userInput = new Scanner(System.in);

       System.out.println("Please kindly tell me your temperature:    ");

       int celsius = userInput.nextInt();
       
       int Fahrenhiet = (celsius *  9/5 + 32);
       
       System.out.println("The temperature is converted to Fahrenhiet is " + celsius);



}
}

