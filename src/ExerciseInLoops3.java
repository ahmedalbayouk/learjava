import java.util.Scanner;

public class ExerciseInLoops3 {
    public static void main(String[] args) {
        /*
        write a java program enters 10 integers number from the user, and then
        print the sum of even and odd numbers
         */
        Scanner in=new Scanner(System.in);
        int num;
        int evensum=0,oddsum=0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number:");
             num=in.nextInt();
             if(num%2==0){
                 evensum+=num;
             }
             else
                 oddsum+=num;

        }
        System.out.printf("sum of even numbers = %d\nsum of odd numbers = %d",evensum,oddsum);

    }
}
