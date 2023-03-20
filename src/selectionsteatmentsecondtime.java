import javax.swing.*;
import java.util.Scanner;
public class selectionsteatmentsecondtime {

    public static void main(String[] args) {

        float number;
        System.out.print("Enter number:");
        Scanner in = new Scanner(System.in);
        number = in.nextFloat();
        if(number==10)
            System.out.println("even and equal 10");

        if (number % 2 == 0) {
            if (number > 10) {
                System.out.println("even");
                System.out.println("and greater than 10");
            } else {
                System.out.println("even");
                System.out.println("less than 10");
            }
        } else {
            System.out.println("odd number");
            if (number > 10){
                System.out.println("and grater than 10");

            }
            else{
                System.out.println("odd number");
                System.out.println("and less than 10");
            }
        }
    }
}
