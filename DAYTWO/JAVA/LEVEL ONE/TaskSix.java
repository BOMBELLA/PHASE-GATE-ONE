import java.util.Scanner;

public class TaskSix{

       public static void main(String[] args){

       Scanner userInput = new Scanner(System.in);

       int number = userInput.nextInt();

       System.out.println("Enter the length:    ");

       int length = userInput.nextInt();

       System.out.println("Enter the width:    ");  

       int width = userInput.nextInt();    

       int area = length * width;


       System.out.println(area);



}
}

