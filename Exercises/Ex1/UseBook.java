/**
 * Created by Ashlee on 28/09/2016.
 */
public class UseBook
{
    public static void main(String[] args)
    {
        Fiction ficBook = new Fiction("Harry Potter and the Philosopher Stone");
        NonFiction nonFicBook = new
                NonFiction("Donald Trumps Biography of Losing the USA Presidential Election");
        System.out.println("Fiction book " +
                ficBook.getTitle() + " costs $" +
                ficBook.getPrice());
        System.out.println("Non-Fiction book " +
                nonFicBook.getTitle() + " costs $" +
                nonFicBook.getPrice());
    }
}
