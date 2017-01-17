import java.util.*;

public class Main {
    public static void main(String[] args){

        /*List<String> list = new ArrayList<String>();
        list.add("afdsg");
        list.get(0);
        list.remove(0);
        for (String n : list) {
            System.out.println(n);
        }*/

        Set<String> set = new HashSet<String >();
        set.add("afdsg");
        set.add("afdsgsa");
        set.add("afdsgs");

        for (String s : set) {
            System.out.println(s);
        }
        /*Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        set.remove("afdsgs");*/


    }
}