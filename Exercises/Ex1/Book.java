/**
 * Created by Ashlee on 28/09/2016.
 */
public abstract class Book
{
    String title = new String();
    double price;
    public Book(String t)
    {
        title = t;
    }
    public String getTitle()
    {
        return title;
    }
    public double getPrice()
    {
        return price;
    }
    public abstract void setPrice();
}