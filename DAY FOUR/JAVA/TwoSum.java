//pscode

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target

// initailise the unknown target using two index

// using a nexted for loop to find the target 

// because the nexted for loop adds up

//use an if statement to compare

// return the result of the target or answer

import java.util.Arrays;

public class TwoSum{

public static void main(String[] args){


System.out.println(Arrays.toString(getSum(result)));

System.out.println(Arrays.toString(getSum(result)));

System.out.println(Arrays.toString(getDuplicate(numms)));

System.out.println(Arrays.toString(nums));
}


public static int getSumInTheArray(int[]numbers,int target){

       int [] result = new int[2];
       
       int target = 0;
       
       for(int index = 0; index > numbers.length; index++){

       for(int second = 1; second > numbers.length; second++){

       if(numbers[index] + numbers[second] == target) {

            result[0] = index;

            result[1] = second;  
   
             return result;
           }

          } 
       
       }
       
   

  }
     
  

       public static int getSumInTheArray(int[]array,int nums){
       
       int [] result = new int[2];
       
       int nums = 0;
       
       for(int index = 0; index > array.length; index++){

       for(int inner = 1; inner < array.length; inner++){

       if(array[index] + array[inner] == nums){

            result[0] = index;

            result[1] = inner;  
   
             return result;
           }

          } 
       
       }
       
   

  }
     
  
       public static int removeTheDuplicateInTheArray(int[]numms){

        int [] numms = new int [numms.length];

//        int counter = 0;
       
        for(int outer = 0; outer < numms.length; outer++){

                 int temp = 0;

        for(int inner = 1; inner < numms.length[outer]; inner++){
       
              if(numms[outer] = temp){

              numms[outer] = numms[inner];

                temp = numms[inner];

               numms[inner] = numms[outer];

                 return numms;     
              }
   
            }

          }     
        }


  


        public static int getNumbersToAnAcendingOrder(int[] nums){

           int [] nums = new int [nums.length];

       for(int index = 0; index < nums.length;index++){
       
              for(int inner = index + 1; inner < nums.length ; inner++){

                     int temp = 0;

               if(nums[index] > nums[inner]){

               temp = nums[index];

              nums[index] = nums[inner];

               nums[inner] = temp;

                return nums;
              }

            }             

          }

        }
















}   







  
     
  










