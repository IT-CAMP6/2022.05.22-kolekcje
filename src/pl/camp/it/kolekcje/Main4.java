package pl.camp.it.kolekcje;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        /*HashMap<String, String> mapa = new HashMap<>();

        mapa.put("Mateusz", "Bereda");

        System.out.println(mapa.size());

        System.out.println(mapa.get("Mateusz"));

        mapa.put("Mateusz", "Terlecki");

        System.out.println(mapa.size());

        System.out.println(mapa.get("Mateusz"));*/

        Map<Client, Client> clientsMap = new TreeMap<>();


        clientsMap.put(new Client("Mateusz", "Jakiś"), new Client("Mateusz", "Jakiś"));
        clientsMap.put(new Client("Mateusz", "Jakiś"), new Client("Janusz", "Kowalski"));
        clientsMap.put(new Client("Mateusz", "Jakiś"), new Client("Ania", "Kowalski"));
        clientsMap.put(new Client("Mateusz", "Jakiś"), new Client("JArek", "Kowalski"));
        clientsMap.put(new Client("Mateusz", "Jakiś"), new Client("Bogdan", "Kowalski"));
        clientsMap.put(new Client("Mateusz", "Jakiś"), new Client("Joanna", "Kowalski"));

        Client c = clientsMap.get(new Client("Mateusz", "Jakiś"));

        System.out.println(c.name);
        System.out.println(c.surname);

        Collection<Client> kolekcjaKlientow = clientsMap.values();

        System.out.println("-----------------------");

        for(Client client : kolekcjaKlientow) {
            System.out.println(client.name);
            System.out.println(client.surname);
        }

        /*Set<Map.Entry<Integer, Client>> pary = clientsMap.entrySet();




        for(Map.Entry<Integer, Client> jednaPara: pary) {
            jednaPara.getValue();
            jednaPara.getKey();
        }*/
    }
}
