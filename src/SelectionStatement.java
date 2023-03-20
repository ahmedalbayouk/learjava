import java.util.Scanner;

public class SelectionStatement {
    /*
    if , if else , if else if ;
     */
    /*
    ==,equal to
    !=n not equal to
    > grater than
    >=grater than or equal to
    < less than
    <= less than or equal to  
     */
    public static void main(String[] args) {
       // Scanner test= new Scanner(System.in);
        //int num;
        //System.out.print("please enter any number:");
       // num= test.nextInt();
       /* if (num==4) {
            System.out.println("the number is 4");
            System.out.println("thanks");
        } */
        //if (num%2==0)
          //  if (num>=10)
          /*  {
                System.out.print("the number is even");
                System.out.println("the number is grader than 10 ");
            }else {
                System.out.print("the number is even");
                System.out.print("the number is less than 10 ");

            }

            else
            System.out.print("the number is  odd ");
*/
        Scanner test= new Scanner(System.in);
        int num;

        System.out.print("please Enter any number:");
        num= test.nextInt();

        if (num>10)
            System.out.println("the number is  more than 10");

        else if (num==10)
            System.out.println("the number is equal 10");

            else if (num<10)
                System.out.println("the number is less than 10");




    }
}
