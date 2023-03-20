import java.util.Scanner;

public class ExerciseInLoops {
    public static void main(String[] args) {
        /*
        write a program that asking  the user to input  positive integer it should then
        print the multiplication table of that number.
         */
        Scanner in=new Scanner(System.in);
        int num=0,sum=0;
        System.out.print("Enter any integer number to print multiplication table of it:");
        num=in.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(num+"*"+i+"="+(i*num));

        }
    }
}
