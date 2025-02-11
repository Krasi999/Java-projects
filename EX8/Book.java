package EX8;

public class Book {
    private int year;
    private String title;
    private String genre;

    Book(int year, String title, String genre){
        this.year = year;
        this.title = title;
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "year=" + year +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
