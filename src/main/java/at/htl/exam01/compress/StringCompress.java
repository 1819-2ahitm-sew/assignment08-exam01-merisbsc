package at.htl.exam01.compress;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringCompress {

    private static final String FILE_NAME = "sample.txt";

    /**
     * Main-Methode, hier wird das StringCompress-Objekt erstellt
     * und die Methoden des Objekts werden aufgerufen
     *
     * @param args
     */
    public static void main(String[] args) {
        StringCompress sc = new StringCompress();
        String[] text = sc.readFromFile(FILE_NAME);
        sc.print(text);
    }


    /**
     *
     * Sämtliche Zeilen werden aus der Textdatei eingelesen
     * zB 5A
     * Nun wird in das String-Array AAAAA geschrieben
     *
     * Bsp Testdatei
     * 5A
     * 3B
     * 4C
     *
     * ergibt eine String-Array mit 3 Elementen
     * AAAAA
     * BBB
     * CCCC
     *
     * @param fileName
     * @return String-Array mit dem entpacktem Text
     */
    public String[] readFromFile(String fileName) {
        //StringBuilder sb = new StringBuilder();
        String[] text = new String[getNoOfLines(FILE_NAME)];
        int i = 0;

        try (Scanner scanner = new Scanner(new FileReader(FILE_NAME))) {
            while (scanner.hasNextLine()) {
                text[i] = scanner.nextLine();
                i++;
            }
        } catch(FileNotFoundException e) {
            System.err.println(e);
        }

        return text;
    }


    /**
     * Der Inhalt des String-Arrays wird zeilenweise auf der Console ausgegeben
     *
     *
     * @param lines String-Array
     */
    public void print(String[] lines) {
        String zahl = "";
        int anzahl = 0;
        //String-Array erstellen leer befüllen
        String[] strings = new String[getNoOfLines(FILE_NAME)];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "";
        }

        for (int i = 0; i < lines.length; i++){
            for (int j = 1; j < lines[i].length(); j++) {
                zahl += lines[i].charAt(j);
            }

            anzahl = Integer.parseInt(zahl);

            for (int k = 0; k < anzahl; k++) {
                strings[i] += lines[i].charAt(0);
            }
            zahl = "";
        }

        for (int l = 0; l < strings.length; l++) {
            System.out.println(strings[l]);
        }

    }

    /**
     * Die Anzahl der Zeilen der übergebenen Textdatei wird bestimmt
     *
     * @param fileName
     * @return Anzahl der Zeilen in der Textdatei
     */
    public int getNoOfLines(String fileName) {
        int counter = 0;

        try (Scanner scanner = new Scanner(new FileReader(FILE_NAME))) {
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                counter++;
            }
        } catch(FileNotFoundException e) {
            System.err.println(e);
        }

        return counter;
    }
}
