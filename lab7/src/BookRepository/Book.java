package BookRepository;

import Marks.Mark;

import java.util.Scanner;

public class Book {

    int  ISBN;
    String  name;
    String  author;
    short     yearPublished;
    double  price;
    public Book() {
    }
    public Book(int ISBN , String name, String author, short yearPublished, double price) {
        this.ISBN = ISBN;
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public  void setPrice(double price) {
        this.price = price;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public void setYearPublished(short yearPublished) {
        this.yearPublished = yearPublished;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author= author;
    }
    public double getPrice() {
        return price;
    }
    public int getISBN() {
        return ISBN;
    }
    public int getYearPublished() {
        return yearPublished;
    }

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    void Outputsach(){
        System.out.println("Name :" +name);
        System.out.println("ISBN :" +ISBN);
        System.out.println("Year Published :" +yearPublished);
        System.out.println("Price: "+price);
        System.out.println("Author :" +author);
        System.out.println("Name         ISBN         Year           Price           Author");
        System.out.println("\t"+name   +ISBN     + yearPublished     +price          +author);    }
    void Input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter book name :");
        name = s.nextLine();
        System.out.println("Eter author name :");
        author = s.nextLine();
        System.out.println("Enter book price: ");
        price=s.nextDouble();
        System.out.println("Enter ISBN of the book:");
        ISBN = s.nextInt();
        System.out.println("Enter year of publication :");
        yearPublished = s.nextShort();

    }
}



