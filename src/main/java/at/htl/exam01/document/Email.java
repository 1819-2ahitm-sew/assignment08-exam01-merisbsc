package at.htl.exam01.document;

public class Email extends Document{

    protected String subject;
    protected String to;

    public String getSubject() {
        return subject;
    }

    public String getTo() {
        return to;
    }

    public Email(String author, String subject, String to) {
        super(author);
        this.subject = subject;
        this.to = to;
    }

    public String toString() {
        return "\'" + getSubject() + "\' von \'" + getAuthor() + "\' an \'" + getTo() + "\'";
    }

}
