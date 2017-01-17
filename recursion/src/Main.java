public class Main {
    public static void main(String [] args) {
        int value = calcDiv(11,3);
        System.out.println(value);
    }

    static int calcDiv(int a, int b) {
        int div=a-b;
        if (div==8) {
            div=calcDiv(2,3);
        }
        return div;
    }
}
