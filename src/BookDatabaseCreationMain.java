import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class BookDatabaseCreationMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        //Use the method name
        CreateBookDatabase myBook1 = new CreateBookDatabase("Java1001", "Head First Java", "Kathy Sierra and Bert Bates",
                "Easy to read Java workbook", 47.50);
//        myBook1.getDisplayText();

        CreateBookDatabase myBook2 = new CreateBookDatabase("Java1002", "Thinking in Java", "Bruce Eckel",
                "Details about Java under the hood", 20.00);
//        myBook2.getDisplayText();

        CreateBookDatabase myBook3 = new CreateBookDatabase("Orcl1003", "\tOCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky",
                "Everything you need to know in one place", 45.00);
//        myBook3.getDisplayText();

        CreateBookDatabase myBook4 = new CreateBookDatabase("Python1004", "Automate the Boring Stuff with Python", "Al Sweigart",
                "Fun with Python", 10.50);
//        myBook4.getDisplayText();

        CreateBookDatabase myBook5 = new CreateBookDatabase("Zombie1005", "The Maker's Guide to the Zombie Apocalypse", "Simon Monk",
                "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50);
//        myBook5.getDisplayText();

        CreateBookDatabase myBook6 = new CreateBookDatabase("Rasp1006", "Projects for the Evil Genius", "Donald Norris",
                "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 14.75);
//        myBook6.getDisplayText();

        System.out.println("Please enter the SKU of the book you want to look up: ");
        String userSKU = keyboard.nextLine();

        if (userSKU.equalsIgnoreCase(myBook1.getSKU()))
            {
                System.out.println("SKU:" +myBook1.getSKU() + " " + "Author: " +myBook1.getAuthor() + " " + "Title: " +myBook1.getTitle() + " " + "Price: " +myBook1.getPrice());
            }
        else if (userSKU.equalsIgnoreCase(myBook2.getSKU()))
        {
            System.out.println("SKU:" +myBook2.getSKU() + " " + "Author: " +myBook2.getAuthor() + " " + "Title: " +myBook2.getTitle() + " " + "Price: " +myBook2.getPrice());
        }
        else if (userSKU.equalsIgnoreCase(myBook3.getSKU()))
        {
            System.out.println("SKU:" +myBook3.getSKU() + " " + "Author: " +myBook3.getAuthor() + " " + "Title: " +myBook3.getTitle() + " " + "Price: " +myBook3.getPrice());
        }
        else if (userSKU.equalsIgnoreCase(myBook4.getSKU()))
        {
            System.out.println("SKU:" +myBook4.getSKU() + " " + "Author: " +myBook4.getAuthor() + " " + "Title: " +myBook4.getTitle() + " " + "Price: " +myBook4.getPrice());
        }
        else if (userSKU.equalsIgnoreCase(myBook5.getSKU()))
        {
            System.out.println("SKU:" +myBook5.getSKU() + " " + "Author: " +myBook5.getAuthor() + " " + "Title: " +myBook5.getTitle() + " " + "Price: " +myBook5.getPrice());
        }
        else if (userSKU.equalsIgnoreCase(myBook6.getSKU()))
        {
            System.out.println("SKU:" +myBook6.getSKU() + " " + "Author: " +myBook6.getAuthor() + " " + "Title: " +myBook6.getTitle() + " " + "Price: " +myBook6.getPrice());
        }
        else
            {
            System.out.println("UserSKU does not match any SKUs in the database");
            }

    }
}
