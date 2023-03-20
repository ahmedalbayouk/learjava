import java.util.Scanner;

public class FlagandSentinelcontroledwhileloop {
    public static void main(String[] args) {
        int counter=0;
        char letter='a';
        Boolean flag=true;
        Scanner in=new Scanner(System.in);

        while (flag){
            letter=in.next().charAt(0);
            counter++;

            if(letter=='f')
                flag=false;
        }
        System.out.println("count="+counter);
    }
}
