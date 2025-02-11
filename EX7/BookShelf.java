package EX7;
import java.util.LinkedList;
import java.util.Queue;

public class BookShelf {
    private Queue<String> shelves;

    public BookShelf(){
        shelves = new LinkedList<>();
    }

    public void addBook(String shelf){
        shelves.add(shelf);
        System.out.println(shelf + " has been added!");
    }

    public String takeBook(){
        if(shelves.isEmpty()){
            System.out.println("There arent any books to take!");
            return null;
        }
        String takeBook = shelves.poll();
        System.out.println(takeBook + " has been taken!");
        return takeBook;
    }


}
