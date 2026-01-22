package Lesson1_LastElement;


/**
 * Write a description of class Main here.
 *
 * @author (Colin Hawley)
 * @version (1/22/26)
 */
public class Main
{
    public static void main(String[] args)
    {
        // TEST DATA. DO NOT CHANGE
        double[] unitCircle = { 0, 1.57, 3.14, 6.28, 7.85 };
        
        //get and print the last element of the array
        double lastElement =  getLastElement(unitCircle);
        
        System.out.println("The final unit circle value is " + lastElement);
    }

    public static double getLastElement(double[] arr)
    {
        // Your code goes here!
        int i = arr.length - 1;
        
        return arr[i];
    }
}
