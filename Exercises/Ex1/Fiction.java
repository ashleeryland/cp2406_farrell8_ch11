/**
 * Created by Ashlee on 28/09/2016.
 */
public class Fiction extends Book
{
    public Fiction(String title)
    {
        super(title);
        setPrice();
    }
    public void setPrice()
    {
        super.price = 24.99;
    }

}
