/**
 * Created by Ashlee on 28/09/2016.
 */
public class BookArray
{
    public static void main(String[] args)
    {
        Book books[] = new Book[10];
        int x;
        books[0] = new Fiction("Harry Potter 2");
        books[1] = new NonFiction("Space");
        books[2] = new Fiction("Harry Potter 4");
        books[3] = new NonFiction("Cooking with Friends");
        books[4] = new Fiction("Sex and the City");
        books[5] = new NonFiction("Travel Guide");
        books[6] = new Fiction("Lord of the Rings");
        books[7] = new Fiction("Simposons Book");
        books[8] = new NonFiction("Mona Lisa");
        books[9] = new NonFiction("Perth Travel Guide");
        for(x = 0; x < books.length; ++x)
            System.out.println("Book: " +
                    books[x].getTitle() + " costs $" +
                    books[x].getPrice());
    }
}
