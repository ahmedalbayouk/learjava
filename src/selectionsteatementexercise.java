import java.util.Scanner;

public class selectionsteatementexercise {
    public static void main(String[] args) {
        /*write a java program calculate grade of student
        * if percentage >=90 print A
        * if percentage >=80 print B
        * if percentage >=70 print C
        * if percentage >=60 print D
        * Otherwise print you fail
        * */

        Scanner in=new Scanner(System.in);
        System.out.print("Enter your grade:");
        float num=in.nextFloat();
        if(num>=90&&num<100)
            System.out.println("A");

        else if(num>=80&&num<90)
            System.out.println("B");

        else if(num>=70&&num<80)
            System.out.println("C");

        else if(num>=60&&num<70)
            System.out.println("D");
        else if(num<60&&num<=0)
            System.out.println("you fail");
        else
            System.out.println("please enter a valid mark");
    }
}