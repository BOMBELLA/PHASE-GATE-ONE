import java.util.Scanner;

public class TaskFour{

       public static void main(String[] args){

       Scanner userInput = new Scanner(System.in);

       System.out.println("Enter a number:   ");

       int number = userInput.nextInt();

       int largestNumber = number;

       int secondNumber = largestNumber;

       
       if(number >  largestNumber){

       System.out.println("Higher");


      }
      else {

              
        if(number < largestNumber){

       System.out.println("Lower");

              }

              } 

       else {
               

       if(secondNumber > largestNumber){
          System.out.println("The second number is the larger");    
       
              }     
              }

       else {
              

       if(secondNumber < largestNumber){
          System.out.println("The second number is not the larger");

              }
              }


       else {
              

        if(largestNumber > secondNumber){
          System.out.println("The largest number is the larger one"); 

              }
              }

         else {
        
          System.out.println("The largest number is the larger"); 

              }
       

}








}
