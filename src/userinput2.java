import java.util.Scanner;
public class userinput2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float n1,n2,n3;
        float sum,avg;
        System.out.print("Enter the first num:");
        n1=in.nextFloat();

        System.out.print("Enter the second num:");
        n2=in.nextFloat();

        System.out.print("Enter the third num:");
        n3=in.nextFloat();
        sum=n1+n2+n3;
        avg=sum/3;

        System.out.printf("sum=%.1f\navg =%.1f",sum,avg);

    }
}
