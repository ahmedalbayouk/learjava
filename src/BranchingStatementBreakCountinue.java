import java.util.Scanner;

public class BranchingStatementBreakCountinue {
    public static void main(String[] args) {
        System.out.println("text your self you have only three chances ");
        System.out.println("what is '5+10/2*10'=?");
        Scanner in=new Scanner(System.in);
        float num;
        for (int i = 0; i <3; i++) {
            System.out.println("your answer:");
            num=in.nextInt();
            if (num==55) {
                System.out.println("Excellent your answer is correct ");
                break;
            }

                else if(num!=55) {
                if(i==3)
                    continue;
                System.out.println("try again");
                }
        }
    }
}
