import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter number:");
        float num=in.nextFloat();

        if(num%2==0&&num>10){
            System.out.println("even and greater than 10");
        }

        else if (num%2==0&&num<10) {
            System.out.println("even and lower than 10");
        }
        else if(num%2!=0&&num>10){
            System.out.println("odd and greater than 10");
        }
        else if(num%2!=0&&num<10){
            System.out.println("odd and lower than 10");
        }
        else {
            System.out.println("even and equal 10");
        }
    }
}
