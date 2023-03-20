import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class PracticeOneDayminsionalArray {
    public static void main(String[] args) {
        /*
        write a java program to sum and average values of an array.
         */
        int sum=0,size;
        double avg=0.0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of numbers:");
        size=in.nextInt();
        int Sum[]=new int[size];

        for (int i = 0; i < Sum.length; i++) {
            System.out.print("Enter number:");
            Sum[i]=in.nextInt();
            sum+=Sum[i];
        }
        avg=sum/ size;
        System.out.println("the sum of values =  "+sum);
        System.out.println("the avg of values = "+avg);
    }
}
