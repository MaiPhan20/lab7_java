package Marks;

import java.util.Scanner;

public class MarkTest {
    public static void main(String[] args) {
        int choice;
        Scanner input=new Scanner(System.in);
        Mark objMark= new Mark();
        do {
            System.out.println("\nWelcome to E-repository.\n" + "Select the operation you want to perform:");
            System.out.println("**************************************************************");
            System.out.println("1.Add mark to the repository");
            System.out.println("2.Search mark by SubjectCode");
            System.out.println("3.Display mark");
            System.out.println("***************************************************************");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    objMark.addMark();
                    break;
                case 2:
                    objMark.searchBySubjectCode();
                    break;
                case 3:
                    objMark.displayMarks();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
                }
              }  while (choice!=4);

            }
        }


