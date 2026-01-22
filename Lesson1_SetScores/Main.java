package Lesson1_SetScores;


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
        int[] scores = { 80, 95, 82, 67, 100 };
        
        printScores(scores);
        
        int[] newScores = scores;
        
        newScores[2] = 72;
        newScores[4] = 92;
        
        printScores(newScores);
    }
    
    public static void printScores(int[] s)
    {
        for (int i = 0; i < s.length; i++)
        {
            System.out.println(s[i]);
        }
        System.out.println();
    }
}
