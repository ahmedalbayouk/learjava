import java.util.Scanner;

public class TernaryOperator {
    /*write a java program calculate grade of student using ternary operator
     * if percentage >=90 print A
     * if percentage >=80 print B
     * if percentage >=70 print C
     * if percentage >=60 print D
     * Otherwise print you fail
     * */
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter your mark:");
        float mark=in.nextFloat();

        String r=(mark>=90&&mark<100)?"A":(mark>=80&&mark<90)?"B":(mark>=70&&mark<80)?"C":(mark>=60&&mark<70)?"D":(mark>=0&&mark<60)?"You fail":"please enter valid number";
        System.out.println(r);

    }
}
