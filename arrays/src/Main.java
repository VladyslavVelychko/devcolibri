public class Main {

    static int[] nums = new int[10];

    static String[] st = new String[5];

    public static void main(String [] args) {


        st[0]="Hello";
        st[1]=" World";
        st[2]=" and";
        st[3]=" ";
        st[4]="Vladyslav!";

        for (String s: st) {
            System.out.print(s);
        }

        nums[0] = 2;
        nums[1] = 51;
        nums[2] = 17;
        nums[3] = 38;
        nums[4] = 42;
        nums[5] = 64;
        nums[6] = 70;
        nums[7] = 89;
        nums[8] = 93;
        nums[9] = 22;
        System.out.println();
        for (int i=0; i<nums.length; i++) {
            System.out.println(i+ " : "+nums[i]);
        }

        /*for (int n : nums) {
            System.out.println(n);
        }*/

    }
}
