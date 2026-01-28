package Lesson3_ClassroomArray;


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
        Student stan = new Student("Stan", "Marsh", 4);
        Student kyle = new Student("Kyle", "Broflovski", 4);
        Student eric = new Student("Eric", "Cartman", 4);
        Student kenny = new Student("Kenny", "McCormick", 4);
        Student butters = new Student("Butters", "Scotch", 4);
        
        Student[] fourthGrade = { stan, kyle, eric, kenny, butters };
        
        for (Student classmate : fourthGrade)
        {
            System.out.println(classmate);
        }
    }
}
