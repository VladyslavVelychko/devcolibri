import java.util.*;

public class Main {

    public static void main(String[] args){

        List<String> list = new ArrayList<String>();
        list.add("afdsg");
        list.get(0);
        list.remove(0);
        for (String n : list) {
            System.out.println(n);
        }

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("key1",2);
        map.put("key2",12);
        map.put("key3",23);
        map.put("key4",25);

        Integer key = map.get("key2");
        //System.out.println(key);

        //map.remove("key3");
        /*Set<String> strings = map.keySet();
        for (String i : strings){
            System.out.println(i);
        }*/

        //map.containsKey()

        for (Integer k : map.values()){
            System.out.println(k);
        }
    }
}