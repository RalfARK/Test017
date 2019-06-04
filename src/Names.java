import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Names {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Set<String> setNames = new HashSet<>();
        String n;

        while (true) {
            System.out.println("podaj imie: ");
            n = in.nextLine();
            if (n.equals("-")) {
                break;
            }
            setNames.add(n);

        }

        System.out.println("liczba elementow: " + setNames.size());
        for (String name : setNames) {
            System.out.println(name);
        }
    }

}
