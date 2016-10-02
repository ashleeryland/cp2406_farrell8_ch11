/**
 * Created by Ashlee on 28/09/2016.
 */
public class DomesticDivision extends Division
{
    protected String state;
    public DomesticDivision(String title, int account, String st)
    {
        super(title, account);
        state = st;
    }
    public void display()
    {
        System.out.println("Domestic Division: " +
                divisionTitle + "  Account Number" + accountNum +
                "\nLocated in " + state);
    }
}
