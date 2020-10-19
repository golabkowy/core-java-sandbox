package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FunWithMaps {

    static class Obj {
        int x;
        Integer y;
        String lol;

        public Obj(int x, Integer y, String lol) {
            this.x = x;
            this.y = y;
            this.lol = lol;
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
//        Map<String,Integer> set = new HashSet<>();
        Set<String> set = new HashSet<>();

        // he he Autoboxing and Unboxing ;) Here, new reference is not created.
        Integer x = 5;
        Integer y = 5;

        String xyy = new String("str");
        String xy = new String("str");
//
//        System.out.println(x.equals(y));
//        System.out.println(x == y);
//
        System.out.println(xyy.equals(xy));
        System.out.println(xyy == xy);

        Object obj = new String("iksde");
        Object String = new Object();

    }
}
