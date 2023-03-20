import java.util.Scanner;

public class Recursion_RecursiveMethods2{
    public static void main(String[] args) {
        System.out.println("febo="+febo(7));
        System.out.print(n1+" "+n2);
        int num=5;
        prinfeb(num-2);
        System.out.println("sum = "+sum(4,6));
    }
    static int febo(int n) {
        if (n == 0 || n == 1)
            return n;

        else
                return febo(n - 1) + febo(n - 2);
            }
    static int n1=0,n2=1,n3;
    static void prinfeb(int n){
        if(n>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            prinfeb(n-1);
    }
    }
    static int sum(int n1, int n2){
        if (n1==n2){
            return n1;
        }

        else
        {
            if (n1<n2)
                return n1+sum(n1+1,n2);

            else
                return n1+sum(n1-1,n2);
        }
    }
    }