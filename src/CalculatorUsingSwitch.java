import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float num1,num2;
        System.out.print("Enter the first number:");
        num1=in.nextFloat();

        System.out.print("Enter the second number:");
        num2=in.nextFloat();

        System.out.print("Enter on of equation(*,/,%,+,-):");
        String eq;
        eq= in.next();

        switch (eq){
            case "*":
                System.out.print(num1*num2);
                break;
            case "/":
                System.out.print(num1/num2);
                break;
            case "%":
                System.out.print(num1%num2);
                break;
            case "+":
                System.out.print(num1+num2);
                break;
            case"-":
                System.out.println(num1-num2);
                break;
            default:
                System.out.print("please choose the right option");
        }
    }
}
