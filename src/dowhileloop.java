import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            float num1,num2;
            char equation;
            int counter=0;
        System.out.print("enter first num:");
        num1=in.nextFloat();

        System.out.print("enter second num:");
        num2=in.nextFloat();
        System.out.print("Enter on of equation(*,/,%,+,-):");
        System.out.println("Enter (f) to exit the program");

            do{
                counter++;
                System.out.println("enter the equation#"+counter);
                equation=in.next().charAt(0);
                switch (equation){
                    case '*':
                        System.out.println(num1*num2);
                        break;
                    case '/':
                        System.out.println(num1/num2);
                        break;
                    case '%':
                        System.out.println(num1%num2);
                        break;
                    case '+':
                        System.out.println(num1+num2);
                        break;
                    case'-':
                        System.out.println(num1-num2);
                        break;
                    default:
                        System.out.println("please choose the right option");
                }
            }while(equation!='f');
    }
}
