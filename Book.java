/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numPages, int numBorrowed)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        refNumber = "";
        borrowed = numBorrowed;
    }

    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        if (refNumber.length() > 0)
        {
            System.out.println("Reference Number: " + refNumber);
        }
        else
        {
            System.out.println("Reference Number: ZZZ");
        }
        System.out.println("Number of times it has been borrowed: " + borrowed);
    }
    
    public void setRefNumber(String ref)
    {
        if (ref.length() >= 3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("Error: String must consist of " + 
            "three characters or more");
        }
    }
    
    public String getrefNumber()
    {
        return refNumber;
    }
    
    public int borrow()
    {
        borrowed+=1;
        return borrowed;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
}
