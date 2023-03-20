public class Recursion_RecursiveMethods {

    public static void main(String[] args) {
        fun();
        System.out.println("fact="+factorial(5));
        fun2(5);
    }
    static int counter=0;
    public static void fun(){
        if (counter==5){
            return;
        }
        counter++;
            System.out.println("hi");
                fun();
    }
    static int factorial(int n){
        if (n==1||n==0){
            return 1;
        }
        else
        return n*factorial(n-1);
    }
    static void fun2(int n){
        if(n<1){
            return;
        }
        else
            System.out.println("#"+n);
            fun2(n-1);
    }
    static void fun3(int n){
        if(n<1){
            return;
        }
        else
            fun3(n-1);
        System.out.println(n);
    }
}
