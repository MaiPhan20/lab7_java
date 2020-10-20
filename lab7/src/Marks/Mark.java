package Marks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Mark {
    int Marks[][];
    byte markCount;

    public Mark() {
        Marks = new int[3][3];
        markCount = 0;
    }

    void addMark() {

        Scanner input = new Scanner(System.in);
        if(markCount<Marks.length){
        System.out.println("Enter the IdName of the Marks");
        Marks[markCount][0] = input.nextInt();
        System.out.println("Enter the SubjectCode of the Marks ");
        Marks[markCount][1] = input.nextInt();
        System.out.println("Enter the mark of the Marks ");
        Marks[markCount][2] = input.nextInt();
        markCount++;
    }else
            System.out.println("Sorry!Unsble to add more Marks.\n");
}
void displayMarks(){
        if(markCount>0){
            System.out.println("\n idName \t\t SubjectCode \t Mark");
            System.out.println("-----------------------------------");
            for(int rowIndex=0;rowIndex<markCount;rowIndex++){
                System.out.printf("%d\t\t\t\t\t",Marks[rowIndex][0]);
                System.out.printf("%d\t\t\t",Marks[rowIndex][1]);
                System.out.printf("%d\t\t",Marks[rowIndex][2]);
            }

        }else
            System.out.println("No Marks to display");
}
void searchBySubjectCode(){
        boolean markFound=false;
        if(markCount>0){
            Scanner input=new Scanner(System.in);
            System.out.println("\nEnter the SubjectCode of the mark you want to"+"search for");
            int searchSubjectCode=input.nextInt();
            System.out.println("\n idName \t\t SubjectCode \tMark");
            System.out.println("---------------------------------");
            for(int rowIndex=0;rowIndex<markCount;rowIndex++){
                if(Marks[rowIndex][1]==searchSubjectCode){
                    System.out.printf("%d\t\t\t\t\t",Marks[rowIndex][0]);
                    System.out.printf("%d\t\t\t",Marks[rowIndex][1]);
                    System.out.printf("%d\n",Marks[rowIndex][2]);
                    markFound=true;
                    break;
                }
            }
            if(!markFound)
                System.out.println("Mark not found");
        }else
            System.out.println("No mark to search");
}

}
