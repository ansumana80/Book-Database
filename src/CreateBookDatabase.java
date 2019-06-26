//A book database class will contain a method to return a book object.
// We haven't exactly learned how to create a database or read/write to files yet.
// We're going to use the knowledge we already have to create a class.
// Our class will simulate a database and return a populated book object.
// We'll simulate a database by simply using if or switch
// statements to look up a book based on SKU. Later,
// we'll create a database using Oracle that also returns a book object.
//Our book database will contain several book titles and the SKU code to look one up.

public class CreateBookDatabase
{
    private String title, author, description;
    private double price;
    private boolean isInStock;
    String SKU;

    // constructor runs when the keyword 'new' is encountered
    // no argument constructor
    public CreateBookDatabase()
    {
        System.out.println("The constructor has run");
    }
    //overloaded constructor allows us to pass parameters
//    public CreateBookDatabase( String SKU, String title, String author, String description, double price, boolean isInStock)
    public CreateBookDatabase( String SKU, String title, String author, String description, double price)
    {

        this.SKU=SKU;
        this.title=title;
        this.author=author;
        this.description=description;
        this.price=price;
//        this.isInStock=isInStock;
    }
    //method

    public void setSKU(String SKU)
    {
        this.SKU=SKU;
    }

    public String getSKU()
    {
        return SKU;
    }

    public void setTitle(String title)
    {
        this.title=title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setAuthor(String author)
    {
        this.author=author;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setDescription(String description)
    {
        this.description=description;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price=price;
    }

//    public boolean getisInStock ()
//    {
//        return isInStock;
//    }
//
//    public void setisInStock (boolean isInStock)
//    {
//        this.isInStock=isInStock;
//    }

    public void getDisplayText()
    {
        System.out.println("SKU: " + this.SKU+ " " + "Author: " + this.author + " " + "Title : " + this.title
                + " " + " Description : "
                + this.description + " " + "Price : " + this.price);
    }

}

//System.out.println("SKU: " + this.SKU+ " " + "Author: " + this.author + " " + "Title : " + this.title
//        + " " + " Description : "
//        + this.description + " " + "Price : " + this.price + " " + "IsinStock: " + this.isInStock);
//        }