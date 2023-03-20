import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter the first number:");
        num1=in.nextInt();
        System.out.println("Enter the second number:");
        num2=in.nextInt();
        System.out.println("Enter the third number:");
        num3=in.nextInt();

        int k=min(num1,num2,num3);
        System.out.println("the minimum of the numbers="+k);
    }
    static int min(int num1,int num2,int num3){
        int min=num1;
        if(num2<min)
            min=num2;
        if (num3<min)
            min=num3;
        return min;
    }

}