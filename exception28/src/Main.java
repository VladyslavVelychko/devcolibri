public class Main {
    public static void main(String[] args){

        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
        }

        /*String [] st = new String[2];

        try {
            System.out.println(st[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {//либо Exception,Throwable
            //ex.printStackTrace();
            System.out.println("Element does not exist");
        }*/

    }
}
