package at.htl.exam01.document;

public class Email extends Document{

    //region getter and setter
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpfaenger() {
        return empfaenger;
    }

    public void setEmpfaenger(String empfaenger) {
        this.empfaenger = empfaenger;
    }
    //endregion

    String autor;
    String name;
    String empfaenger;

    public Email() {

    }

    public Email(String autor, String betreff, String empfaenger) {
        this.autor = autor;
        this.name = betreff;
        this.empfaenger = empfaenger;
    }
}
