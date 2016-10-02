/**
 * Created by Ashlee on 28/09/2016.
 */
public class StudentDemo
{
    public static void main(String[] args)
    {
        Student students[] = new Student[6];
        int i;
        students[0] = new UndergraduateStudent("124567", "Ryland");
        students[1] = new UndergraduateStudent("728738", "Lawson");
        students[2] = new GraduateStudent("278369", "Maddick");
        students[3] = new GraduateStudent("09825", "Payne");
        students[4] = new StudentAtLarge("278361", "Coles");
        students[5] = new StudentAtLarge("67345", "Speck");
        for(i = 0; i < students.length; ++i)
            System.out.println("\nStudent No: " +
                    students[i].getId() + " - Name: " +
                    students[i].getLastName() + "  - Tuition: " +
                    students[i].getTuition() + " per year");
    }
}