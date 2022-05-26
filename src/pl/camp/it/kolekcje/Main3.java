package pl.camp.it.kolekcje;

import java.util.HashSet;
import java.util.Iterator;

public class Main3 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(33);
        set.add(4);
        set.add(5);


        Iterator<Integer> iterator = set.iterator();

        System.out.println(iterator);
        while (iterator.hasNext()) {
            int i = iterator.next();
            if(i == 33) {
                iterator.remove();
            }
        }

        System.out.println(set);

        /*for(int i : set) {
            if(i == 33) {
                set.remove(i);
            }
        }*/
    }
}
