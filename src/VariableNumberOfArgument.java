import java.util.Scanner;

public class VariableNumberOfArgument {
    public static void main(String[] args) {

        System.out.println("sum="+sum(1,2,3));

    }
    static int sum(int...n){
        int s=0;
        for(int i:n){
            s+=i;
        }
        return s;
    }
}
