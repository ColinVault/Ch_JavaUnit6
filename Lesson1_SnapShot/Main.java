package Lesson1_SnapShot;


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
        String[] screenshot = { "Welcome", "to", "the snap shot", "app!" };
        
        printScreen(screenshot);
        
        screenshot[0] = "Upgrade";
        screenshot[3] = "premium app!";
        
        printScreen(screenshot);
    }
    
    public static void printScreen(String[] s)
    {
        for (int i = 0; i < s.length; i++)
        {
            System.out.println(s[i]);
        }
        System.out.println();
    }
}
