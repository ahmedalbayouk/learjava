public class BranchingStatement2 {
    public static void main(String[] args) {

        nextline:for (int row = 1; row <=5; row++) {
            System.out.println();
            for (int column = 1; column <=10; column++) {
                if(column>row)
                    continue nextline;
                System.out.print("* ");
                /*
                if(column>=row)
                    break;
                    another solution
                    */
            }
            System.out.println("anything");
        }
    }
}
