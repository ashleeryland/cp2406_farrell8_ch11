/**
 * Created by Ashlee on 28/09/2016.
 */
public class InternationalDivision extends Division
{
    protected String country;
    protected String language;
    public InternationalDivision(String title, int account, String cty, String lang)
    {
        super(title, account);
        country = cty;
        language = lang;
    }
    public void display()
    {
        System.out.println("International Division: " + divisionTitle +
                "  Account Number " + accountNum + "\nLocated in " + country +
                " Language is " + language);
    }
}

