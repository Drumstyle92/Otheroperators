/**
 * @author Drumstyle92
 * class that contains the core of the program.
 */
public class Tester {
    /**
     * @param args main parameter.
     * main method that contains booleans and prints.
     */
    public static void main(String[] args) {

// boolean 1
        int a = 15;
        a += 5;
        a -= 4;
        int b = ++a;
        boolean out1 = b % 2 != 0;
// boolean 2
        int c = b * (b + 1);
        boolean out2 = c % 3 == 0;

        System.out.println("---------------OutFinal---------------");
        System.out.println(out1 && out2);
    }
}
