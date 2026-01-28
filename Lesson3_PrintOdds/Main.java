package Lesson3_PrintOdds;


/**
 * Write a description of class Main here.
 *
 * @author (Colin Hawley)
 * @version (1/28/26)
 */
public class Main
{

    public static void main(String[] args)
    {
        int[ ] values = {17, 34, 56, 2, 19, 100};
        
        for (int value : values)
        {
            if (value % 2 == 1)
            {
                System.out.println(value + " is odd");
            }
        }
    }
}
