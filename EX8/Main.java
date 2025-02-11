package EX8;

// Създайте клас Book с полета за година на издаване, заглавие и жанр.
// Създайте колекция от книги.
// С помоща на Stream:
// 1. Принтирайте всеки елемент с forEach
// 2. Сортирайте колекцията по годината
// 3. Създайте списък само със заглавия с функцията map
// 4. Групирайте книгите по жанр с collect(Collectors.groupingBy())

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book(2021, "Harry Potter", "Fantasy"));
        books.add(new Book(2009, "To kill a killer", "Horror"));
        books.add(new Book(2014, "Billy Gilmore", "Action"));

        books.stream().forEach(book -> System.out.println(book));
        System.out.println();

        books.stream().sorted(Comparator.comparingInt(Book::getYear)).forEach(book -> System.out.println(book));
        System.out.println();

        List<String> titles = books.stream().map(Book :: getTitle).toList();
        System.out.println(titles);
        System.out.println();

        //books.stream().map(Book::getTitle).forEach(book -> System.out.println(book));
        //System.out.println();
        //Принтира елементите един под друг, а не в лист както е по условие

        Map<String, List<Book>> bookMap = books.stream().collect(Collectors.groupingBy(Book::getGenre));
        for(Map.Entry<String, List<Book>> entry : bookMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}