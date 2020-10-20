package BookRepository;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class BookTest {
    public static void main(String[] args) {
        int choose =0;
        Book[] a = new Book[1];
        Scanner s = new Scanner(System.in);
        while(choose!=4 || choose <=0){
            System.out.println("Welcometo E-Repository");
            System.out.println("Select the operation you want to perform ");
            System.out.println("1.Add book to the repository ");
            System.out.println("2.Search book by book name ");
            System.out.println("3.Display book ");
            System.out.println("4.Exit");
            System.out.println("**************************");
            choose = s.nextInt();
            s.nextLine();
            switch(choose){
                case 1 :
                    for (int i = 0; i < a.length; i++) {
                        System.out.printf("Add book :\n",i);
                        a[i] = new Book();
                        a[i].Input();
                    }
                    break;
                case 2 :    System.out.print("Search book by name : ");
                    String name = s.nextLine();
                    searchByName(a, name);
                    break;
                case 3 :for (int i= 0; i < a.length; i++) {
                    System.out.printf("Display book :\n",i+1);
                    a[i].Outputsach();
                }
                    break;
            }
        }
    }
    public static void searchByName(Book a[], String name){
        for (int i= 0; i < a.length; i++) {
            if(a[i].getName().equals(name)){
                a[i].Outputsach();
            }
        }
    }
}

