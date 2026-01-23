package Lesson2_Fibonacci;


/**
 * Write a description of class Main here.
 *
 * @author (Colin Hawley)
 * @version (1/23/26)
 */
public class Main
{
    public static void main(String[] args) 
    {
      
        //number of elements to generate in the sequence
        final int MAX_TO_GENERATE = 15;
    
        // create the array to hold the sequence of Fibonacci numbers
        int[] fibonacci = new int[MAX_TO_GENERATE];
    
        //create the first 2 Fibonacci sequence elements
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        //create the Fibonacci sequence and store it in int[] sequence
        for (int i = 1; i < fibonacci.length - 1; i++)
        {
            int nextNumber = findNextElement(fibonacci, i);
            fibonacci[i + 1] = nextNumber;
        }
    
        //print the Fibonacci sequence numbers
        for (int i = 0; i < fibonacci.length; i++)
        {
            System.out.println(fibonacci[i]);
        }
        
    }
      
    // This method returns the element that comes after element 'toFind'
    public static int findNextElement (int[] arr, int toFind) 
    {
        int nextValue = arr[toFind] + arr[toFind - 1];
        return nextValue;
    }
}
