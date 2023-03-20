import java.util.Scanner;

public class FoundTheNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size;
        int n=0;
        System.out.println("Enter the size of array:");
        size=in.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < arr.length;i++) {
            System.out.print("Enter number:");
            arr[n]=in.nextInt();
            if(arr[n]==3){
                System.out.println("found");
                break;
            }
            System.out.println("not found");
        }

    }
}
