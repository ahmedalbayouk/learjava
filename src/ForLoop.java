import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        /*
        write a java program calculate  the sum of 10 floating  numbers using for loop
         */
        Scanner in=new Scanner(System.in);
        float num=0,sum=0;
        for (int i = 1; i <=10; i++) {
            System.out.println("Enter number #:"+i);
            num=in.nextFloat();
            sum+=num;
        }
        System.out.println("the sum of 10 numbers is = "+sum);
    }
}
