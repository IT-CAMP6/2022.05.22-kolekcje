package pl.camp.it.kolekcje;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        System.out.println(lista.size());

        lista.add("String");

        String cosZListy = lista.get(0);

        System.out.println(lista.size());

        System.out.println(lista.get(0));

        lista.add("Mateusz");

        System.out.println(lista.get(1));

        //lista.add(2.58);

        //System.out.println(lista.get(2));

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(2);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(2);
        l2.add(3);
        l2.add(4);

        l1.removeAll(l2);

        System.out.println(l1);

        LinkedList<LinkedList<String>> listaListStringow = new LinkedList<>();

        listaListStringow.add(new LinkedList<>());
    }
}
