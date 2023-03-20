import java.util.Scanner;

public class ExerciseInLoops4 {
    public static void main(String[] args) {
        /*
        write a java program enters 10 integers number from the user, and then
        print the number  of even and  the number of odd numbers
         */
        Scanner in=new Scanner(System.in);
        int num;
        int evencount=0,oddcount=0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number:");
            num=in.nextInt();
            if(num%2==0){
                evencount++;
            }
            else
                oddcount++;

        }
        System.out.printf("sum of even numbers = %d\nsum of odd numbers = %d",evencount,oddcount);
    }
}
