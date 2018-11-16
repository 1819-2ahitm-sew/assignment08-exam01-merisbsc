package at.htl.exam01.document;

public class Main {

    /**
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */
    public static void main(String[] args) {

        Buch buch1 = new Buch("Rowlings", "Harry Potter und der Stein der Weisen");
        Buch buch2 = new Buch("Tolkien", "lordOfTheRings");
        Email email = new Email("Susi", "Bewerbung", "CoolCompany");

        Document[] docs = {buch1, buch2, email};

        int nrOfBooks = nrOfBooks(docs);
        int nrOfEmails = nrOfEmails(docs);

        for (int i = 0; i < docs.length; i++) {
            if (docs[i] instanceof Buch) {
                System.out.printf("Book: \'%s\' von \'%s\'\n", docs[i].getName(), docs[i].getAutor());
            } else {
                System.out.printf("Email: \'%s\' von \'%s\' an \'%s\'\n", docs[i].getName(), docs[i].getAutor(), docs[i].getEmpfaenger());
            }
        }
        System.out.println();
        System.out.println("Anzahl Books: " + nrOfBooks);
        System.out.println("Anzahl Emails: " + nrOfEmails);

    }



    private static int nrOfEmails(Document[] docs) {
        int counter = 0;

        for (int i = 0; i < docs.length; i++) {
            if (docs[i] instanceof Email) {
                counter++;
            }
        }

        return counter;
    }

    private static int nrOfBooks(Document[] docs) {
        int counter = 0;

        for (int i = 0; i < docs.length; i++) {
            if (docs[i] instanceof Buch) {
                counter++;
            }
        }

        return counter;
    }


}
