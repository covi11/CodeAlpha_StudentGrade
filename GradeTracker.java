import java.util.*;

public class GradeTracker 
{
    public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        
        System.out.println("Enter the number of students:");
        int numStudents = scan.nextInt();
        
        // Grades input
        for (int i = 0; i < numStudents; i++) 
		{
            System.out.println("Enter the grade for student number " + (i+1) + ":");
            int grade = scan.nextInt();
            grades.add(grade);
        }
        
        // Average
        int sum = 0;
        for (int grade : grades) 
		{
            sum += grade;
        }
        int average = sum / numStudents;
        
        // Highest and lowest grades
        int highest = grades.get(0);
        int lowest = grades.get(0);
        for (int grade : grades) 
		{
            if (grade > highest) 
			{
                highest = grade;
            }
            if (grade < lowest) 
			{
                lowest = grade;
            }
        }
        
        // Output 
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        
        scan.close();
    }
}