/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Ivana San Pedro)
 * @version (2/3/25)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numPages, int numBorrowed, boolean text)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        refNumber = "";
        borrowed = numBorrowed;
        courseText = text;
    }

    /**
     * Returns the name of the author
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Returns the title of the book
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Returns the number of pages in the book
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * Prints the author's name
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    /**
     * Prints the title of the book
     */
    public void printTitle()
    {
        System.out.println(title);
    }
    
    /**
     * Prints the details of the book
     * Includes the title, author's name, number of pages, the reference number, and the 
     * number of times the book has been borrowed
     */
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
    
    /**
     * Sets the reference number for a library
     * Prints out an error message if the String length is not at least three characters
     */
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
    
    /**
     * Returns the reference number
     */
    public String getrefNumber()
    {
        return refNumber;
    }
    
    /**
     * Each time it is called, the field updates by 1 each time
     * Returns the number of times the book has been borrowed
     */
    public int borrow()
    {
        borrowed+=1;
        return borrowed;
    }
    
    /**
     * Prints the number of times the book has been borrowed
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * Returns if the text is used as a textbook on a course
     */
    public boolean isCourseText()
    {
        return courseText;
    }
}
