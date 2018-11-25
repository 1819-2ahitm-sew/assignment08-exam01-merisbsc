package at.htl.exam01.document;

public class Buch extends Document{

    protected String title;

    public Buch(String author, String title) {
        super(author);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "\'" + getTitle() + "\' von \'" + getAuthor() + "\'";
    }
}
