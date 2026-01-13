package exercises.exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di elementi da inserire");
        int n = Integer.parseInt(scanner.nextLine());

        HashSet<String> uniqueSet = new HashSet<>();
        ArrayList<String> duplicates = new ArrayList<>();

        System.out.println("Inserisci " + n + " stringhe");
        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci stringa");
            String string = scanner.nextLine();
            if (!uniqueSet.add(string)) {
                duplicates.add(string);
            } else {
                uniqueSet.add(string);
            }
        }
        System.out.println("Duplicati: " + duplicates);
        System.out.println("Numero parole distinte: " + uniqueSet.size());
        System.out.println("Elenco parole distinte: " + uniqueSet);
    }
}
