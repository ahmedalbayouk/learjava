import java.util.Scanner;

public class MaximanAndMinimumInArray {
    public static void main(String[] args) {
        /*
        writ a java program to find the maximum  and the minimum value of numbers
         */
        int max=0,min=0,sum=0;
        int num[]=new int[5];
        Scanner in=new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter number:");
            num[i]=in.nextInt();

            max=num[0];

            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("the maximum number = "+max);
    }
}
