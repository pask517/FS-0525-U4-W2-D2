package exercises.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ascendingNumbers = returnAscendingNumbers(10);
        System.out.println("Lista di numeri randomici: " + ascendingNumbers);
        System.out.println("Lista specchiata di numeri randomici: " + returnInvertedList(ascendingNumbers));
        returnOddsOrEvens(ascendingNumbers, false);
    }

    public static List<Integer> returnAscendingNumbers(int n) {
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbersList.add((int) Math.floor(Math.random() * 101));
        }
        Collections.sort(numbersList);
        return numbersList;
    }

    public static List<Integer> returnInvertedList(List<Integer> list) {
        List<Integer> returnList = new ArrayList<>();
        returnList.addAll(list);
        List<Integer> reversedList = list.reversed();
        returnList.addAll(reversedList);
        return returnList;
    }

    public static void returnOddsOrEvens(List<Integer> list, boolean b) {
        if (b) {
            System.out.println("Numeri in posizioni pari: ");
            for (int i = 0; i < list.size(); i += 2) {
                System.out.println(list.get(i));
            }
        } else {
            System.out.println("Numeri in posizioni dispari: ");
            for (int i = 1; i < list.size(); i += 2) {
                System.out.println(list.get(i));
            }
        }
    }
}
