import java.util.Scanner;

public class SelectionStatment3 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("enter one of three choices(1,2,3):");
        int x=in.nextInt();
        switch (x){
            case 1:
                System.out.print("ahmed is the best man in the world ");
                break;
            case 2:
                System.out.println("coding is art");
                break;
            case 3:
                System.out.println("صلِ على النبي ");
                break;
            default:
                System.out.println("I told you there is just 3 choices (1,2,3)");
        }
    }
}
