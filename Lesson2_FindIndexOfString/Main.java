package Lesson2_FindIndexOfString;
import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        
        System.out.println("What word do you want to check the string for?");
        String check = input.nextLine();
        
        int result = MatchingString.findString(check);
        
        System.out.println(result);
    }
}
