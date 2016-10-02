/**
 * Created by Ashlee on 28/09/2016.
 */
public abstract class UseDivision
{
    public static void main(String[] args)
    {
        DomesticDivision domDiv1 = new
                DomesticDivision("Marketing", 1, "Perth");
        DomesticDivision domDiv2 = new
                DomesticDivision("Technology", 2, "Brisbane");
        InternationalDivision intDiv1 = new
                InternationalDivision("Technology", 21, "China", "Chinese");
        InternationalDivision intDiv2 = new
                InternationalDivision("Sales", 22, "Swedan",
                "German");
        domDiv1.display();
        domDiv2.display();
        intDiv1.display();
        intDiv2.display();
    }
}
