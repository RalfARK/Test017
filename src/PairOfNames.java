import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PairOfNames {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String n1, n2, szuk;
        Map<String, String> mapaImion = new HashMap<>();

        while (true) {
            System.out.println("Podaj imie 1: ");
            n1 = in.nextLine();
            if (n1.equals("-")) {
                break;
            }
            System.out.println("Podaj imie 2: ");
            n2 = in.nextLine();
            if (n2.equals("-")) {
                break;
            }
            mapaImion.put(n1, n2);
        }
        System.out.println("Wprowadzone pary imon: ");
        Set<Map.Entry<String, String>> st = mapaImion.entrySet();
        for (Map.Entry<String, String> mmm : st) {
            System.out.print(mmm.getKey() + " : ");
            System.out.println(mmm.getValue());
        }

        System.out.println("Podaj szukane imie: ");
        szuk = in.nextLine();

        if (mapaImion.containsKey(szuk)) {
            System.out.println("para do szukanego imienia: " + mapaImion.get(szuk));
        }
        else {
            System.out.println("nie ma szukanego imienia");
        }

        //st.stream().forEach(System.out::println);



    }
}
