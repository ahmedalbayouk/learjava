public class PrefixandPostfix {
    /*
    postfix, post increment= x++ بيطبع بعدين بيزيد
    pre increment , prefix= ++x بيزيد بعدين بيطبع
     */
    public static void main(String[] args) {
        /*
        basic Operators high priority
        post++
        ++pre
         */
        /* int x =1,y;
        //++x;
        //x++;
        System.out.println("x = " + x++ + " " + ++x + " "+ x++);
        System.out.println("final x = "+ x );*/
        /*int x = 1, y;
        y=++x + x++;
        System.out.println("x="+x);
        System.out.println("y="+y);
         */

        // the  assignment operators
        // = += *= /= %=
        // int k = 2;
        //k= k+10;
        //k+=10; // k = k+10
        int x=13,y=4,z=8;
        x+= y - z;
        System.out.println("x = " + x);

    }
}
