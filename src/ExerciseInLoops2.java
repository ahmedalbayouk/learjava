import java.util.Scanner;

public class ExerciseInLoops2 {
    public static void main(String[] args) {
        /*
        Write a java program to find a factorial value of any number entered through the user
         */
        Scanner in=new Scanner(System.in);
        System.out.print("Enter integer number to find the factorial of it:");
        int num= in.nextInt();
        int factorial=1;
        for (int i =num; i >0 ; i--) {
            factorial*=i;
        }
        System.out.printf("the factorial of the number %d = %d",num,factorial);

    }
}
