import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest{

    @Test
    public void test thatIHaveTwoNumbersThatCanAddEachOtherInTheGivenArray(int [] numbers,int target){

        int [] numbers = {8,6,12,4,-2};

        int expectedValue = {8,-2};

        int actualValue = TwoSum.getSumInTheArray(numbers);

        assertEquals(actualValue, expectedValue);


       }

  @Test
    public void test thatIHaveTwoNumbersThatCanAddEachOtherInTheGivenArraysss(int [] array,int nums){

        int [] array = {1,2,5,7,6,8,9};

        int expectedValue = {5,7};

        int actualValue = TwoSum.getSumInTheGivenArray(array);

        assertEquals(actualValue,expectedValue);
                                                                                                                                                                                             

       }

   @Test
     public void test thatICanRemoveTheDuplicateInTheArray(int [] numms){

        int [] numms = {9,5,1,9,4,5,1,7};

        int expectedValue = {9,5,1,4,7};

        int actualValue = TwoSum.removeTheDuplicateInTheArray(numms);

        assertEquals(actualValue,expectedValue);

       }  
           
       

   @Test
     public void test thatISortTheNumbersToAscendingOrder(int [] arrays){

       int [] arrays = {14,9,6,5,8,10};
       
       int expectedValue = {5,6,7,8,9,10,11,12,13,14};

       int actualValue = TwoSum.sortNumbersFromSmallest(arrays);

       assertEquals(actualValue,expectedValue);

     }




      
-




















}

















