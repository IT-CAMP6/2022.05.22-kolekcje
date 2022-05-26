package pl.camp.it.kolekcje;

import java.util.HashSet;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        TreeSet<String> zbior = new TreeSet<>();

        System.out.println(zbior.size());

        zbior.add("Mateusz");

        System.out.println(zbior.size());

        zbior.add("Ania");
        zbior.add("Karol");
        zbior.add("Zbigniew");
        zbior.add("Bartek");
        zbior.add("Ania");

        for(String element : zbior) {
            System.out.println(element);
        }

        System.out.println(zbior);
    }
}
