/**
 * Created by Ashlee on 28/09/2016.
 */
public class StudentAtLarge extends Student
{
    public static final double SAL_TUITION = 2000;
    public StudentAtLarge (String id, String name)
    {
        super(id, name);
        setTuition();
    }
    public void setTuition()
    {
        tuition = SAL_TUITION;
    }
}
