package BookSorter;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>();

        books.add(new Book("Hayvan Çiftliği", 152, "George Orwell" , "2000"));
        books.add(new Book("Kürk Mantolu Madonna", 232, "Sabahattin Ali", "2000"));
        books.add(new Book("Seker Portakalı", 184, "José Mauro de Vasconcelos", "2000"));
        books.add(new Book("Dönüşüm", 75, "Franz Kafka", "2000"));
        books.add(new Book("Simyacı", 188, "Paulo Coelho", "2000"));


        for (Book b: books) {
            System.out.println("Kitap Adı :" + b.getBookName() +"\t "+ " Sayfa Sayısı: " + b.getBookPage());
        }






    }
}
