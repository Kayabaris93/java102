package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(40);
        liste.add(null);




        // System.out.println(liste);
        // System.out.println(liste.size());
        // System.out.println(liste.get(3));
        // System.out.println(liste.lastIndexOf(null));
        liste.add(2,22);
        liste.set(5,100);

        for (Integer element: liste) {
           System.out.println(element);
        }

    }
}
