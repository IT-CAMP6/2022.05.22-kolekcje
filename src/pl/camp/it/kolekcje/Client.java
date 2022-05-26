package pl.camp.it.kolekcje;

public class Client implements Comparable {
    String name;
    String surname;

    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
