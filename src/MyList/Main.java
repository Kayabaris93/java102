package MyList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<Integer>();
        System.out.println("Dizi kapasitesi : " + liste.getCapacity());
        liste.add(1);
        liste.add(9);
        liste.add(0);
        liste.add(5);
        System.out.println("Eleman sayisi : " + liste.size());
        System.out.println(liste.toString());

        MyList<String> list2 = new MyList<String>();
        list2.add("B");
        list2.add("A");
        list2.add("R");
        list2.add("I");
        list2.add("Ş");
        System.out.println(list2.toString());

    }
}
