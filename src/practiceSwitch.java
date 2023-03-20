import java.util.Scanner;

public class practiceSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter any day on the week:");
        int day=in.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("work day");
                break;
            case 6:
            case 7:
                System.out.println("weakened");
                break;

            default:
                System.out.println("there is seven day a week?");
        }
    }
}
