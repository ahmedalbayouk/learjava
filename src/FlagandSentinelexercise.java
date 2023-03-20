import java.util.Scanner;

public class FlagandSentinelexercise {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int mark,sum=0,avg=0,count=0;
        boolean flag=true;
        while (flag){
            System.out.println("Enter mark number:"+(count+1));
            mark=in.nextInt();
            if (mark!=-1){
            sum+=mark;
            count++;
            }
            else
                flag=false;

        }
        avg=sum/count;
        System.out.printf("sum=%d average=%d",sum,avg);
    }
}
