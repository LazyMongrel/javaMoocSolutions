
public class Book {
    private String title;
    private int pages;
    private int pbYear;

    public Book(String title,int pages,int pbYear){
        this.title = title;
        this.pages=pages;
        this.pbYear=pbYear;
    }
    public String getTitle(){
        return this.title;
    }

    public String toString(){
        return this.title+", "+pages+" pages, "+pbYear;
    }
}

