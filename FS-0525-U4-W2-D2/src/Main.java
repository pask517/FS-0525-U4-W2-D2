import entities.User;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User aldo = new User("Aldo", "Baglio");
        User giovanni = new User("Giovanni", "Storti");
        User giacomo = new User("Giacomo", "Poretti");

        ArrayList<User> usersList = new ArrayList<>();

        System.out.println("La lista ha " + usersList.size() + " elementi");

        usersList.add(aldo);
        usersList.add(giovanni);
        usersList.add(giacomo);
        System.out.println("La lista ha " + usersList.size() + " elementi");

        usersList.addFirst(new User("Ajeje", "Brazorf"));
        System.out.println("La lista ha " + usersList.size() + " elementi");
        System.out.println(usersList);


        try {
            User found = usersList.get(10);
            System.out.println(found);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("UTENTE NON TROVATO");
        }


        int giacomoIndex = usersList.indexOf(new User("Giacomo", "Poretti"));
        System.out.println("L'indice di Giacomo é: " + giacomoIndex);

        if (usersList.contains(new User("Giacomo", "Poretti"))) {
            System.out.println("Giacomo é nella lista");
        } else {
            System.out.println("Giacomo non é nella lista");
        }

        if (usersList.contains(giacomo)) {
            System.out.println("Giacomo é nella lista");
        } else {
            System.out.println("Giacomo non é nella lista");
        }


        usersList.remove(0);
        usersList.remove(giacomo);
        usersList.removeFirst();
        usersList.removeLast();

        System.out.println(usersList);


        ArrayList<User> usersList2 = new ArrayList<>(Arrays.asList(aldo, giovanni, giacomo));
        usersList.addAll(usersList2);
        usersList.addAll(usersList2);

        System.out.println("Users list: " + usersList);
        System.out.println("Users list 2: " + usersList2);
    }
}
