public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <=3; j++) {
                System.out.println("j="+j+"//"+"i="+i+"//");
                for (int k = 1; k <= 3; k++) {
                    System.out.println("k="+k+"//"+"j="+j+"//"+"i="+i);
                }
                System.out.println("");
            }
        }
    }
}
