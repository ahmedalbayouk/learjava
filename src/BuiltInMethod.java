import static java.lang.Math.*;

public class BuiltInMethod {
    public static void main(String[] args) {
        int r;
        r=(int) (random()*((10-1)+1)-1);
        System.out.println("random ="+r);
        System.out.println("max ="+max(max(1,5),sqrt(100)));
        System.out.println("min="+(int)min(min(sqrt(9),pow(2,3)),9));
    }
}
