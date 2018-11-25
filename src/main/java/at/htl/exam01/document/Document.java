package at.htl.exam01.document;

abstract public class Document {

    private String author;
    public Document(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public abstract String toString();
}
