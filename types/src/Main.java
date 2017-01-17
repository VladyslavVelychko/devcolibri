public class Main {

    /*static int a = 2;
    static double b = 4.9;
    static char c1 = 'd';
    static char c2 = 101;*/

    static Integer in = 2;
    static Float f = 2.6f;
    static Short s = 3;
    static Double d = 7.8;
    static String st = "27";


    public static void main(String[] args) {

        Number n = f;
        Number n1 = new Double(2.7);
        Integer r1 = n.intValue();
        Integer r2 = n1.intValue();

        System.out.println(r1);
        System.out.println(r2);

        Number n3=f;
        int ns = n3.intValue();

        /*int c = (int) b;

        double b1 = a;

        int v = c1;

        System.out.println(c);
        System.out.println(b1);
        System.out.println(v);
        System.out.println(c2);*/
    }
}
