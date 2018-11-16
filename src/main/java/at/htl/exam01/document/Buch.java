package at.htl.exam01.document;

public class Buch extends Document{

    String autor;
    String name;
    String empfaenger;

    public String getEmpfaenger() {
        return empfaenger;
    }

    public void setEmpfaenger(String empfaenger) {
        this.empfaenger = empfaenger;
    }

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
    //endregion

    public Buch() {

    }

    public Buch(String autor, String name) {
        this.autor = autor;
        this.name = name;
    }
}
