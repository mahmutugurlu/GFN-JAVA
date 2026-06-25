import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListTutorial {
    public static void main(String[] args) {

        /*
         * LISTEN (ArrayList)
         * ==================
         * Eine ArrayList ist eine dynamische Liste, die Elemente aufnehmen und entfernen kann.
         * -> Man kann Elemente hinzufügen, löschen, lesen.
         *
         * Syntax: ArrayList<Datentyp> liste = new ArrayList<>();
         * WICHTIG: Bei ArrayLists müssen wir Wrapper-Klassen verwenden (z.B. Integer statt int).
         */

        // 1. Eine Liste von Strings erstellen
        ArrayList<String> einkaufsliste = new ArrayList<>();

        // 2. Elemente hinzufügen
        einkaufsliste.add("Milch");
        einkaufsliste.add("Brot");
        einkaufsliste.add("Eier");

        // 3. Zugriff auf Elemente per Index
        System.out.println("Erste Element in der Liste: " + einkaufsliste.get(0));

        // 4. Liste komplett ausgeben
        System.out.println(einkaufsliste);

        // 5. Größe einer Liste
        System.out.println("Größer der Einkaufliste: " + einkaufsliste.size());

        // 6. Durchlaufen mit Schleife
        for (int i = 0; i < einkaufsliste.size(); i++) {
            System.out.println((i + 1) + " Element: " + einkaufsliste.get(i));
        }

        // for-each
        for (String produkt : einkaufsliste){
            System.out.println(produkt);
        }

        // 7. Ein Element löschen
        einkaufsliste.remove("Milch");
        System.out.println("Aktualisierte Einkaufsliste: " + einkaufsliste);

        // 8. Ein Element ändern
        einkaufsliste.set(1, "Butter");
        System.out.println("Aktualisierte Einkaufsliste: " + einkaufsliste);

        // 9. Prüfen, ob ein Element in der Liste enthalten ist
        if(einkaufsliste.contains("Butter")){
            System.out.println("Die Butter steht schon auf der Liste");
        } else {
            System.out.println("Die Eier fehlen noch");
        }

        // 10. Index eines Elements ermitteln
        int index = einkaufsliste.indexOf("Butter");
        System.out.println("Index von der Butter: " + index);

        // 11. Prüfen, ob eine Liste leer ist
        System.out.println("Ist die Einkaufsliste leer? " + einkaufsliste.isEmpty());

        // 12. Liste komplett leeren
        einkaufsliste.clear();
        System.out.println("Nach clear(): " + einkaufsliste);

        /*
         * Beispiel mit primitiven Datentypen:
         * ===================================
         * Primitive Datentypen (z.B. int, double, boolean) können NICHT direkt in einer ArrayList gespeichert werden.
         * Stattdessen verwendet man ihre sogenannten Wrapper-Klassen (z.B. Integer, Double, Boolean).
         *
         * -> int  -> Integer
         * -> double -> Double
         * -> boolean -> Boolean
         *
         * Der Grund: ArrayLists können nur Objekte speichern, keine primitiven Werte.
         * Die Autoboxing-Funktion in Java wandelt primitive Werte automatisch in ihre Wrapper-Objekte um.
         */

        // Beispiel: Eine Liste mit Integer-Werten
        ArrayList<Integer> zahlenListe = new ArrayList<>();

        // Elemente hinzufügen (Autoboxing int -> Integer)
        zahlenListe.add(30);
        zahlenListe.add(20);
        zahlenListe.add(10);

        // Element an bestimmter Position einfügen
        System.out.println("Aktuelle Zahlenliste: " + zahlenListe);
        zahlenListe.add(1, 15);         // Wert wird davor eingefügt
        System.out.println("Neue Zahlenliste: " + zahlenListe);

        // Liste sortieren
        ArrayList<Integer> kopierteListe = zahlenListe;
        Collections.sort(zahlenListe);
        System.out.println("Sortierte Zahlenliste (aufsteigend): " + zahlenListe);

        // Liste absteigend sortieren
//        Collections.reverse(zahlenListe);
//        System.out.println("Sortierte Zahlenliste (absteigend): " + zahlenListe);

        Collections.sort(zahlenListe, Comparator.reverseOrder());
        System.out.println("Sortierte Zahlenliste (absteigend): " + zahlenListe);
    }
}