public class OverLoadingMethod {
    public static void main(String[] args) {
        System.out.println("order="+order(1,5,"by order of the beaky blinders"));
        fun(15);
        main(1);

    }
    static float order (float price){

        return price;
    }
    static float order (float price,int deleverycost){

        return price+deleverycost;
    }
    static float order(float price,int deleverycost,String descount){
        return price+deleverycost-2;
    }
    static void fun(){
        System.out.print("function");
    }
    static void fun(int x){
        fun();
        System.out.println(" x = "+x);
    }
    public static void main(int num){
        System.out.println(num);
    }

}


