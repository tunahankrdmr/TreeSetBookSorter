import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookName().compareTo(o2.getBookName());
            }
        });

        books.add(new Book("Harry Potter", 400, "Rowling", "22.06.1990"));
        books.add(new Book("Yüzüklerin Efendisi", 561, "Tolkien", "14.02.1987"));
        books.add(new Book("Suç ve Ceza", 482, "Dostoyevski", "11.12.1976"));
        books.add(new Book("Faust", 702, "Goethe", "8.10.2000"));

        for (Book i : books){
            System.out.println(i.getBookName());
        }

        System.out.println("----------------");

        TreeSet<Book> books1=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage()-o2.getPage();
            }
        }.reversed());

        books1.add(new Book("Harry Potter", 400, "Rowling", "22.06.1990"));
        books1.add(new Book("Yüzüklerin Efendisi", 561, "Tolkien", "14.02.1987"));
        books1.add(new Book("Suç ve Ceza", 482, "Dostoyevski", "11.12.1976"));
        books1.add(new Book("Faust", 702, "Goethe", "8.10.2000"));

        for (Book i : books1){
            System.out.println(i.getBookName());
        }
    }
}
