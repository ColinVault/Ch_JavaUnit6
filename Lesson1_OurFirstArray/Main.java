package Lesson1_OurFirstArray;


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
        // Create the 3 arrays here
        String[] city = { "Las Vegas", "Minsk", "Sao Paulo" };
        int[] population = { 667501, 2038822, 12330000 };
        double[] sunshine = { 8.11, 1.36, 6.05 };
        // Print all 3 arrays according to the output in the description
        printPopulation(city, population);
        printSunshine(city, sunshine);
    }
    
    public static void printPopulation(String[] c, int[] p)
    {
        for (int i = 0; i < c.length; i++)
        {
            System.out.println(c[i] + "'s population is " + p[i]);
        }
    }
    
    public static void printSunshine(String[] c, double[] s)
    {
        for (int i = 0; i < c.length; i++)
        {
            System.out.println("The least amount of sunshine " + c[i] + " gets is " + s[i] + " hours a day");
        }
    }
}
