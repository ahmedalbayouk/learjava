import java.util.Scanner;

public class ExersiseInLoops5 {
    public static void main(String[] args) {
        /*
        write a program to calculate the sum of following series where n is input by user
        1+ 1/2 +1/3 +1/4 +1/5+...1/n
         */
        Scanner in=new Scanner(System.in);
        int num;
        float sum=0;
        System.out.println("Enter number:");
        num=in.nextInt();
        for (int i = 1; i <=num ; i++) {
            sum+=1.0/i;
        }
        System.out.println("the sum ="+sum);
    }
}
