package Aufgabe;

public class Aufgabe {

    public static void main(String[] args) {

        double zahl = 3.5;
        long big = 12345678901234L; // inti astigi icin L gerekli
        float pi = 3.1415f;
        char c = 'A';
        final int MAX = 10;
        //MAX = 5;
        System.out.println("Zahl: " + zahl);
        System.out.println("Big: " + big);
        System.out.println("Pi: " + pi);
        System.out.println("Zeichen: " + c);
        System.out.println("Maximum: " + MAX);


        System.out.println(" ********************************** ");

        String name ="Mahmut";
        String nachName ="Ugurlu";
        char nameAnfangsbuchstaben= 'M';
        char nachNameAnfangsbuchstaben= 'U';

        System.out.println("Mein Vorname ist " + name + " und beginnt mit " + nameAnfangsbuchstaben );
        System.out.println("Mein Nachname ist " + nachName + " und beginnt mit " + nachNameAnfangsbuchstaben );



        System.out.println(" ********************************** ");


        String a = "Hallo";
        String b = "Welt";
        String aq1 =" ";

        System.out.println("Vorher: a = " +a + " b= " + b );


        aq1=a ;
        a = b ;

        b = aq1  ;

        System.out.println("Nachher: a = " +a + " b= " + b );


        System.out.println(" ********************************** ");

        int aq = 25;

        double f = aq*1.8 +32;

        System.out.println(f);


        System.out.println(" ********************************** ");


        int min = 135;
        int s = 60;

        int stunde = min / s;

        int zeit = min % s ;

        System.out.println(stunde + " Stunden und " + zeit + " Minuten ");


        System.out.println(" ********************************** ");


        final double PI = 3.1415;
        int r = 5;
        double flache = PI * r * r ;
        System.out.printf("%.4f\n ", flache);

        double umfang = PI * r * 2 ;
        System.out.printf("%.4f", umfang);


        System.out.println(" ********************************** ");

        char startZeichen = 'F';
        System.out.println(startZeichen);
        startZeichen++;
        char nachFolger = startZeichen;
        System.out.println(nachFolger);

        startZeichen--;
        startZeichen--;
        char vorgänger = startZeichen;
        System.out.println(vorgänger);


        System.out.println(" ********************************** ");


        int ganzZahl = 2748;

        int ziffer1 = ganzZahl/1000;
        int ziffer2 = (ganzZahl/100)%10;
        int ziffer3 = (ganzZahl/10)%10;
        int ziffer4 =  ganzZahl%10;

        int querSumme  = ziffer1+ ziffer2 + ziffer3 + ziffer4;


        System.out.printf(
                "Zahl: %d%nZiffer 1: %d%nZiffer 2: %d%nZiffer 3: %d%nZiffer 4: %d%nQuersumme: %d%n",
                ganzZahl, ziffer1, ziffer2, ziffer3, ziffer4, querSumme
        );








    }

}
