package EX7;
import java.util.LinkedList;

public class HashTable {
   static class Entry{
       String key;
       String value;

       Entry(String key, String value){
           this.key = key;
           this.value = value;
       }
   }

   private final int size;
   private LinkedList<Entry>[]table;

   public HashTable(int size) {
       this.size = size;
       table = new LinkedList[size];
       for (int i = 0; i < size; i++){
           table[i] = new LinkedList<>();
       }
   }

    private int hash(String key) {
        int hashValue = 0;
        for (char ch : key.toCharArray()) {
            hashValue += ch;
        }
        return hashValue % size;
    }

    public void add(String key, String value) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry(key, value));
        System.out.println("Added: " + key + " who's email is " + value);
    }

    public String get(String key) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }
}
