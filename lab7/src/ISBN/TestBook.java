package ISBN;


import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    int [] a=new int[5];
    int i,j,tg;
        System.out.println("Enter five ISBN ");
        for(i=0;i<5;i++) {
            a[i] = input.nextInt();
        }
            System.out.println("The ISBN numbers of the books are:");
        System.out.println("The ISBN number of the books in ascending order are");
        for(i=0;i<5;i++){
        for(j=i+1;j<5;j++)
        {
            if(a[i]>a[j]){
                tg=a[i];
                a[i]=a[j];
                a[j]=tg;
            }
        }
        System.out.println(a[i]);
    }
}
}
