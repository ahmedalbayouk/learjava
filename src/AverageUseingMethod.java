import java.util.Scanner;

public class AverageUseingMethod {
    //write a java method to compute the average of three numbers
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter the first num:");
        a=in.nextFloat();
        System.out.println("Enter the second num:");
        b=in.nextFloat();
        System.out.println("Enter the third num:");
        c=in.nextFloat();
        System.out.println("the average of the numbers ="+average(a,b,c));
    }
    static float average(float num1,float num2,float num3){
        float avg=(num1+num2+num3)/3;
        return avg;
    }
}

