import java.lang.reflect.Constructor;

public class Book {
    private String title;
    private String author;
    private int year;

    public void Constructor(String title, String author, int year){
                this.title = title;
                this.author = author;
                this.year = year;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
