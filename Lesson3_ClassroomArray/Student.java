package Lesson3_ClassroomArray;


/**
 * Write a description of class Student here.
 *
 * @author (Colin Hawley)
 * @version (1/28/26)
 */
public class Student
{
    private String firstName, lastName;
    private int grade;
    
    public Student(String firstName, String lastName, int grade)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
    
    public String toString()
    {
        return "Grade " + this.grade + ": " + this.firstName + " " + this.lastName;
    }
}
